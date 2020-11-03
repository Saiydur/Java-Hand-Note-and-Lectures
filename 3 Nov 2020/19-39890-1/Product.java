import java.util.Scanner;

public class Product {
    private String productName;
    private Integer productQty;
    private Double productPrice;

    public Product()
    {
        //Remove Slash If You Want To See Is It Working Or Not
        //System.out.println("Empty Constructor");
    }

    public Product(String productName,Integer productQty,Double productPrice)
    {
        this.productName=productName;
        this.productQty=productQty;
        this.productPrice=productPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }
    public Double getProductPrice() {
        return productPrice;
    }
    public void setProductQty(Integer productQty) {
        this.productQty = productQty;
    }
    public Integer getProductQty() {
        return productQty;
    }

    public void showInfo()
    {
        System.out.println("Product Name:"+productName);
        System.out.println("Product Quantity:"+productQty);
        System.out.println("Product Price:"+productPrice);
    }

    public Double calculate()
    {
        Double totalPrice = productQty*productPrice;

        return totalPrice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product pd1 = new Product();
        System.out.println("Enter Your Product Name:");
        String pd1Name = sc.nextLine();
        pd1.setProductName(pd1Name);
        System.out.println("Enter Your Product Quantity:");
        Integer pd1Qty = sc.nextInt();
        pd1.setProductQty(pd1Qty);
        System.out.println("Enter Your Product Price:");
        Double pd1Price = sc.nextDouble();
        pd1.setProductPrice(pd1Price);
        System.out.println("Product Details");
        pd1.showInfo();
        System.out.println("Total Price is "+pd1.calculate()+"Taka Only");

        System.out.println("Enter Your 2nd Product Name:");
        sc.nextLine();
        String pd2Name = sc.nextLine();
        System.out.println("Enter Your 2nd Product Quantity:");
        Integer pd2Qty = sc.nextInt();
        System.out.println("Enter Your 2nd Product Price:");
        Double pd2Price = sc.nextDouble();

        Product pd2 = new Product(pd2Name, pd2Qty, pd2Price);
        System.out.println("Product Details");
        pd2.showInfo();
        System.out.println("Total Price is "+pd2.calculate()+"Taka Only");


        sc.close();
    }
}
