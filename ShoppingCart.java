package ClasesParte1;

import java.util.*;

public class ShoppingCart {

    private Vector<Product> listaProductos;
    private PaymentMethod paymentM;
    private boolean mPagoVerificado;

    public ShoppingCart(){
    //Al llamar al constructor se deberia inicializar la GUI del carrito de compras
        listaProductos = new Vector<Product>();
        mPagoVerificado = false;
    }

    public void addToCart(Product product){
        //Se añade cualquier producto valido al carro
        this.listaProductos.add(product);
}

public void deleteFromCart(Product product){
        //Se comprueba si hay un producto igual al del parametro en la lista del carrito.
    for (int i=0; i<this.listaProductos.size(); i++){
        if (this.listaProductos.get(i) == product) {
            this.listaProductos.remove(product);
        }
    }
}

public void printCart() {
        //Imprime todo los elementos de la lista

for (int i=0; i<this.listaProductos.size(); i++)
    System.out.println(this.listaProductos.get(i).getp_name().toString());
}
}


