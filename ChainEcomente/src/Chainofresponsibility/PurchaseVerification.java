package Chainofresponsibility;

import javax.swing.JOptionPane;

public abstract class PurchaseVerification {

    protected Bool verifyPayment(int Payed) {
        if (Payed > 0)
            JOptionPane.showMessageDialog(null, "Se ha realizado el pago satisfactoriamente");
        return null;
    }

    protected Bool verifyStock(int InStock) {
        if (InStock > 0)
            JOptionPane.showMessageDialog(null, "El producto se encuentra en stock");
        return null;
    }


    public Void verify(int PaymentVerified){
        if (PaymentVerified > 0)
            JOptionPane.showMessageDialog(null, "Su pago se ha verificado en la plataforma");
        return null;
    }

}
