package universityComparators;

import models.University;

public class UniversityStudyProfileComparator implements UniversityComparator{
    public int compare(University o1, University o2) {
        return o1.getMainProfile().compareTo(o2.getMainProfile());
    }
}
