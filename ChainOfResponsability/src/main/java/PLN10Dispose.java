public class PLN10Dispose extends Dispose {
    public void dispose(Currency c) {
        if (c.getAmount() >= 10){
            int num = c.getAmount() / 10;
            System.out.println(num + " x 10PLN");
        }
    }
}
