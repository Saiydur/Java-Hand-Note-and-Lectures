import java.util.Scanner;

public class Prb_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double num1,num2;
        System.out.println("Enter Your First Number:");
        num1=sc.nextDouble();
        System.out.println("Enter Your Second Number");
        num2=sc.nextDouble();
        Double Div = num1/num2;
        System.out.println("Divition Of Two Number Is:"+ Div);
        sc.close();
    }
}
