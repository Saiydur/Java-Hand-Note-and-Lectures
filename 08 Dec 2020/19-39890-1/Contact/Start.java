package Contact;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Contact c1 = new Contact();
        Contact c2 = new Contact("Lihan", "19-39890-1", 19, "01999896668", 'M');

        System.out.println("Enter Your Name");
        String personName = sc.nextLine();
        System.out.println("Enter Your Id");
        String personId = sc.nextLine();
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your Mobile Number");
        String mobileNumber = sc.nextLine();
        System.out.println("Enter Your Sex(M/F)");
        char gender = sc.nextLine().charAt(0);
        c1.setPersonName(personName);
        c1.setPersonId(personId);
        c1.setAge(age);
        c1.setMobileNumber(mobileNumber);
        c1.setGender(gender);
        /* c1.showPersonInfo();
        c1.detectMobileOperator();
        c2.showPersonInfo();
        c2.detectMobileOperator(); */

        Address_Book ab1 = new Address_Book("Lihan", "76/D,Meradia", 5000);
        ab1.addContact(c1);
        ab1.addContact(c2);
        ab1.showAllContactInfo();


        sc.close();
    }
}
