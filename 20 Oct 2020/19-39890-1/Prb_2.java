import java.util.Scanner;

public class Prb_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double num1,num2;
        System.out.println("Enter Your First Number:");
        num1=sc.nextDouble();
        System.out.println("Enter Your Second Number");
        num2=sc.nextDouble();
        Double Sum = num1+num2;
        System.out.println("Sum Of Two Number Is:"+ Sum);
        sc.close();
    }
}
