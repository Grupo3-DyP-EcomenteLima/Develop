public class Product {
    private String brand;
    private String p_name;
    private double price;
    private int quantity;
    private String desc;
    private int stock;

    public Product(String p_name, String brand, double price, int quantity, String desc, int stock) {
        this.p_name = p_name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.desc = desc;
        this.stock = stock;
    }

    public double getPrice() {return price;}
    public int getQuantity() {return quantity;}
    public int getStock() {return stock;}
    public String getBrand() {return brand;}
    public String getDesc() {return desc;}
    public String getp_name() {return p_name;}

    public void setQuantity(int quantity) {this.quantity = quantity;}
    public void setDesc(String desc) {this.desc = desc;}
    public void setPrice(double price) {this.price = price;}
    public void setStock(int stock) {this.stock = stock;}

    public void setp_name(String p_name) {this.p_name = p_name;}


}
