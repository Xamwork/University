import enums.StudentsVariantsComparator;
import enums.UniversityVariantsComparator;
import studentComparators.*;
import universityComparators.*;

public class UnitedComparator {
    public static StudentComparator getStudentComparator(StudentsVariantsComparator comparatorType) {
        switch (comparatorType) {
            case STUDENT_FULL_NAME:
                return new StudentFullNameComparator();
            case STUDENT_UNIVERSITY_ID:
                return new StudentUniversityIdComparator();
            case STUDENT_CURRENT_COURSE_NUMBER:
                return new StudentCurrentCourseNumberComparator();
            case STUDENT_AVERAGE_MARK:
                return new StudentAvgExamScoreComparator();
            default:
                throw new IllegalArgumentException("Unknown comparator type: " + comparatorType);
        }
    }

    public static UniversityComparator getUniversityComparator(UniversityVariantsComparator comparatorType) {
        switch (comparatorType) {
            case UNIVERSITY_ID:
                return new UniversityIdComparator();
            case UNIVERSITY_FULL_NAME:
                return new UniversityFullNameComparator();
            case UNIVERSITY_SHORT_NAME:
                return new UniversityShortNameComparator();
            case UNIVERSITY_YEAR_OF_FOUNDATION:
                return new UniversityYearOfFoundationComparator();
            case UNIVERSITY_STUDY_PROFILE:
                return new UniversityStudyProfileComparator();
            default:
                throw new IllegalArgumentException("Unknown comparator type: " + comparatorType);
        }
    }
}
