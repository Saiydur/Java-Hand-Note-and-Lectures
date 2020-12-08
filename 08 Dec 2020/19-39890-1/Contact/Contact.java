package Contact;

public class Contact {
    private String personName;
    private String personId;
    private int age;
    private String mobileNumber;
    private char gender;

    //Default or Empty Constructor
    public Contact()
    {
        personName="";
        personId="";
        age=0;
        mobileNumber="";
        gender=' ';
    }

    //Perameteraised Constructor 
    public Contact(String personName,String personId,int age,String mobileNumber,char gender)
    {
        this.personName=personName;
        this.personId=personId;
        this.age=age;
        this.mobileNumber=mobileNumber;
        this.gender=gender;
    }

    //setter getter Method
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public void setPersonId(String personId) {
        this.personId = personId;
    }
    public void setPersonName(String personName) {
        this.personName = personName;
    }
    public int getAge() {
        return age;
    }
    public char getGender() {
        return gender;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public String getPersonId() {
        return personId;
    }
    public String getPersonName() {
        return personName;
    }

    //checking mobile operator
    public void detectMobileOperator()
    {
        String mobileNumber = getMobileNumber();
        if(mobileNumber.charAt(0)=='0' && mobileNumber.charAt(1)=='1' && mobileNumber.charAt(2)=='9')
        {
            System.out.println("Your Mobile Operator Is Banglalink");
        }
        else if(mobileNumber.charAt(0)=='0' && mobileNumber.charAt(1)=='1' && mobileNumber.charAt(2)=='7')
        {
            System.out.println("Your Mobile Operator Is GrameenPhone");
        }
        else if(mobileNumber.charAt(0)=='0' && mobileNumber.charAt(1)=='1' && mobileNumber.charAt(2)=='8')
        {
            System.out.println("Your Mobile Operator Is Robi");
        }
        else if(mobileNumber.charAt(0)=='0' && mobileNumber.charAt(1)=='1' && mobileNumber.charAt(2)=='6')
        {
            System.out.println("Your Mobile Operator Is Airtel");
        }
        else if(mobileNumber.charAt(0)=='0' && mobileNumber.charAt(1)=='1' && mobileNumber.charAt(2)=='5')
        {
            System.out.println("Your Mobile Operator Is TeleTalk");
        }
        else{System.out.println("Your Mobile Operator Is Not In List");}
    }

    //Showing Information
    public void showPersonInfo()
    {
        System.out.println("------Person Details------");
        System.out.println("Name:"+getPersonName());
        System.out.println("Id:"+getPersonId());
        System.out.println("Age:"+getAge());
        System.out.println("Mobile Number:"+getMobileNumber());
        System.out.println("Sex:"+getGender());
    }
}
