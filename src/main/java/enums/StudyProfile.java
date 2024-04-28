package enums;

public enum StudyProfile {
    PHYSICS("Физика"),
    COMPUTER_SCIENCE("Информатика"),
    MATHEMATICS("Математика"),
    JURISPRUDENCE("Юриспруденция"),
    MEDICINE("Медицина"),
    LINGUISTICS("Лингвистика");
    private String profileName;

    StudyProfile(String s) {
        this.profileName = s;
    }

    public String getProfileName() {
        return profileName;
    }
}
