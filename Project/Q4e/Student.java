import java.util.Scanner;

public class Student {
    private String name;
    private String department;
    private String contactNum;
    private String emailId;
    private CourseList courseList;
    public Student()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        this.name=sc.nextLine();
        System.out.println("Enter Your Department:");
        this.department=sc.nextLine();
        System.out.println("Enter Your Contact Number:");
        this.contactNum=sc.nextLine();
        System.out.println("Enter Your Email Id:");
        this.emailId=sc.nextLine();

        sc.close();
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getEmailId() {
        return emailId;
    }
    public String getContactNum() {
        return contactNum;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public void setCourseList(CourseList courseList) {
        this.courseList = courseList;
    }
    public CourseList getCourseList() {
        return this.courseList;
    }
    public void showStudentDetails()
    {
        System.out.println("*************************************");
        System.out.println("Student Name:"+getName());
        System.out.println("Department:"+getDepartment());
        System.out.println("Contact Number:"+getContactNum());
        System.out.println("Email Id:"+getEmailId());
        System.out.println("*************************************");
    }
    public void showCourses()
    {
        courseList.getCourseList();
    }
}
