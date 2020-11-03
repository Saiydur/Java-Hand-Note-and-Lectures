import java.util.Scanner;

public class Student{

    private String name;
    private String id;
    private String department;
    private Float cgpa;

    public Student()
    {
        //Remove Slash If You Want To See Is It Working Or Not
        //System.out.println("Empty Constructor");
    }

    public Student(String name,String id,String department,Float cgpa)
    {
        this.name=name;
        this.id=id;
        this.department=department;
        this.cgpa=cgpa;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    public void setCgpa(Float cgpa) {
        this.cgpa = cgpa;
    }
    public Float getCgpa() {
        return cgpa;
    }

    public void showInfo()
    {
        System.out.println("Student Name: "+ name);
        System.out.println("Student Id: "+ id);
        System.out.println("Department: "+department);
        System.out.println("CGPA: "+cgpa);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //st = Student
        String stName,stId,stDept;
        Float stCgpa;

        Student st1 = new Student();

        System.out.println("Enter Student Name:");
        stName=sc.nextLine();
        st1.setName(stName);
        System.out.println("Enter Student Id:");
        stId=sc.nextLine();
        st1.setId(stId);
        System.out.println("Enter Student Department:");
        stDept=sc.nextLine();
        st1.setDepartment(stDept);
        System.out.println("Enter Student CGPA:");
        stCgpa=sc.nextFloat();
        st1.setCgpa(stCgpa);

        //Using Perameteraised Constructor We Can Set This Like That
        System.out.println("Enter 2nd Student Name:");
        sc.nextLine();
        String stName2=sc.nextLine();
        System.out.println("Enter 2nd Student Id:");
        String stId2=sc.nextLine();
        System.out.println("Enter 2nd Student Department:");
        String stDept2=sc.nextLine();
        System.out.println("Enter 2nd Student CGPA:");
        Float stCgpa2=sc.nextFloat();

        Student st2 = new Student(stName2, stId2, stDept2, stCgpa2);
        
        System.out.println("Want To Display Student Info??(Y/N):");
        char option = sc.next().charAt(0);
        if(option == 'Y' || option == 'y')
        {
            st1.showInfo();
            st2.showInfo();
        }
        else
        {
            System.out.println("Thank You");
        }

        sc.close();
    }
}