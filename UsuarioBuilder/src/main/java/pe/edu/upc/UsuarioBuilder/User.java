package pe.edu.upc.UsuarioBuilder;

public class User {
    private String fullName;
    public String email;
    public String password;
    private long bankAccount;
    private String brand;
    public User(){
        fullName = null;
        email = null;
        password = null;
        bankAccount = 0;
        brand = null;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setBankAccount(long bankAccount){
        this.bankAccount = bankAccount;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getFullName(){
        return this.fullName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }
    public long getBankAccount(){
       return bankAccount;
    }
    public String getBrand(){
        return brand;
    }

    public void addProduct() {
        System.out.println("Producto agregado");
    }
    public void deleteProduct() {
        System.out.println("Producto eliminado");
    }
    public void modProduct() {
        System.out.println("Producto modificado");
    }
    public void mostrardatos(){
        System.out.println("Nombre: "+fullName);
        System.out.println("Marca: "+brand);
        System.out.println("Correo: "+email);
        System.out.println("Cuenta bancaria: "+bankAccount);
    }
}
