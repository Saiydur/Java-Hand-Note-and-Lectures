import java.util.Scanner;

public class Prb_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Double side1,side2,side3;
        System.out.println("Enter Your Triangle 1st Side:");
        side1=sc.nextDouble();
        System.out.println("Enter Your Triangle 2nd Side:");
        side2=sc.nextDouble();
        System.out.println("Enter Your Triangle 3rd Side:");
        side3=sc.nextDouble();

        if(side1==0 || side2 ==0 || side3==0)
        {
            System.out.println("Triangle is not Valid");
        }
        else if(side1==side2 && side2==side3)
        {
            System.out.println("Equilateral Triangle");
        }
        else if(side1==side2 || side1==side3 || side2==side3)
        {
            System.out.println("Isosceles Triangle");
        }
        else{
            System.out.println("Scalene Triangle");
        }


        sc.close();
    }
}
