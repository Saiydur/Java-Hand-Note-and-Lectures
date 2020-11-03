public class Human{
    private String name,color,dateOfBirth;
    private Double height,weight,age;

    /*Default Constructor*/
    public Human(){
        System.out.println("Default Constructor Called");
    }

    /* Perameteraized Constructor */
    public Human(String name,String dateOfBirth,Double age)
    {
        System.out.println("\n"+"Perameteraized Constuctor Called");
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.age=age;
    }
    
    /*Setting and Getting Method*/
    
    //Name
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    //Color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //Date Of Birth
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    //Height
    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }

    //Weight
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    //Age
    public Double getAge() {
        return age;
    }
    public void setAge(Double age) {
        this.age = age;
    }

    //Showing Method Or Function 
    public void showInfo()
    {
        System.out.println("Name: "+ getName());
        System.out.println("Age:"+ getAge());
        System.out.println("Date of Birth: "+ getDateOfBirth());
        System.out.println("Color: "+getColor());
        System.out.println("Height: "+ getHeight());
        System.out.println("Weight: "+ getWeight());
    }

    //Main Method
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setName("Saiydur");
        h1.setAge(22.0);
        h1.setDateOfBirth("28-August-1999");
        h1.setColor("Dark");
        h1.setHeight(5.2);
        h1.setWeight(76.0);
        h1.showInfo();

        /*Making object with Perameter Constructor*/
        Human h2 = new Human("Saiydur","28August" ,22.0);
        h2.showInfo();

    }

}