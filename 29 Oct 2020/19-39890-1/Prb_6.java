import java.util.Scanner;

public class Prb_6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any caracter : ");
        char ch = sc.next().charAt(0);

        // Using character class
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println(ch + " is A ALPHABET.");

       } else if(ch >= '0' && ch <= '9') {

            System.out.println(ch + " is A DIGIT.");

       } else {

            System.out.println(ch + " is A SPECIAL CHARACTER.");
       }

        sc.close();
    }
}
