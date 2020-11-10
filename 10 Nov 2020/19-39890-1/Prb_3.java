import java.util.Scanner;

public class Prb_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your 1st Sentence Or String:");
        String inputStr1 = sc.nextLine();

        System.out.print("Enter Your 2nd Sentence Or String:");
        String inputStr2 = sc.nextLine();
        
        System.out.print("\n"+"Want To Add Of Your Given Sentences??"+"\n"+"Then Enter Type(yes/no):");
        char option = sc.nextLine().charAt(0);
        if(option == 'y'|| option == 'Y')
        {
            System.out.println("After Adding Your Sentences"+inputStr1.concat(inputStr2));
        }
        else{System.out.println("Exiting....");}

        sc.close();
    }
}
