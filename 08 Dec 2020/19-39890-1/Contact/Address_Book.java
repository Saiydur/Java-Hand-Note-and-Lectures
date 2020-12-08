package Contact;

public class Address_Book {
    private String ownerName;
    private String info;
    private Contact[] listOfContact;
    private int totalContact;

    //default or empty Constructor
    public Address_Book(){}

    //Perameteraised Constructor
    public Address_Book(String ownerName,String info,int totalContact)
    {
        this.ownerName=ownerName;
        this.info=info;
        this.totalContact=totalContact;
        listOfContact = new Contact[totalContact];
    }

    //setter and getter method
    public void setInfo(String info) {
        this.info = info;
    }
    public void setListOfContact(Contact[] listOfContact) {
        this.listOfContact = listOfContact;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void setTotalContact(int totalContact) {
        this.totalContact = totalContact;
    }
    public String getInfo() {
        return info;
    }
    public Contact[] getListOfContact() {
        return listOfContact;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public int getTotalContact() {
        return totalContact;
    }

    //add Contact
    public void addContact(Contact con)
    {
        int count=0;
        boolean flag=false;
        for(int i=0;i<listOfContact.length;i++)
        {
            if(listOfContact[i]==null)
            {
                listOfContact[i]=con;
                count=i+1;
                flag=true;
                break;
            }
        }
        if(flag){System.out.println("No."+count+" Contact Added");}
        else{System.out.println("Contact Not Added");}
    }

    //display all Contact
    public void showAllContactInfo()
    {
        System.out.println("---------Contact Details---------");
        for(Contact c : listOfContact)
        {
            if(c !=null)
            {
                c.showPersonInfo();
                System.out.println("Owner Name:"+getOwnerName());
                System.out.println("Owner Info:"+getInfo()); 
                System.out.println("--------------------------");
            }
        }
    }
}
