import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How Many Managers You Have??");
        int managers = sc.nextInt();
        System.out.println("Enter Monthly Salary For One Person:");
        double managersSalaray = sc.nextDouble();
        Manager M1 = new Manager(managersSalaray, managers);

        System.out.println("How Many Officers You Have??");
        int officers = sc.nextInt();
        System.out.println("Enter Monthly Salary For One Person:");
        double officersSalaray = sc.nextDouble();
        Officer O1 = new Officer(officersSalaray, officers);

        System.out.println("How Many Admins You Have??");
        int admins = sc.nextInt();
        System.out.println("Enter Monthly Salary For One Person:");
        double adminsSalaray = sc.nextDouble();
        Admin A1 = new Admin(adminsSalaray, admins);

        System.out.println("How Many Salesman You Have??");
        int salesman = sc.nextInt();
        System.out.println("Enter Monthly Salary For One Person:");
        double salesmansSalaray = sc.nextDouble();
        Salesman S1 = new Salesman(salesmansSalaray, salesman);

        System.out.println("Want To Show Total Yearly Salary Of All Employees(yes/no):");
        sc.nextLine();
        String option = sc.nextLine();

        if(option.charAt(0)=='y' || option.charAt(0)=='Y')
        {
            System.out.println("-------------------------------------------");
            M1.showManagersYearlySalary();
            O1.showOfficersYearlySalary();
            A1.showAdminsYearlySalary();
            S1.showSalesmansYearlySalary();
            double totalAmount = M1.calculateManagersYearlySalary() + O1.calculateOfficersYearlySalary() + A1.calculateAdminsYearlySalary() 
            + S1.calculateSalesmansYearlySalary();
            System.out.println("Total Yearly Salary Of All Employe is:"+totalAmount);  
        }
        else if(option.charAt(0)=='n' || option.charAt(0)=='N'){
            System.out.println("Thank You For Using....");
        }
        else{
            System.out.println("Wrong Input Program Terminated.....");
        }

        sc.close();
    }
}
