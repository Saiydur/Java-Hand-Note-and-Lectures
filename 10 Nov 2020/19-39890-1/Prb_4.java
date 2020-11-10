import java.util.Scanner;

public class Prb_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Sentence Or String:");
        String inputStr1 = sc.nextLine();

        System.out.print("\n"+"Want To Reverse Your Given Sentence??"+"\n"+"Then Enter Type(yes/no):");
        char option = sc.nextLine().charAt(0);
        if(option == 'y'|| option == 'Y')
        {
            StringBuilder str = new StringBuilder();
            str.append(inputStr1);
            System.out.println("After Reversing:"+str.reverse());
        }
        else{System.out.println("Exiting....");}

        sc.close();
    }
}
