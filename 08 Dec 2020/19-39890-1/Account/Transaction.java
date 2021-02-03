package Account;

public class Transaction {
    private Account sender;
    private Account receiver;
    private int amount;
    private Transaction[] listOfTransactions;
    private int totalNumberOfTransaction;


    //default constructor
    public Transaction(){}

    //Perameteraised Constructor
    public Transaction(int totalNumberOfTransaction)
    {
        listOfTransactions = new Transaction[totalNumberOfTransaction];
        this.totalNumberOfTransaction=totalNumberOfTransaction;
    }

    //setter and getter method
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void setListOfTransactions(Transaction[] listOfTransactions) {
        this.listOfTransactions = listOfTransactions;
    }
    public void setReceiver(Account receiver) {
        this.receiver = receiver;
    }
    public void setSender(Account sender) {
        this.sender = sender;
    }
    public void setTotalNumberOfTransaction(int totalNumberOfTransaction) {
        this.totalNumberOfTransaction = totalNumberOfTransaction;
    }
    public int getAmount() {
        return amount;
    }
    public Transaction[] getListOfTransactions() {
        return listOfTransactions;
    }
    public Account getReceiver() {
        return receiver;
    }
    public Account getSender() {
        return sender;
    }
    public int getTotalNumberOfTransaction() {
        return totalNumberOfTransaction;
    }

    //adding transaction
    /* public void addTransaction(Account sender,Account receiver,int amount)
    {
        int flag=-1;
        for(int)
    } */
}
