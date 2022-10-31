public class Catalog {

    private Product catalogo[] = new Product[3]; // numero de posibles productos en el catalogo
    // en el metodo de agregar del vendedor esto deberia aumentar? o se editaria desde aqui?

    public void printcatalog(){
        for(int i = 0; i <catalogo.length; i++){
            catalogo[i].Print_product();
        }
    }

    public Product getProducto(String name){ // se requiere desde el metodo que lo llama que se ingrese el nombre del producto para verificar si existe
        for(int i = 0; i <catalogo.length; i++){
            if(catalogo[i].getp_name() == name){
                return catalogo[i];
                Product temp = new Product(catalogo[i].getp_name(), catalogo[i].getBrand(), catalogo[i].getPrice(),
                        catalogo[i].getQuantity(), catalogo[i].getDesc(), catalogo[i].getStock());
            }
        }
        return temp; // devuelve un objeto producto que se debe añadir al carrito
    }

}
