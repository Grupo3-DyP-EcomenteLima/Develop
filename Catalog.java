public class Catalog {

    private Product catalogo[] = new Product[3];

    public void printcatalog(){

        for(int i = 0; i <catalogo.length; i++){
            catalogo[i].Print_product();
        }

    }

    public Product getProducto(int n){
        Product temp = new Product();
        for(int i = 0; i <catalogo.length; i++){

            if(n == i+1){ return catalogo[i];}

        }

        //return
    }
}
