import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word;
        int option;
        boolean flag=false;
        
        while(true){
        System.out.println("1.Check Spelling");
        System.out.println("2.Exit");
        option = sc.nextInt();
        if(option==1)
        {
            System.out.println("Enter Your Word:");
            sc.nextLine();
            word = sc.nextLine();
            for(int i=0;i<word.length();i++)
            {
                if(word.charAt(i)>='0' && word.charAt(i)<='9')
                {
                    flag=true;
                }
            }
            
        }
        if(option==2)
        {
            System.out.println("Thank You For Using :)");
            System.out.println("Exiting.....");
            break;
        }
        if(option!= 2 || option !=1)
        {
            System.out.println("Invalid Option");
        }
        if(flag)
                {
                    System.out.println("Only Letter Are Accepted");
                }
        else{
            System.out.println("Good Word");
        }
        }
        
        sc.close();
    }
}
