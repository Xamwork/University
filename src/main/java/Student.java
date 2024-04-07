public class Student {
    String fullName;
    String universityId;
    int currentCourseNumber;
    float avgExamScore;

    public String getFullName() {
        return fullName;
    }

    public String getUniversityId() {
        return universityId;
    }


    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }


    public float getAvgExamScore() {
        return avgExamScore;
    }

    public static class Builder {
        private Student newStudent;

        public Builder() {
            newStudent = new Student();
        }

        public Builder setFullName(String fullName) {
            newStudent.fullName = fullName;
            return this;
        }

        public Builder setUniversityId(String universityId) {
            newStudent.universityId = universityId;
            return this;
        }

        public Builder setCurrentCourseNumber(int currentCourseNumber) {
            newStudent.currentCourseNumber = currentCourseNumber;
            return this;
        }

        public Builder setAvgExamScore(float avgExamScore) {
            newStudent.avgExamScore = avgExamScore;
            return this;
        }

        public Student build() {
            return newStudent;
        }
    }


    public Student () {
        this.fullName="";
        this.universityId="";
        this.currentCourseNumber=1;
        this.avgExamScore=0;
    }

    public Student(String fullName, String universityId, int currentCourseNumber, float avgExamScore) {
        this.fullName = fullName;
        this.universityId = universityId;
        this.currentCourseNumber = currentCourseNumber;
        this.avgExamScore = avgExamScore;
    }

    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", universityId='" + universityId + '\'' +
                ", currentCourseNumber=" + currentCourseNumber +
                ", avgExamScore=" + avgExamScore +
                '}';
    }
}
