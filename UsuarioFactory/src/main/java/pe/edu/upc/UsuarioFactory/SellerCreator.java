package pe.edu.upc.UsuarioFactory;

public class SellerCreator extends Creator{

    @Override
    public User crearUser(){
        return new Seller();
    }


}
