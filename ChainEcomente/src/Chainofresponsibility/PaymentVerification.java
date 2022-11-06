package Chainofresponsibility;

import javax.swing.JOptionPane;

public class PaymentVerification {
    protected Void verifyPayment(int Payment) {
        if (Payment > 0)
            JOptionPane.showMessageDialog(null, "EL pago se ha verificado");
        return null;
    }
}
