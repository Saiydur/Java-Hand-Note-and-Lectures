public class Car {
    private String name,color,model,ownerName;
    private Double yearOfUse;

    /* Default Constructor  */
    public Car(){System.out.println("Empty Constructor");}

    /* Perameteraised Constructor */
    public Car(String name,String color,String model,String ownerName, Double yearOfUse)
    {
        this.name=name;
        this.color=color;
        this.model=model;
        this.ownerName=ownerName;
        this.yearOfUse=yearOfUse;
    }

    //Showing Method
    public void showInfo(){
        System.out.println("Name of Car: "+name);
        System.out.println("Car Colour: "+color);
        System.out.println("Car Model: "+model);
        System.out.println("Car Owner Name: "+ownerName);
        System.out.println("Year Of Use This Car: "+yearOfUse);
    }

    //main
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.showInfo();

        Car car2 = new Car("Nissan", "Blue", "GTR", "Saiydur", 5.0);
        car2.showInfo();
    }
}
