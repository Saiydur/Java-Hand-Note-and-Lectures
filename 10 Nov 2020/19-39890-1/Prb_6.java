import java.util.Scanner;

public class Prb_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Email:");
        String emailInput =  sc.nextLine();

        boolean flag = false;

        char[] ch=emailInput.toCharArray();

        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i] == '.' || ch[i] == '@')
            {
                flag=true;
            }
        }

        if(flag)
        {
            System.out.println("Valid Email");
        }
        else{System.out.println("Invalid Email");}


        sc.close();
    }
}
