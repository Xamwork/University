package enums;

public enum StudentsVariantsComparator {
    STUDENT_FULL_NAME("По ФИО"),
    STUDENT_UNIVERSITY_ID ("По идентификатору университета"),
    STUDENT_CURRENT_COURSE_NUMBER("По номеру курса"),
    STUDENT_AVERAGE_MARK("По среднему баллу");

    private final String description;

    StudentsVariantsComparator(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
