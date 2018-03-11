import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private String name;
    private int age;
    private int secNum;

    public Person(String firstName, String lastName, int age, int secNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = firstName + lastName;
        this.age = age;
        this.secNum = secNum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSecNum() {
        return secNum;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || !(o instanceof Person)){
            return false;
        }

        Person person = (Person) o;

        return getSecNum() == person.getSecNum();
    }

    public int hashCode(){
        return Objects.hash(secNum);
    }

}
