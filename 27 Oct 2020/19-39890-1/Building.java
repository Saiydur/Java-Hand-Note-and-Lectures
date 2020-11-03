public class Building {
    private String name,address,ownerName,engineerName,permitNo,licenseNo;
    private Double size;

    /* Default Consturctor */
    public Building(){System.out.println("Empty Constructor");}

    /* Perametaraised Constructor */
    public Building(String name,String address,String ownerName,String engineerName,String permitNo, String licenseNo, Double size)
    {
        this.name=name;
        this.address=address;
        this.ownerName=ownerName;
        this.engineerName=engineerName;
        this.permitNo=permitNo;
        this.licenseNo=licenseNo;
        this.size=size;
    }

    //Display Method
    public void showInfo()
    {
        System.out.println("House Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Owner Name: "+ownerName);
        System.out.println("Engineer Name: "+engineerName);
        System.out.println("Permit Number: "+permitNo);
        System.out.println("License Number: "+licenseNo);
        System.out.println("Size Of House: "+size);
    }

    //main
    public static void main(String[] args) {
        Building building1 = new Building();
        building1.showInfo();

        //Perameteraised Constructor
        Building building2 = new Building("ShopnoChura", "In Dream", "Saiydur", "Rahman", "100-20000", "1-0000-100", 50000.00);
        building2.showInfo();
    }
}
