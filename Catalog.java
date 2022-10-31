public class Catalog {

    private Product catalogo[] = new Product[3];

    public void printcatalog(){

        for(int i = 0; i <catalogo.length; i++){

            System.out.println(catalogo[i].getp_name());
            System.out.println("Marca: "+catalogo[i].getBrand());
            System.out.println("Stock: "+catalogo[i].getStock());
            System.out.println(catalogo[i].getDesc());
            System.out.println("Cantidad por compra: "+catalogo[i].getQuantity()+" Unidades");
            System.out.println("Precio: $"+catalogo[i].getPrice());
            System.out.println(" ");

        }

    }

    public Product getProducto(int n){

        for(int i = 0; i <catalogo.length; i++){

            if(n == i+1){ return catalogo[i];}

        }
    }
    //el print deberia estar bien pero no estoy seguro del getProducto()
}
