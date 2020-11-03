import java.util.Scanner;

public class Prb_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer option;
        Double input;
        System.out.println("Enter Your Option:");
        System.out.println("1.Fahrenheit To Celsius");
        System.out.println("2.Celsius To Fahrenheit");
        option=sc.nextInt();

        switch(option)
        {
            case 1:

            System.out.println("Enter Temperature in Fahrenheit:");
            input=sc.nextDouble();

            System.out.println("In Celsius That is:"+(5.0/9.0*(input-32.0)));

            break;

            case 2:
            System.out.println("Enter Temperature in Celsius:");
            input=sc.nextDouble();

            System.out.println("In Fahrenheit That is:"+(9.0/50.*(input+32.0)));
            break;
        }
    }
}
