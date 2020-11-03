import java.util.Scanner;

public class Prb_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double num1,num2,Sum,Multiply,Subtract,Divide,Remainder;
        System.out.println("Enter Your First Number:");
        num1=sc.nextDouble();
        System.out.println("Enter Your Second Number");
        num2=sc.nextDouble();
        Sum = num1+num2;
        Multiply = num1*num2;
        Subtract = num1-num2;
        Divide = num1/num2;
        Remainder = num1%num2;
        System.out.println("Sum Of Your Number is:"+Sum);
        System.out.println("Multiply Of Your Number is:"+Multiply);
        System.out.println("Subtract Of Your Number is:"+Subtract);
        System.out.println("Divide Of Your Number is:"+Divide);
        System.out.println("Remainder Of Your Number is:"+Remainder);
        sc.close();
    }
}
