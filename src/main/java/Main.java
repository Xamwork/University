public class Main {
    public static void main(String[] args) {
        University university=new University("1","СПБГУ","СПбГУ",1724,StudyProfile.INFORMATICS);
        Student student=new Student("Иванов Иван Иванович","1",1,4.5f);
        System.out.println(university);
        System.out.println(student);
    }
}
