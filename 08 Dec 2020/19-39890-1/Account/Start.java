package Account;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account ac1 = new Account();
        Account ac2 = new Account("ABCD", "5220-78466", 0);

        System.out.println("Enter Your Name:");
        String accName = sc.nextLine();
        ac1.setAccName(accName);
        System.out.println("Enter Your Id:");
        String accId = sc.nextLine();
        ac1.setAccId(accId);
        ac1.deposite(100000);
        ac1.display();
        ac1.transfer(50000, ac2);
        ac1.display();
        ac2.display();

        sc.close();
    }
}
