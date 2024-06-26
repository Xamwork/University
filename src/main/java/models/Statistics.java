package models;

import enums.StudyProfile;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
public class Statistics {

    @XmlElement(name = "universityProfile")
    private StudyProfile profile;

    @XmlElement(name = "averageExamScore")
    private float avgExamScore;

    @XmlTransient
    private int numberOfStudents;

    @XmlTransient
    private int numberOfUniversities;

    @XmlTransient
    private String universityNames;

    public Statistics(StudyProfile profile, float avgExamScore, int nubmerOfStudents, int numberOfUniversities, String universityNames) {
        this.profile = profile;
        this.avgExamScore = avgExamScore;
        this.numberOfStudents = nubmerOfStudents;
        this.numberOfUniversities = numberOfUniversities;
        this.universityNames = universityNames;
    }

    public Statistics() {
    }

    public StudyProfile getProfile() {
        return profile;
    }

    public void setProfile(StudyProfile profile) {
        this.profile = profile;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumberOfUniversities() {
        return numberOfUniversities;
    }

    public void setNumberOfUniversities(int numberOfUniversities) {
        this.numberOfUniversities = numberOfUniversities;
    }

    public String getUniversityNames() {
        return universityNames;
    }

    public void setUniversityNames(String universityNames) {
        this.universityNames = universityNames;
    }
}
