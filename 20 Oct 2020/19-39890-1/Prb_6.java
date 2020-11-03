import java.util.Scanner;

public class Prb_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double Width,Height,Area,Perimeter;
        System.out.println("Enter Your Rectangle Width:");
        Width=sc.nextDouble();
        System.out.println("Enter Your Rectangle Height:");
        Height=sc.nextDouble();

        Area = Width * Height;
        Perimeter = 2 * (Width+Height);

        System.out.println("Area Of Rectangle: "+Width+" * "+Height+" = "+String.format("%.2f", Area));
        System.out.println("Perimeter Of Rectangle: "+Width+" * "+Height+" = "+String.format("%.2f", Perimeter));

        sc.close();
    }
}
