package pe.edu.upc.UsuarioBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    static Scanner op = new Scanner(System.in);
    static Scanner correo = new Scanner(System.in);
    static Scanner contrasena = new Scanner(System.in);

    public static void main(String[] args) throws IOException, InterruptedException {
        List<User> usuarios = new ArrayList<>();
        int opcion=0;
        do{
            System.out.println("**Prueba user builder**");
            System.out.println("1. Registrar cuenta vendedor");
            System.out.println("2. Mostrar vendedores registrados");
            System.out.println("3. Salir");
            opcion = op.nextInt();
            switch (opcion) {
                case 1:
                    UserDirector director = new UserDirector();
                    UserBuilder seller = new SellerConcreteBuilder();
                    director.construct(seller);
                    User u1 = seller.getUser();
                    usuarios.add(u1);
                    break;
                case 2:

                    System.out.println("Ingresa tu correo registrado: ");
                    String co = correo.nextLine();
                    System.out.println("Ingresa tu contrasena: ");
                    String con = contrasena.nextLine();

                    for(User obj: usuarios){
                        System.out.println("***********");
                       obj.mostrardatos();
                    }


                    break;
            }


        }while (opcion !=3);


    }
}