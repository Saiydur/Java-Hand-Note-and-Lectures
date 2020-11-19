import java.util.Scanner;

public class DriveHistory{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double milesDriven,gallonUsed,milesTotal=0,gallonsTotal=0;

        System.out.println("1.Start");
        System.out.println("2.Exit");
        int option = sc.nextInt();
        while(true)
        {
            if(option==1)
            {
                System.out.println("Enter Miles Driven (-1 to Exit):");
                milesDriven = sc.nextDouble();
                System.out.println("Enter Gallons Used");
                gallonUsed = sc.nextDouble();

                milesTotal +=milesDriven;
                gallonsTotal +=gallonUsed;

                System.out.println("Miles Per Gallon This Trip:" +(milesDriven/gallonUsed));
                System.out.println("Total Miles Per Gallon:"+(milesTotal/gallonsTotal));
            }
            else if(option==2)
            {
                System.out.println("Exiting....");
                break;
            }
        }

        sc.close();
    }
}