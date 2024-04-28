package enums;

public enum UniversityVariantsComparator {
    UNIVERSITY_ID ("ID университета"),
    UNIVERSITY_FULL_NAME ("Полное название университета"),
    UNIVERSITY_SHORT_NAME ("Краткое название университета"),
    UNIVERSITY_YEAR_OF_FOUNDATION ("Год основания университета"),
    UNIVERSITY_STUDY_PROFILE ("Профиль университета");

    private String comparatorName;

    UniversityVariantsComparator(String s) {
        this.comparatorName = s;
    }
}
