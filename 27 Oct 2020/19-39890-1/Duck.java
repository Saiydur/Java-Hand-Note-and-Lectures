public class Duck {
    private String name,color;
    private Double height,weight;

    /*Default Constructor*/
    public Duck(){
        System.out.println("Default Constructor Called");
    }

    /* Perameteraized Constructor */
    public Duck(String name,String color,Double weight)
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
        Duck dd1 = new Duck();
        dd1.setName("Duck");
        dd1.setColor("Black");
        dd1.setHeight(1.0);
        dd1.setWeight(2.5);
        dd1.showInfo();

        /*Making object with Perameter Constructor*/
        Duck dd2 = new Duck("Duck","Black" ,2.5);
        dd2.showInfo();

    }
}
