public class PLN20Dispose extends Dispose {
    public void dispose(Currency c) {
        if (c.getAmount() >= 20){
            int num = c.getAmount() / 20;
            int remainder = c.getAmount() % 20;
            System.out.println(num + " x 20PLN");
            getSuccessor().dispose(new Currency(remainder));
        } else {
            getSuccessor().dispose(c);
        }

    }
}
