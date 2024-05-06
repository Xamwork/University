import com.google.gson.GsonBuilder;
import models.Student;
import models.University;

import java.lang.reflect.Array;
import java.util.List;

public class JsonUtil {
    public static String studentToJson(Student student) {
        return new GsonBuilder().setPrettyPrinting().create().toJson(student);
    }

    public static String universityToJson(University university) {
        return new GsonBuilder().setPrettyPrinting().create().toJson(university);
    }

    public static String collectionStudentToJson (List<Student> listStudent) {
        return new GsonBuilder().setPrettyPrinting().create().toJson(listStudent);
    }

    public static String collectionUniversityToJson (List<University> listUniversity) {
        return new GsonBuilder().setPrettyPrinting().create().toJson(listUniversity);
    }

    public static Student jsonToStudent(String json) {
        return new GsonBuilder().setPrettyPrinting().create().fromJson(json, Student.class);
    }

    public static University jsonToUniversity(String json) {
        return new GsonBuilder().setPrettyPrinting().create().fromJson(json, University.class);
    }

    public static List<Student> jsonToCollectionStudent(String json) {
        return new GsonBuilder().setPrettyPrinting().create().fromJson(json, List.class);
    }

    public static List<University> jsonToCollectionUniversity(String json) {
        return new GsonBuilder().setPrettyPrinting().create().fromJson(json, List.class);
    }
}
