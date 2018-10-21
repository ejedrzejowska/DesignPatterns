public class ATMDemo {
    private Dispose d1;
    public ATMDemo(){
        d1 = new PLN50Dispose();
        Dispose d2 = new PLN20Dispose();
        Dispose d3 = new PLN10Dispose();
        d1.setSuccessor(d2);
        d2.setSuccessor(d3);
    }

    public static void main(String[] args) {
        ATMDemo atmDemo = new ATMDemo();
        atmDemo.d1.dispose(new Currency(70));
    }
}
