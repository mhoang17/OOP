public class IllegalGearChangeException extends RuntimeException {

    private int invalidShift;

    public IllegalGearChangeException(int invalidShift) {
        this.invalidShift = invalidShift;
    }

    public int getInvalidShift() {
        return invalidShift;
    }
}
