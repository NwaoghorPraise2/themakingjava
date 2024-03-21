package Learning;
class Student {
    int rollno;
    String name;
    int marks;
}
public class Array {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "James";
        s1.marks = 10;
        s1.rollno = 56;

        Student s2 = new Student();
        s2.name = "Praise";
        s2.marks = 10;
        s2.rollno = 34;

        Student s3 = new Student();
        s3.name = "Love";
        s3.marks = 10;
        s3.rollno = 4;

        Student []students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student student : students) {
            System.out.println(STR."\{student.name} \{student.marks}");
        }

    }
}
