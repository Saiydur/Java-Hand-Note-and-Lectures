public class Dog {
    private String name,color;
    private Double height,weight;

    /*Default Constructor*/
    public Dog(){
        System.out.println("Default Constructor Called");
    }

    /* Perameteraized Constructor */
    public Dog(String name,String color,Double weight,Double height)
    {
        System.out.println("\n"+"Perameteraized Constuctor Called");
        this.name=name;
        this.color=color;
        this.weight=weight;
        this.height=height;
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

    //Showing Method Or Function 
    public void showInfo()
    {
        System.out.println("Name: "+ getName());
        System.out.println("Color: "+getColor());
        System.out.println("Height: "+ getHeight());
        System.out.println("Weight: "+ getWeight());
    }

    //Main Method
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("Husky");
        d1.setColor("White");
        d1.setHeight(1.2);
        d1.setWeight(8.0);
        d1.showInfo();

        /*Making object with Perameter Constructor*/
        Dog d2 = new Dog("Husky","White" ,7.0,2.5);
        d2.showInfo();

    }
}
