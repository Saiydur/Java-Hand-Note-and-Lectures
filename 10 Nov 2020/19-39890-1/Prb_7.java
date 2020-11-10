import java.util.Scanner;

public class Prb_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Phone Number:");
        String numInput =  sc.nextLine();

        char[] ch = numInput.toCharArray();

        if(ch[0]=='0' && ch[1]=='1' && ch[2]=='6')
        {
            System.out.println("Your Sim Operator is Airtel");
        }
        else if(ch[0]=='0' && ch[1]=='1' && ch[2]=='7')
        {
            System.out.println("Your Sim Operator is Gramenphone");
        }
        else if(ch[0]=='0' && ch[1]=='1' && ch[2]=='8')
        {
            System.out.println("Your Sim Operator is Robi");
        }
        else if(ch[0]=='0' && ch[1]=='1' && ch[2]=='9')
        {
            System.out.println("Your Sim Operator is Banglalink");
        }
        else if(ch[0]=='0' && ch[1]=='1' && ch[2]=='5')
        {
            System.out.println("Your Sim Operator is Teletalk");
        }


        sc.close();
    }
}
