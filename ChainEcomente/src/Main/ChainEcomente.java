package Main;

import javax.swing.JOptionPane;

import static java.lang.Integer.parseInt;

public class ChainEcomente {
    public static void main(String[] args) {

        int pago = Integer.parseInt(JOptionPane.showMessageDialog(null,"Ingrese el monto a pagar"));
        Ecomente ecomente = new Ecomente();
        Ecomente.verificacion(pago);
    }

    private static class Ecomente {
        public static void verificacion(Object pago) {
        }
    }
}
