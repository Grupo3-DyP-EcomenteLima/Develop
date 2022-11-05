package pe.edu.upc.UsuarioHerencia;

public class Seller extends User{

    private String brand;
    private long bankAccount;

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public long getBankAccount(){
        return bankAccount;
    }
    public void setBankAccount(long bankAccount){
        this.bankAccount = bankAccount;
    }
    public void addProduct(){
        System.out.println("Producto anadido");
    }
    public void deleteProduct(){
        System.out.println("Producto eliminado");
    }
    public void modProduct(){
        System.out.println("Producto modificado");
    }
}
