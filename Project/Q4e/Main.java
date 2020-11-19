import java.util.Scanner;

public class Main {
    static Courses[] courses;
    static Student[] student;
    static CourseList c1 = new CourseList();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Admin Panel*/
        //Adding Courses
        System.out.println("How Many Courses Want To Add");
        int courseList = sc.nextInt();
        courses = new Courses[courseList];
        for(int i=0;i<courseList;i++)
        {
            courses[i]= new Courses(i+1);
            c1.setCourseList(courses[i]);
        }
        
        
        //Showing Courses
        for(int i=0;i<courseList;i++)
        {
            courses[i].showInfo();
        }

        /*Student Panel*/
        //Adding Student
        System.out.println("Create Student");
        for(int i=0;i<student.length;i++)
        {
            student[i]=new Student();
        }
        
        //Showing Student
        for(int i=0;i<student.length;i++)
        {
            student[i].showStudentDetails();
        }
        //Regestration
        System.out.println("Here Your Offered Course");
        for(int i=0;i<courseList;i++)
        {
            courses[i].showInfo();
        }
        System.out.println("How Many Courses Want To Take??");
        String courseTake = sc.nextLine();
        if(courseTake.charAt(0)!='5')
        {
            System.out.println("You Cannot Take More Then 5 Courses");
        }
        else
        {
            System.out.println("Enter Your Courses Name:");
            String[] nameOfTakenCourse = new String[5];
            for(int i=0;i<nameOfTakenCourse.length;i++)
            {
                nameOfTakenCourse[i]=sc.nextLine();
            }
            for(int i=0;i<student.length;i++)
            {
                
            }
        }
        sc.close();
    }
}
