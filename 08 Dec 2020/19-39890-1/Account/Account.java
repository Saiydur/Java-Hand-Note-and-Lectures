package Account;

public class Account {
    private String accName;
    private String accId;
    private int balance;

    //Default or Empty Constructor
    public Account()
    {
        //By Default All Are Empty
        accName="";
        accId="";
        balance=0;
    }

    //Perameteraised Constructor
    public Account(String accName,String accId,int balance)
    {
        this.accName=accName;
        this.accId=accId;
        this.balance=balance;
    }

    //setter and getter method
    public void setAccId(String accId) {
        this.accId = accId;
    }
    public void setAccName(String accName) {
        this.accName = accName;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getAccId() {
        return accId;
    }
    public String getAccName() {
        return accName;
    }
    public int getBalance() {
        return balance;
    }
    
    //For Deposite Money
    public void deposite(int amount)
    {
        balance+=amount;
        System.out.println(amount+" Deposited Successfully");
        System.out.println("Present Balance Is:"+getBalance());
    }

    //For Withdraw Money
    public void withdraw(int amount)
    {
        balance-=amount;
        System.out.println(amount+" Withdraw SuccessFully");
        System.out.println("Present Balance Is:"+getBalance());
    }

    //Transfer Amount To Another Account
    public void transfer(Account reciver,int amount)
    {
        if(amount>0 && amount<=balance)
        {
            System.out.println("Previous Balance:"+this.balance);
            System.out.println("Transfer Amount:"+amount);
            this.balance-=amount;
            reciver.balance+=amount;
            System.out.println("Current Balance:"+this.balance);

        }
        else
        {
            System.out.println("Can Not Transfer");
        }
    }

    //display information
    public void display()
    {
        System.out.println("------Account Details------");
        System.out.println("Name:"+getAccName());
        System.out.println("Id:"+getAccId());
        System.out.println("Balance:"+getBalance());
        System.out.println("---------------------------");
    }
}
