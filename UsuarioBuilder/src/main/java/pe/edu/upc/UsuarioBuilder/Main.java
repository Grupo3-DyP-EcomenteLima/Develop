package pe.edu.upc.UsuarioBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("**Prueba user builder**");

        System.out.println("**  Registrar vendedor  **");

        UserDirector director = new UserDirector();

        UserBuilder seller = new SellerConcreteBuilder();

        director.construct(seller);
        User u1 = seller.getUser();

        System.out.println("**  Mostrar vendedor **");
        u1.mostrardatos();

    }
}