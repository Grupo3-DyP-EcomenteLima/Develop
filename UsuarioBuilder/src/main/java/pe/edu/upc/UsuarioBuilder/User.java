package pe.edu.upc.UsuarioBuilder;


//1
public class User {

    private String fullName;
    private String email;
    private String password;

    public User(){

        fullName = null;
        email = null;
        password = null;
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

    public String getFullName(){
        return this.fullName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }
}
