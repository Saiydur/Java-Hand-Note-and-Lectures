import java.util.Scanner;

public class Problem2 {
        private String productName;
        private String productId;
        private Integer productQty;
        private Integer totalProduct=0;
        private Double productPrice;
        private Double totalProductPrice=0.00;
    
        public Problem2(String productName,String productId,Integer productQty,Double productPrice)
        {
            this.productName=productName;
            this.productId=productId;
            this.productQty=productQty;
            this.productPrice=productPrice;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }
        public String getProductId() {
            return productId;
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
        public void setTotalProduct(Integer totalProduct,Double productPrice) {
            this.totalProduct += totalProduct;
            this.productPrice = productPrice;
            Double multiplyProduct= totalProduct*productPrice;
            setTotalProductPrice(multiplyProduct);

        }
        public Integer getTotalProduct() {
            return totalProduct;
        }
        public void setTotalProductPrice(Double totalProductPrice) {
            this.totalProductPrice += totalProductPrice;
        }
        public Double getTotalProductPrice() {
            return totalProductPrice;
        }
        public void addInv(String productName,Integer productQty,Double productPrice)
        {
            this.productName=productName;
            setTotalProduct(productQty,productPrice);
        }

        public void showInfo()
        {
            System.out.println("Product Name:"+ productName);
            System.out.println("Product Id:"+ productId);
            System.out.println("Product Quantity:"+ productQty);
            System.out.println("Product Price:"+ productPrice);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Your Product Name:");
            String pd1Name = sc.nextLine();
            System.out.println("Enter Your Product Id:");
            String pd1Id = sc.nextLine();
            System.out.println("Enter Your Product Product Quantity:");
            Integer pd1Qty = sc.nextInt();
            System.out.println("Enter Your Product Price:");
            Double pd1Price = sc.nextDouble();

            Problem2 pd1 =  new Problem2(pd1Name, pd1Id, pd1Qty, pd1Price);

            pd1.showInfo();

            System.out.println("Enter Product Name Which One You Want Add:");
            sc.nextLine();
            String invPdName = sc.nextLine();
            System.out.println("Enter Product Price:");
            Double invPdPrice = sc.nextDouble();
            System.out.println("Enter Product Quantity:");
            Integer invPdQty = sc.nextInt();

            pd1.addInv(invPdName, invPdQty, invPdPrice);
            pd1.addInv("choco", 5, 10.0);
            

            System.out.println("Show How Many Product:"+pd1.getTotalProduct());
            System.out.println("Show Total Price:"+pd1.getTotalProductPrice());

            sc.close();
        }
}
