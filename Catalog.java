import java.util.Scanner;

public class Catalog {

    public Scanner cin = new Scanner(System.in);
    private Product catalogo[];

    public Catalog (){ // constructor
        catalogo = new Product[9];
    } // numero de posibles productos en el catalogo actual por definición de variable

    public void Print_product(Product p){
        System.out.println(p.getp_name()+" \n");
        System.out.println("Marca: "+p.getBrand());
        System.out.println("Stock: "+p.getStock()+" \n");
        System.out.println(p.getDesc()+" \n");
        System.out.println("Cantidad por compra: "+p.getQuantity()+" Unidades \n");
        System.out.println("Precio: $"+p.getPrice()+" \n");
    }

    public void printcatalog(){
        for(int i = 0; i <catalogo.length; i++){
            if(catalogo[i] != null) { Print_product(catalogo[i]); }
        }
    }

    public Product getProducto(String name) {
        Product temp = null;
        for (int i = 0; i < catalogo.length; i++) {
            if (catalogo[i].getp_name() == name) {
                temp = new Product(catalogo[i].getp_name(), catalogo[i].getBrand(), catalogo[i].getPrice(),
                        catalogo[i].getQuantity(), catalogo[i].getDesc(), catalogo[i].getStock());
                break;
            }
        }
        return temp;
    }

    public void modProduct(String name){
        double price;
        int quantity;
        String desc;
        int stock;

        for (int i = 0; i < catalogo.length; i++) {
            if (catalogo[i].getp_name() == name) { //product to modify found in catalog
                System.out.println("Ingrese nuevo precio: ");
                price = cin.nextDouble();
                catalogo[i].setPrice(price);
                System.out.println("Ingrese nueva cantidad: ");
                quantity = cin.nextInt();
                catalogo[i].setQuantity(quantity);
                System.out.println("Ingrese nueva descripción: ");
                desc = cin.nextLine();
                catalogo[i].setDesc(desc);
                System.out.println("Ingrese nuevo stock: ");
                stock = cin.nextInt();
                catalogo[i].setStock(stock);

                System.out.println("Información del producto modificada en el catalogo.");
                break;
            }
        }
    }

    public void addproduct(Product p){
        for(int i = 0; i <catalogo.length; i++){
            if(catalogo[i] == null ) {
                catalogo[i] = p;
                break;
            }
        }
    }

}
