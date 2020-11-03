import java.util.Scanner;

public class Prb_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Integer number;
        System.out.println("Enter The Number");
        number=sc.nextInt();
        Integer m=1;

        for(int i=1;i<=10;i++){
            for(int j=0;j<5;j++)
            {
                System.out.print(number*m+" ");
                m++;
            }
            System.out.println();
        }

        sc.close();
    }
}
