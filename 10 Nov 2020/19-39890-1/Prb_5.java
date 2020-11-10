import java.util.Scanner;

public class Prb_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your 1st Sentence Or String:");
        String inputStr1 = sc.nextLine();

        System.out.print("Enter Your 2nd Sentence Or String:");
        String inputStr2 = sc.nextLine();
        
        System.out.print("\n"+"Want To Add Your Given Sentences??"+"\n"+"Then Enter Type(yes/no):");
        char option = sc.nextLine().charAt(0);
        if(option == 'y'|| option == 'Y')
        {
            StringBuffer str = new StringBuffer();
            str.append(inputStr1+" "+inputStr2);
            System.out.println(str);
        }
        else{System.out.println("Exiting....");}

        sc.close();
    }
}
