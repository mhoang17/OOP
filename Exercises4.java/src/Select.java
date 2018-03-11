public class Select {

    boolean b;

    public Select(boolean b) {
        this.b = b;
    }

    <T> T select(T x, T y, boolean b){

        return (b ? x : y);
    }
}
