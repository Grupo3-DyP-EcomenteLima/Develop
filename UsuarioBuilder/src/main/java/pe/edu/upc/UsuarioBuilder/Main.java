package pe.edu.upc.UsuarioBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("**Prueba user builder**");

        UserDirector director = new UserDirector();

        SellerBuilder seller = new SellerConcreteBuilder();

        List<SellerConcreteBuilder> listaSeller;

        director.construct(seller);
        User u1 = seller.getUser();



    }
}