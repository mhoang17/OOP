public class Leader {
    String first_name;
    String last_name;
    int age;

    public Leader(String firstName, String lastName, int Age){
        first_name = firstName;
        last_name = lastName;
        age = Age;
    }
}

class represent{

    public static void main(String[] args) {
        Leader person = new Leader("Anders", "And", 28);

        System.out.println(person.first_name+ ", " +person.last_name+ ", " +person.age);
    }
}

