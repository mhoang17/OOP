import org.junit.jupiter.api.Test;

import java.util.Arrays;

class QueueTest {

    @Test
    void queueTest(){

        Object[] queSize = new Object[2];

        Queue test = new Queue(queSize);

        // Load customers
        for (int i = 0; i < 10; i++){
            test.enqueue("Customer");
        }

        // Remove first customer
        test.dequeue();

        // Drain n number of customers
        test.drain(9);

        // Drain queue
        test.drainWhile(T -> true);

        test.dequeue();
    }

}