package Mobile;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mobile m1 = new Mobile("Lihan", "01999896668", "IOS", 100, true);
        m1.showInfo();
        m1.callSomeone(1);//phone is locked that's why it will not count but alert to unlock
        m1.callSomeone(102);

        sc.close();
    }
}
