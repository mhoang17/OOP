import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectTest {

    @Test

    public void selectTest(){

        Select test = new Select(true);

        System.out.println(test.select("x", "y", test.b));

    }

}