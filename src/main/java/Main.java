import enums.StudentsVariantsComparator;
import models.Student;
import models.University;
import studentComparators.StudentComparator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {

        List<Student> studentsDataStorage = new ArrayList<>(io.XlsReader.readXlsStudents("src/main/java/universityInfo.xlsx"));

        StudentComparator studentFullName = UnitedComparator.getStudentComparator(StudentsVariantsComparator.STUDENT_FULL_NAME);

        studentsDataStorage.stream()
                .sorted(studentFullName)
                .forEach(System.out::println);
    }
}
