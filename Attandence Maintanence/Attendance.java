import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Student
{
    private String Student_id;
    private String Names;
    private String ClassName;
    private String Section;
    private boolean isAvailable;
    public Student(String Student_id,String Names,String ClassName,String Section)
    {
        this.Student_id = Student_id;
        this.Names = Names;
        this.ClassName = ClassName;
        this.Section = Section;
        this.isAvailable = true;
    }
    // GETTERS 
    public String getStudent_ID()
    {
        return Student_id;
    }
    public String getNames()
    {
        return Names;
    }
    public String getClassName()
    {
        return ClassName;
    }
    public String getSection()
    {
        return Section;
    }
    public boolean isAvailable()
    {
        return isAvailable;
    }
    public void markAttendance(boolean present) 
    {
    isAvailable = present;
    }
}
class College 
{
    private String college_id;
    public College(String college_id)
    {
        this.college_id = college_id;;
    }
    public String getCollege_ID()
    {
        return college_id;
    }
    public void menu()
    {
        try (Scanner sc = new Scanner(System.in)) {
            while(true)
            {
                System.out.println("===COLLEGE ATTANDENCE SYSTEM===");
                System.out.println("Enter the college id:");
            }
        }
    }
}
public class Attendance
{
    public static void main(String a[])
    {
        College college_id = new College("U190001");
        System.out.println("College ID : "+college_id.getCollege_ID());
        List<Student> students = new ArrayList<>();
        Student Student1 = new Student("U19001","Bharath","BCA","A");
        System.out.println("--------------------");
        Student Student2 = new Student("U19002","John","BBA","B");
        Student Student3 = new Student("U19003","KIRAN","BCA","B");
        Student Student4 = new Student("U19004","NAVIN","B.COM","C");
        students.add(Student1);
        students.add(Student2);
        students.add(Student3);
        students.add(Student4);

        try (
        Scanner scanner = new Scanner(System.in)) {
            for (Student student : students) {
                System.out.println("Is " + student.getNames() + " present? (true/false):");
                boolean present = scanner.nextBoolean();
                student.markAttendance(present);
            }
        }
        for(Student student : students)
        {
            System.out.println("Student 1 ID : "+student.getStudent_ID());
            System.out.print("--------------------");
            System.out.println("Student name : "+student.getNames());
            System.out.print("--------------------");
            System.out.println("Class name : "+student.getClassName());
            System.out.print("--------------------");
            System.out.println("Section : "+student.getSection());
            System.out.print("--------------------");
            System.out.println("Student available : "+(student.isAvailable()? "present" : "absent"));
        }   
    }
}
