interface Payment {
    void pay();
}

class CreditCard implements Payment {
    public void pay() { System.out.println("Paid by Credit Card"); }
}

class PayPal implements Payment {
    public void pay() { System.out.println("Paid by PayPal"); }
}

public class InterfacePolymorphism {
    public static void main(String[] args) {
        Payment p;
        p = new CreditCard(); p.pay();
        p = new PayPal(); p.pay();
    }
}
