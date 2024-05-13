import enums.StudentsVariantsComparator;
import enums.UniversityVariantsComparator;
import models.Statistics;
import models.Student;
import models.University;
import studentComparators.StudentComparator;
import universityComparators.UniversityComparator;
import java.io.IOException;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());


    public static void main(String[] args) throws IOException  {

        try {
            LogManager.getLogManager().readConfiguration(Main.class.getResourceAsStream("src/main/java/logging.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }

        logger.log(INFO, "Application started, Logger configured");

        List<University> universities =
                io.XlsReader.readXlsUniversities("/java/universityInfo.xlsx");
        UniversityComparator universityComparator =
                UnitedComparator.getUniversityComparator(UniversityVariantsComparator.UNIVERSITY_YEAR_OF_FOUNDATION);
        universities.sort(universityComparator);
        String universitiesJson = JsonUtil.collectionUniversityToJson(universities);
        // проверяем, что json создан успешно
        System.out.println(universitiesJson);
        List<University> universitiesFromJson = JsonUtil.jsonToCollectionUniversity(universitiesJson);
        // проверяем, что обратно коллекция воссоздаётся в таком же количестве элементов
        System.out.println(universities.size() == universitiesFromJson.size());
        universities.forEach(university -> {
            String universityJson = JsonUtil.universityToJson(university);
            // проверяем, что json из отдельного элемента создан успешно
            System.out.println(universityJson);
            University universityFromJson = JsonUtil.jsonToUniversity(universityJson);
            // проверяем, что обратно элемент воссоздаётся
            System.out.println(universityFromJson);
        });

        List<Student> students =
                io.XlsReader.readXlsStudents("/java/universityInfo.xlsx");
        StudentComparator studentComparator =
                UnitedComparator.getStudentComparator(StudentsVariantsComparator.STUDENT_AVERAGE_MARK);
        students.sort(studentComparator);
        String studentsJson = JsonUtil.collectionStudentToJson(students);
        // проверяем, что json создан успешно
        System.out.println(studentsJson);
        List<Student> studentsFromJson = JsonUtil.jsonToCollectionStudent(studentsJson);
        // проверяем, что обратно коллекция воссоздаётся в таком же количестве элементов
        System.out.println(students.size() == studentsFromJson.size());
        students.forEach(student -> {
            String studentJson = JsonUtil.studentToJson(student);
            // проверяем, что json из отдельного элемента создан успешно
            System.out.println(studentJson);
            Student studentFromJson = JsonUtil.jsonToStudent(studentJson);
            // проверяем, что обратно элемент воссоздаётся
            System.out.println(studentFromJson);
        });

        List<Statistics> statisticsList = UtilStat.createStatistics(students, universities);
        XlsWriter.writeXlsStatistics(statisticsList, "src/main/java/statistics.xlsx");

        logger.log(INFO, "Application finished");

    }
}
