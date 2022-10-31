package pe.edu.upc.UsuarioFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("*** PRUEBA USER ***");

        Creator creador;
        creador = new SellerCreator();
        User vendedor = creador.crearUser();

        vendedor.setFullName("Juan");
        vendedor.setEmail("juan@gmail.com");
        vendedor.setPassword("juan1234");

        System.out.println(vendedor.getFullName());
        System.out.println(vendedor.getEmail());
        System.out.println(vendedor.getPassword());

        
    }
}