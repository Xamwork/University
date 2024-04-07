public class University {
    String id;
    String fullName;
    String shortName;
    int yearOfFoundation;
    StudyProfile mainProfile;

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getShortName() {
        return shortName;
    }


    public int getYearOfFoundation() {
        return yearOfFoundation;
    }


    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    private static class Builder {
        private University newUniversity;

        public Builder() {
            newUniversity = new University();
        }

        public Builder setId(String id) {
            newUniversity.id = id;
            return this;
        }

        public Builder setFullName(String fullName) {
            newUniversity.fullName = fullName;
            return this;
        }

        public Builder setShortName(String shortName) {
            newUniversity.shortName = shortName;
            return this;
        }

        public Builder setYearOfFoundation(int yearOfFoundation) {
            newUniversity.yearOfFoundation = yearOfFoundation;
            return this;
        }

        public Builder setMainProfile(StudyProfile mainProfile) {
            newUniversity.mainProfile = mainProfile;
            return this;
        }

        public University build() {
            return newUniversity;
        }
    }

    public University() {
        this.id = "";
        this.fullName = "";
        this.shortName = "";
        this.yearOfFoundation = 0;
    }
    public University(String id, String fullName, String shortName, int yearOfFoundation, StudyProfile mainProfile) {
        this.id = id;
        this.fullName = fullName;
        this.shortName = shortName;
        this.yearOfFoundation = yearOfFoundation;
        this.mainProfile = mainProfile;
    }

    public String toString() {
        return "University{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                ", mainProfile=" + mainProfile +
                '}';
    }

}
