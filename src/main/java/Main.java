import enums.StudentsVariantsComparator;
import enums.UniversityVariantsComparator;
import io.JsonWriter;
import io.XlsReader;
import io.XlsWriter;
import io.XmlWriter;
import models.FullInfo;
import models.Statistics;
import models.Student;
import models.University;
import studentComparators.StudentComparator;
import universityComparators.UniversityComparator;
import util.UtilStat;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {

        try {
            LogManager.getLogManager().readConfiguration(
                    Main.class.getResourceAsStream("/logging.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }

        logger.log(INFO, "Application started, Logger configured");

        List<University> universities =
                XlsReader.readXlsUniversities("src/main/java/universityInfo.xlsx");
        UniversityComparator universityComparator =
                UnitedComparator.getUniversityComparator(UniversityVariantsComparator.UNIVERSITY_YEAR_OF_FOUNDATION);
        universities.sort(universityComparator);

        List<Student> students =
                XlsReader.readXlsStudents("src/main/java/universityInfo.xlsx");
        StudentComparator studentComparator =
                UnitedComparator.getStudentComparator(StudentsVariantsComparator.STUDENT_AVERAGE_MARK);
        students.sort(studentComparator);

        List<Statistics> statisticsList = UtilStat.createStatistics(students, universities);
        XlsWriter.writeXlsStatistics(statisticsList, "statistics.xlsx");

        FullInfo fullInfo = new FullInfo()
                .setStudentList(students)
                .setUniversityList(universities)
                .setStatisticsList(statisticsList)
                .setProcessDate(new Date());

        XmlWriter.generateXmlReq(fullInfo);
        JsonWriter.writeJsonReq(fullInfo);

        logger.log(INFO, "Application finished");
    }
}