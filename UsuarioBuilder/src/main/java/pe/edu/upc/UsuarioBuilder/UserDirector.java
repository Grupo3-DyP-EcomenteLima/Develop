package pe.edu.upc.UsuarioBuilder;

public class UserDirector {
    private UserBuilder sellerBuilder;
    public void construct(UserBuilder constructor){
        sellerBuilder = constructor;
        sellerBuilder.pedirdatos();
    }

}
