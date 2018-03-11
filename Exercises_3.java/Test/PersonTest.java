import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonTest {

    @Test
    public void equalsTest() {

        Person person = new Person("Hans", "Ole", 24, 1489374);
        Person person2 = new Person("Hans", "Ole", 24, 1489374);

        assertEquals(person,person2);

        assertTrue(person.hashCode() == person2.hashCode());


    }

}