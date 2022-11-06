package Chainofresponsibility;

import javax.swing.JOptionPane;

public class StockVerification {
    protected Void verifyStock(int Stock) {
        if (Stock > 0)
            JOptionPane.showMessageDialog(null, "Se ha realizado el pago satisfactoriamente");
        return null;
    }
}
