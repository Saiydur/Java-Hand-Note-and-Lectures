import java.util.Scanner;

public class Prb_1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer monthNo;
        System.out.println("Enter Your Month Number:");
        monthNo=sc.nextInt();

        switch(monthNo){
            case 1:
            System.out.println("Month Is January Total Day 31");
            break;
            case 2:
            System.out.println("Month Is February Total Day 28");
            break;
            case 3:
            System.out.println("Month Is March Total Day 31");
            break;
            case 4:
            System.out.println("Month Is April Total Day 30");
            break;
            case 5:
            System.out.println("Month Is May Total Day 31");
            break;
            case 6:
            System.out.println("Month Is June Total Day 30");
            break;
            case 7:
            System.out.println("Month Is July Total Day 31");
            break;
            case 8:
            System.out.println("Month Is August Total Day 31");
            break;
            case 9:
            System.out.println("Month Is September Total Day 30");
            break;
            case 10:
            System.out.println("Month Is October Total Day 31");
            break;
            case 11:
            System.out.println("Month Is November Total Day 30");
            break;
            case 12:
            System.out.println("Month Is December Total Day 31");
            break;
            default:
            System.out.println("Error In Your Input");
            break;

        }

        sc.close();
    }
}