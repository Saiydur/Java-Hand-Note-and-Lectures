import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option;
        double sale,comission,earn;

        while(true)
        {
            System.out.println("1.Start");
            System.out.println("2.Exit");
            option = sc.nextInt();
            if(option==1)
            {
                System.out.println("Enter Sales In BDT:");
                sale = sc.nextDouble();
                comission=sale/100*9; //9percent
                earn = comission + 200;
                System.out.println("Salary Is :"+earn+"BDT");
            }
            else if(option==2)
            {
                System.out.println("Exiting...");
                break;
            }
            else{System.out.println("Invaid Option"+"\n"+"Enter Again");}
            
        }

        sc.close();
    }
}