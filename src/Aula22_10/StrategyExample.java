package Aula22_10;


interface PaymentStrategy {
    void pay(int amount);
}


class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Pagamento de " + amount + " realizado via cartão de crédito.");
    }
}


class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Pagamento de " + amount + " realizado via PayPal.");
    }
}


class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    
    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}


public class StrategyExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(500);
        
        
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(300);
    }
}
