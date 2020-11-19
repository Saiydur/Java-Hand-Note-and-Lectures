import java.util.Scanner;

public class Prb_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer amount;
        Integer note1k=0,note500=0,note100=0,note50=0,note20=0,note10=0,note5=0,note2=0,note1=0;
        System.out.println("Enter Your Amount:");
        amount=sc.nextInt();

        while(amount!=0)
        {
            if(amount>=1000)
            {
                note1k=amount/1000;
                amount=amount-note1k*1000;
            }
            if(amount>=500)
            {
                note500=amount/500;
                amount=amount-note500*500;
            }
            if(amount>=100)
            {
                note100=amount/100;
                amount=amount-note100*100;
            }
            if(amount>=50)
            {
                note50=amount/50;
                amount=amount-note50*50;
            }
            if(amount>=20)
            {
                note20=amount/50;
                amount=amount-note20*20;
            }
            if(amount>=10)
            {
                note10=amount/10;
                amount=amount-note10*10;
            }
            if(amount>=5)
            {
                note5=amount/5;
                amount=amount-note5*5;
            }
            if(amount>=2)
            {
                note2=amount/2;
                amount=amount-note2*2;
            }
            if(amount>=1)
            {
                note1=amount/1;
                amount=amount-note1*1;
            }
        }

        System.out.println("Number Of 1000 Taka "+note1k+" piece");
        System.out.println("Number Of 500 Taka "+note500+" piece");
        System.out.println("Number Of 100 Taka "+note100+" piece");
        System.out.println("Number Of 50 Taka "+note50+" piece");
        System.out.println("Number Of 20 Taka "+note20+" piece");
        System.out.println("Number Of 10 Taka "+note10+" piece");
        System.out.println("Number Of 5 Taka "+note5+" piece");
        System.out.println("Number Of 2 Taka "+note2+" piece");
        System.out.println("Number Of 1 Taka "+note1+" piece");

        sc.close();
    }
}
