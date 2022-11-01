package Buyer;

public class Receipt extends BuyerAbs{
    private String date;
    private String time;
    private double total = 0;

    public void set() {
        this.date = date;
        this.time = time;
    }
    public String getDate() {
        return date;
    }
    public String getTime() {
        return time;
    }
    public double total() {
        return total + Produc.price;
    }

    public void printReceipt(){
        System.out.println(getDate());
        System.out.println(getTime());
        System.out.println(total());
    }
    public void printAdvice(){
        /*
        random advice...
        * */
        System.out.println("Cuida tu ciudad");
    }
    public void sendToEmail(){
        System.out.println("Tu compra...");
    }
}
