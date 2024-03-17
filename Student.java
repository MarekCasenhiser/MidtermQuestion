import java.util.*;
public class Student {
    private int grade;
    private String name;
    private double id; 
    public Student(String name, double id, int grade){
        this.name = name;
        this.grade = grade;
        this.id = id;
    }
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Devin", 1.5, 90);
        Student s2 = new Student("Marek", 2.3, 89);
        Student s3 = new Student("Josh", 2.5, 80);
        ArrayList<Student> classGroup = new ArrayList<Student>();
        classGroup.add(s1);
        classGroup.add(s2);
        classGroup.add(s3);

        int gradeCount = 0;
        for(Student i: classGroup){
            System.out.println(i.getGrade());
            gradeCount += i.getGrade();
        }
        System.out.println(gradeCount / 3);

    }
    public int getGrade(){
        return grade;
    }
    
}
