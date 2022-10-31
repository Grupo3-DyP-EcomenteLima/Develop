public class Product {
    private String brand;
    private String p_name;
    private double price;
    private int quantity;
    private String desc;
    private int stock;

    //Product(){ String p_name = ""; String brand = ""; double price = 0.0; ... ){

   // }

    public double getPrice() {return price;}
    public int getQuantity() {return quantity;}
    public int getStock() {return stock;}
    public String getBrand() {return brand;}
    public String getDesc() {return desc;}
    public String getp_name() {return p_name;}

    public void setDesc(String desc) {this.desc = desc;}
    public void setPrice(float price) {this.price = price;}
    public void setStock(int stock) {this.stock = stock;}
    public void setp_name(String p_name) {this.p_name = p_name;}

    public void Print_product(){
        System.out.println(p_name);
        System.out.println("Marca: "+brand);
        System.out.println("Stock: "+stock);
        System.out.println(desc);
        System.out.println("Cantidad por compra: "+quantity+" Unidades");
        System.out.println("Precio: $"+price);
        System.out.println(" ");
    }

    public void set_product(){

    }
}
