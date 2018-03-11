import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtractTest {

    @Test
    void extractTest(){

        Integer[] a = {2, 4};

        Extract test = new Extract();

        System.out.println(test.extract(a));

    }

}