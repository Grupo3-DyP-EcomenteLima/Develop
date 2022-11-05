package pe.edu.upc.UsuarioBuilder;


//2
public interface SellerBuilder {

    void setPaymentMethod();
    void addProduct();
    void deleteProduct();
    void modProduct();

    long getBankAccount();
    void setBankAccount(long bankAccount);
    String getBrand();
    void setBrand(String brand);

    User getUser();

}
