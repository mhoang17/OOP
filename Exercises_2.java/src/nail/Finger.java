package nail;

public class Finger {

    private int length;
    private int width;
    private String colour;

    public Finger(int length, int width, String colour) {
        this.length = length;
        this.width = width;
        this.colour = colour;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getColour() {
        return colour;
    }
}
