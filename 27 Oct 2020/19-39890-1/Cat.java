public class Cat {
    private String name,color;
    private Double height,weight;

    /*Default Constructor*/
    public Cat(){
        System.out.println("Default Constructor Called");
    }

    /* Perameteraized Constructor */
    public Cat(String name,String color,Double weight)
    {
        System.out.println("\n"+"Perameteraized Constuctor Called");
        this.name=name;
        this.color=color;
        this.weight=weight;
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
        Cat c1 = new Cat();
        c1.setName("Luccy");
        c1.setColor("Dark Blue");
        c1.setHeight(1.2);
        c1.setWeight(8.0);
        c1.showInfo();

        /*Making object with Perameter Constructor*/
        Cat c2 = new Cat("Luccy","White" ,7.0);
        c2.showInfo();

    }
}
