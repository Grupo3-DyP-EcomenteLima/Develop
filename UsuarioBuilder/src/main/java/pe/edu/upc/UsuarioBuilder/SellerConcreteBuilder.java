package pe.edu.upc.UsuarioBuilder;

public class SellerConcreteBuilder implements SellerBuilder{

    long bankAccount;
    String brand;

    private User usuario = new User();

    @Override
    public void setPaymentMethod() {
        System.out.println("Metodo agregado");
    }

    @Override
    public void addProduct() {
        System.out.println("Producto agregado");
    }

    @Override
    public void deleteProduct() {
        System.out.println("Producto eliminado");
    }

    @Override
    public void modProduct() {
        System.out.println("Producto modificado");
    }

    @Override
    public long getBankAccount() {
        return bankAccount;
    }

    @Override
    public void setBankAccount(long bankAccount) {
    this.bankAccount=bankAccount;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public User getUser(){
        return usuario;
    }
}
