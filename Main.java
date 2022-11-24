import UsuarioBuilder.*;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Catalog c = new Catalog();

        String p_name, brand, desc;
        double price;
        int quantity, stock;
        Scanner cin = new Scanner(System.in);

        System.out.println("**Prueba creacion de producto\n\n");

        System.out.println("Ingrese nombre del producto");
        p_name = cin.nextLine();
        System.out.println("Ingrese marca asociada");
        brand = cin.nextLine();
        System.out.println("Ingrese precio por venta");
        price = cin.nextDouble();
        System.out.println("ingrese cantidad en unidades por venta");
        quantity = cin.nextInt();
        System.out.println("Ingrese Descripcion del producto");
        desc = cin.nextLine();
        System.out.println("Ingrese stock actual en venta del producto");
        stock = cin.nextInt();

        Product p = new Product(p_name, brand, price, quantity, desc, stock);

        c.addproduct(p);
        c.printcatalog();
    }

}