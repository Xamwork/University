import enums.StudentsVariantsComparator;
import enums.UniversityVariantsComparator;
import models.Student;
import models.University;
import studentComparators.StudentComparator;
import universityComparators.UniversityComparator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {

        List<Student> studentsDataStorage = new ArrayList<>(io.XlsReader.readXlsStudents("src/main/java/universityInfo.xlsx"));
        List<University> universitiesDataStorage = new ArrayList<>(io.XlsReader.readXlsUniversities("src/main/java/universityInfo.xlsx"));

        StudentComparator studentFullName = UnitedComparator.getStudentComparator(StudentsVariantsComparator.STUDENT_FULL_NAME);

        studentsDataStorage.stream()
                .sorted(studentFullName)
                .forEach(System.out::println);

        System.out.println("=====================================");

        UniversityComparator universityFullName = UnitedComparator.getUniversityComparator(UniversityVariantsComparator.UNIVERSITY_FULL_NAME);

        universitiesDataStorage.stream()
                .sorted(universityFullName)
                .forEach(System.out::println);
    }
}
