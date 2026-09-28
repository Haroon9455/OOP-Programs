abstract class Bank {
    abstract double interest();
}

class HBL extends Bank {
    double interest() { return 5.5; }
}

public class AbstractBank {
    public static void main(String[] args) {
        HBL h = new HBL();
        System.out.println("Interest: " + h.interest() + "%");
    }
}
