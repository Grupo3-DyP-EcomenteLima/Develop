package pe.edu.upc.UsuarioBuilder;

import java.util.Scanner;

public class SellerConcreteBuilder implements UserBuilder{
    private User usuario = new User();
    Scanner entrada = new Scanner(System.in);
    @Override
    public void pedirdatos() {
        System.out.println("Ingrese su nombre completo: ");
        usuario.setFullName(entrada.nextLine());
        System.out.println("Ingrese su nombre de la marca: ");
        usuario.setBrand(entrada.next());
        System.out.println("Ingrese su cuenta bancaria: ");
        usuario.setBankAccount(entrada.nextLong());
        System.out.println("Ingrese su correo electronico: ");
        usuario.setEmail(entrada.next());
        System.out.println("Ingrese una contraseña: ");
        usuario.setPassword(entrada.next());
    }
    @Override
    public User getUser(){
        return usuario;
    }
}
