import java.util.Scanner;

public class Courses{
    private String courseName;
    private String startDate;
    private String instructorName;
    private int courseCredit;
    public Courses()
    {
        System.out.println("Calling Setting And Getting Method");
    }
    public Courses(int i)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+i+" Course Name:");
        this.courseName=sc.nextLine();
        System.out.println("Enter Instructor Name:");
        this.instructorName=sc.nextLine();
        System.out.println("Enter Course Credit:");
        this.courseCredit=sc.nextInt();
        System.out.println("Start Date(Date/Month/Year):");
        sc.nextLine();
        this.startDate=sc.nextLine();
        System.out.println("Course Added");
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }
    public String getCourseName() {
        return courseName;
    }
    public String getStartDate() {
        return startDate;
    }
    public String getInstructorName() {
        return instructorName;
    }
    public int getCourseCredit() {
        return courseCredit;
    }
    public void showInfo()
    {
        System.out.println("*************************************");
        System.out.println("Course Name:"+getCourseName());
        System.out.println("Course Instructor:"+getInstructorName());
        System.out.println("Course Credit:"+getCourseCredit());
        System.out.println("Course Start:"+getStartDate());
        System.out.println("*************************************");
    }

}