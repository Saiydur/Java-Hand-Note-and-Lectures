import java.util.Scanner;

public class Prb_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double physics,chemistry,biology,math,computer;

        System.out.println("Enter Your Physics Number:");
        physics=sc.nextDouble();
        System.out.println("Enter Your Chemistry Number:");
        chemistry=sc.nextDouble();
        System.out.println("Enter Your Biology Number:");
        biology=sc.nextDouble();
        System.out.println("Enter Your Mathmatics Number:");
        math=sc.nextDouble();
        System.out.println("Enter Your Computer Number:");
        computer=sc.nextDouble();

        Double totalPercentage = ((physics+chemistry+biology+math+computer)/500)*100;

        if(totalPercentage>=90)
        {
            System.out.println("Your Grade is  A");
        }
        else if(totalPercentage>=80)
        {
            System.out.println("Your Grade is  B");
        }
        else if(totalPercentage>=70)
        {
            System.out.println("Your Grade is  C");
        }
        else if(totalPercentage>=60)
        {
            System.out.println("Your Grade is  D");
        }
        else if(totalPercentage>=40)
        {
            System.out.println("Your Grade is  E");
        }
        else{
            System.out.println("Your Grade is  F");
        }

    }
}
