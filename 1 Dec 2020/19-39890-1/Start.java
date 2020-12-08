import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        boolean flag = true;
        while(flag)
        {
            System.out.println("Enter Option:");
            System.out.println("1.Person");
            System.out.println("2.Student");
            System.out.println("3.Teacher");
            System.out.println("4.Exit");
            int option = sc.nextInt();
            sc.nextLine();
            switch(option)
            {

                case 1:
                {
                    Person p = new Person();//Creating Person Object
                    p.showPerson();

                    break;
                }

                case 2:
                {
                    Student s = new Student();//Creating Student Object
                    
                    System.out.print("Enter Id:");
                    String id = sc.nextLine();
                    s.setStudentId(id);
                    System.out.print("Enter Admission Date(DD/MM/YY):");
                    String date = sc.nextLine();
                    s.setAdmissionDate(date);
                    s.showStudent();

                    break;
                }

                case 3:
                {
                    Teacher t = new Teacher();
                    System.out.print("Enter Id:");
                    String id = sc.nextLine();
                    t.setEmployeeId(id);
                    System.out.print("Enter Admission Date(DD/MM/YY):");
                    String date = sc.nextLine();
                    t.setJoiningDate(date);
                    t.showTeacher();
                    break;
                }

                case 4:
                {
                    System.out.println("Exiting....");
                    flag = false;
                    break;
                }

                default:
                {
                    System.out.println("Invalid Input");
                    System.out.println("Enter Again...");
                    break;
                }
            }
        }

        sc.close();
    }
}
