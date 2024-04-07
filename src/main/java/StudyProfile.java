public enum StudyProfile {
    MEDICINE ("Медицина"),
    LOGISTICS ("Логистика"),
    INFORMATICS("Информатика"),
    PHYSICS("Физика"),
    MATH("Математика");
    private String profileName;

    StudyProfile(String s) {
        this.profileName = s;
    }
}
