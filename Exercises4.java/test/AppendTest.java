import org.junit.jupiter.api.Test;

class AppendTest {

    @Test
    void appendTest(){

        Integer[] a = {4, 6, 8};
        Integer[] b = {7, 2};

        Append test = new Append();

        test.append(a, b);
    }

}