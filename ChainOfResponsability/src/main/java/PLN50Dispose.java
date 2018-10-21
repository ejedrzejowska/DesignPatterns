public class PLN50Dispose extends Dispose {
    public void dispose(Currency c) {
        if (c.getAmount() >= 50){
            int num = c.getAmount() / 50;
            int remainder = c.getAmount() % 50;
            System.out.println(num + " x 50PLN");
            getSuccessor().dispose(new Currency(remainder));
        } else {
            getSuccessor().dispose(c);
        }

    }
}
