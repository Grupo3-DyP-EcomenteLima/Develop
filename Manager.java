import java.util.Scanner;

public class Manager {

    private BuyerAbs buyers[]; //part of the user "database"
    private Seller sellers[]; //part of the user "database"
    private Catalog p_catalog;

    public Scanner cin = new Scanner(System.in);

    //methods----------------

    public Manager(){ // al llamarlo en el main "Manager g = new Manager()" crearia los vectores de buyers y sellers no?
        buyers = new BuyerAbs[3];
        sellers = new Seller[3];
        p_catalog = new Catalog();
    }

    public void login_menu() {
        int opc = 0;
        System.out.println("---------Ecomente Lima--------\n\n");
        System.out.println("1. Crear cuenta cliente \n");
        System.out.println("2. Crear cuenta vendedor \n");
        System.out.println("3. Ingresar a cuenta de cliente \n");
        System.out.println("4. Ingresar a cuenta de vendedor \n");
        System.out.println("5. Salir de la app \n");
        opc= cin.nextInt();
        switch(opc) {
            case 1:
                //function
                break;
            case 2:
                //function
                break;
            case 3:
                //function
                break;
            case 4:
                //function
                break;
            case 5:
                System.exit(0);
                break;
        }
    }

    public void seller_menu() {
        int opc = 0;
        System.out.println("---------Ecomente Lima--------\n\n");
        System.out.println("1. Ver el catalogo \n");
        System.out.println("2. Crear una entrada de producto en el catalogo \n");
        System.out.println("3. Editar una entrada de producto en el catalogo \n");
        System.out.println("4. Borrar una entrada de producto en el catalogo \n");
        System.out.println("5. Ver tu carrito de compras \n");
        System.out.println("6. Editar tu cuenta \n");
        System.out.println("7. Borrar tu cuenta \n");
        System.out.println("8. Salir de la app \n");
        opc= cin.nextInt();

        switch(opc){
            case 1:
                p_catalog.printcatalog();
                break;
            case 2:
                //p_catalog.addproduct(seller.createproduct(););
                break;
            case 3:
                //function
                break;
            case 4:
                //function
                break;
            case 5:
                //function
                break;
            case 6:
                //function
                break;
            case 7:
                //function
                break;
            case 8:
                System.exit(0);
                break;
        }
    }

    public void buyer_menu() {
            int opc = 0;
            System.out.println("---------Ecomente Lima--------\n\n");
            System.out.println("1. Ver el catalogo \n");
            System.out.println("2. Ver tu carrito de compras \n");
            System.out.println("3. Editar tu cuenta \n");
            System.out.println("4. Borrar tu cuenta \n");
            System.out.println("5. Salir de la app \n");
            opc = cin.nextInt();
            switch (opc) {
                case 1:
                    p_catalog.printcatalog();
                    break;
                case 2:
                    //buyers[i].shoppingcart.printcart()
                    break;
                case 3:
                    //function
                    break;
                case 4:
                    //function
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
    }

    // account interaction -------------------------------------------
    public void CreateAccount(){}

    public void Edit_Account(){}

    public void Delete_Account(){}

    public void print_profile(){}

    public void run_app(){ //inicia la app, se usa en el main
    }
}
