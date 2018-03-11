import java.util.Objects;

public class Fridge {

    private double temperature;
    private double sizeInLiters;
    private int shelves;
    private String content[];

    public Fridge(double temperature, double sizeInLiters, int shelves) {
        this.temperature = temperature;
        this.sizeInLiters = sizeInLiters;
        this.shelves = shelves;
    }

    public void setContent(String[] content) {
        this.content = content;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getSizeInLiters() {
        return sizeInLiters;
    }

    public int getShelves() {
        return shelves;
    }

    public String[] getContent() {
        return content;
    }

    /*@Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || !(o instanceof String)){
            return false;
        }

        String person = (String) o;

        return String.equals(Fridge.getContent());
    }

    @Override
    public int hashCode(){
        return Objects.hash(content);
    }*/
}
