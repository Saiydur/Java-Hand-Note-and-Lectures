package Problem2;

public class Product {
        private String productName;
        private String productId;
        private Integer productQty;
        private Double productPrice;
    
        public Product(String productName,String productId,Integer productQty,Double productPrice)
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

}
