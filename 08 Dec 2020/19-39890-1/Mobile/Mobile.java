package Mobile;

import java.util.Scanner;

public class Mobile {
    private String mobileOwnerName;
    private String mobileNumber;
    private String mobileOs;
    private int mobileBalance;
    private boolean lock;

    //default or Empty Constructor
    public Mobile()
    {
        mobileOwnerName="";
        mobileNumber="";
        System.out.println("Enter Your OS Name(Android/IOS)");
        Scanner sc = new Scanner(System.in);
        mobileOs=sc.nextLine();
        sc.close();
        mobileBalance=0;
        lock=true;//by default phone is locked
    }

    //Perameteraised Constructor
    public Mobile(String mobileOwnerName,String mobileNumber,String mobileOs,int bal,boolean lock)
    {
        this.mobileOwnerName=mobileOwnerName;
        this.mobileNumber=mobileNumber;
        this.lock=lock;
        this.mobileOs=mobileOs;
        this.mobileBalance=bal;
    }

    //setter getter method
    public void setLock(boolean lock) {
        this.lock = lock;
    }
    public void setMobileBalance(int mobileBalance) {
        this.mobileBalance = mobileBalance;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public void setMobileOs(String mobileOs) {
        this.mobileOs = mobileOs;
    }
    public void setMobileOwnerName(String mobileOwnerName) {
        this.mobileOwnerName = mobileOwnerName;
    }
    public int getMobileBalance() {
        return mobileBalance;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public String getMobileOs() {
        return mobileOs;
    }
    public String getMobileOwnerName() {
        return mobileOwnerName;
    }
    public boolean getLock()
    {
        return lock;
    }
    //Recharge Amount
    public void recharge(int amount)
    {
        if(getLock() == false)
        {
            mobileBalance+=amount;
            System.out.println("Recharged Successfully");
            System.out.println("After Recharge Your Balance is"+getMobileBalance());
        }
        else{
            System.out.println("Your Phone Is Lock");
            System.out.println("Want To Unlock Your Phone(yes/no)");
            Scanner sc = new Scanner(System.in);
            char option = sc.nextLine().charAt(0);
            sc.close();
            if(option == 'y' || option =='Y')
            {
                setLock(false);
            }
            else{
                setLock(true);
            }
        }
    }

    //Call someone
    public void callSomeone(int duration)
    {
        if(getLock() == false)
        {
            if(mobileBalance>0)
            {
                int totalAmount = 1 * duration;//per min 1taka and duration is in minute
                System.out.println("Your Total Talk Time Is:"+duration+"min");
                System.out.println("Cost is: "+totalAmount);
                mobileBalance-=totalAmount;
                System.out.println("After Calling Your Main Balance Is:"+getMobileBalance()+"TK");
            }
            else
            {
                System.out.println("Your Balance  Is Low"+"\n"+"Recharge Now");
            }
        }
        else{
            System.out.println("Your Phone Is Lock");
            System.out.println("Want To Unlock Your Phone(yes/no)");
            Scanner sc = new Scanner(System.in);
            char option = sc.nextLine().charAt(0);
            sc.close();
            if(option == 'y' || option =='Y')
            {
                setLock(false);
            }
            else{
                setLock(true);
            }
        }

    }

    //diplayInfo
    public void showInfo()
    {
        System.out.println("Mobile Owner Name:"+getMobileOwnerName());
        System.out.println("Mobile Owner Number:"+getMobileNumber());
        System.out.println("Mobile Lock Status:"+getLock());
        System.out.println("Mobile OS Name:"+getMobileOs());
        System.out.println("Mobile Balance:"+getMobileBalance());

    }
}
