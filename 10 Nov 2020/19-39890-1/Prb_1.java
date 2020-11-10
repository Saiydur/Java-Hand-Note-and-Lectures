import java.util.Scanner;

public class Prb_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Sentence Or String:");
        String input = sc.nextLine();
        
        System.out.print("\n"+"Want To Find A Charecter Of Your Given Sentence??"+"\n"+"Then Enter The Indext Number:");
        int index = sc.nextInt();

        System.out.println("\n"+"At "+ index+" Charecter is "+input.charAt(index));

        sc.close();
    }
}