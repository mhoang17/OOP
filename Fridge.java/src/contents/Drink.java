package contents;

public class Drink implements Product {

    private String taste;
    private int amount;
    private double liters;
    private double calories;
    private String expDate;

    public Drink(String taste, int amount, double liters, double calories, String expDate) {

        this.taste = taste;
        this.amount = amount;
        this.liters = liters;
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

    public double getLiters() {
        return liters;
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
