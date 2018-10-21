public abstract class Dispose {
    private Dispose successor;
    public abstract void dispose(Currency c);
    public Dispose getSuccessor(){
        return successor;
    }

    public void setSuccessor(Dispose successor) {
        this.successor = successor;
    }
}
