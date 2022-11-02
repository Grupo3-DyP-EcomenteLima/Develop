package pe.edu.upc.UsuarioFactory;

public class Seller implements User{

    //atributos compartidos
    private String fullName;
    private String email;
    private String password;

    //atributos de Seller
    private long bankAccount;
    private String brand;

    //metodos de Seller
    public void setPaymentMethod(){
        System.out.println("Las bicicletas no tienen motor");
    }
    public void addProduct(){
        System.out.println("Producto agregado");
    }
    public void deleteProduct(){
        System.out.println("Producto borrado");
    }
    public void modProduct(){
        System.out.println("Producto modificado");
    }
    public long bankAccount(){
        return bankAccount;
    }
    public String brand(){
        return brand;
    }

    public long getBankAccount(){
        return bankAccount;
    }
    public void setBankAccount(long bankAccount){
        this.bankAccount = bankAccount;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    //metodos compartidos
    @Override
    public String getFullName(){
    return fullName;
    }
    @Override
    public void setFullName(String name){
    this.fullName = name;
    }
    @Override
    public String getEmail(){
    return email;
    }
    @Override
    public void setEmail(String email){
    this.email = email;
    }
    @Override
    public String getPassword(){
        return password;
    }
    @Override
    public void setPassword(String password){
    this.password = password;
    }


}
