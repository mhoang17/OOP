package contents;

public class Food implements Product {

    private String taste;
    private int amount;
    private double weight;
    private double calories;
    private String expDate;

    public Food(String taste, int amount, double weight, double calories, String expDate) {
        this.taste = taste;
        this.amount = amount;
        this.weight = weight;
        this.calories = calories;
        this.expDate = expDate;
    }

    // When there isn't clear an exact number of x there is
    public Food(String taste, double weight, double calories, String expDate) {
        this.taste = taste;
        this.weight = weight;
        this.calories = calories;
        this.expDate = expDate;
    }

    @Override
    public String getTaste() {
        return taste;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double getCalories() {
        return calories;
    }

    @Override
    public String getExpDate() {
        return expDate;
    }
}
