import java.util.Scanner;

class Person{
    private String name;
    private String email;
    Scanner sc = new Scanner(System.in);//Creating a default scanner

    //Default Constructor
    public Person()
    { 
        System.out.println("Enter Your Name:");
        this.name= sc.nextLine();
        System.out.println("Enter Your Email:");
        this.email=sc.nextLine();
    }

    //Perameteraised Constructor
    public Person(String name,String email)
    {
        this.name=name;
        this.email=email;
    }


    //Setter & Getter Method
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }


    //Printing Details
    public void showPerson()
    {
        System.out.println("Printing Person----------");
        System.out.println("Name: "+getName());
        System.out.println("Email: "+getEmail());
        System.out.println("-------------------------");
    }
}

class Student extends Person{
    private String studentId;
    private String admissionDate;

    //Default Constructor
    public Student()
    {
        super();//Going Super Class From Subclass It will call Parent Default Constructor
    }

    //Perametaraised Constructor
    public Student(String studentId,String admissonDate)
    {
        this.studentId=studentId;
        this.admissionDate=admissonDate;
    }

    //Setter And Getter Method
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }
    public String getAdmissionDate() {
        return admissionDate;
    }
    public String getStudentId() {
        return studentId;
    }

    //Showing Student Details
    public void showStudent()
    {
        System.out.println("Printing Student----------");
        System.out.println("ID: "+getStudentId());
        System.out.println("Admission Date: "+getAdmissionDate());
        System.out.println("Name: "+super.getName());
        System.out.println("Email: "+super.getEmail());
        System.out.println("-------------------------");
    }

}
class Teacher extends Person{
    private String employeeId;
    private String joiningDate;
    
    public Teacher()
    {
        super();
    }

    public Teacher(String employeeId,String joiningDate)
    {
        this.employeeId=employeeId;
        this.joiningDate=joiningDate;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public String getJoiningDate() {
        return joiningDate;
    }

    //Showing Teacher Details
    public void showTeacher()
    {
        System.out.println("Printing Teacher----------");
        System.out.println("ID: "+getEmployeeId());
        System.out.println("Admission Date: "+getJoiningDate());
        System.out.println("Name: "+super.getName());
        System.out.println("Email: "+super.getEmail());
        System.out.println("-------------------------");
    }

}