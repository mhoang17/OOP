public class Person {
    String name;
    double height;
    double weight;

    public Person(double weight, double height) {
        this.height = height;
        this.weight = weight;
    }

    public double getBodyMassIndex(double weight, double height){
        return weight/(height * height);
    }
}