import java.util.Scanner;

public class Prb_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Integer input;
        System.out.println("Enter Your Number:");
        input=sc.nextInt();

        if(input%2==0 && input%5==0)
        {
            System.out.println("Your Number Is Divisible By 2 and 5");
        }
        else{
            System.out.println("Your Number Is Not Divisible By 2 and 5");
        }

        sc.close();
    }
}
