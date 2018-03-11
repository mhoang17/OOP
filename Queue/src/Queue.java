import java.util.Arrays;
import java.util.function.Predicate;

@SuppressWarnings("unchecked")

public class Queue <T> {

    private T[] queue;

    // Create que-size
    public Queue(T[] queue) {

        this.queue = queue;
    }

    // Entering que
    void enqueue(T t){

        for(int i = 0; i <= queue.length; i++){

            if(queue[i] == null){

                queue[i] = t;
                break;
            }
        }

        if(queue[queue.length - 1] != null){
            T[] doubleQueue = (T[]) new Object[queue.length * 2];

            System.arraycopy(queue, 0, doubleQueue, 0, queue.length);

            queue = doubleQueue;

        }

    }

    // Going out of queue
    T dequeue (){

        // If queue is empty
        if(queue[0] == null){

            throw new NoneInLineException();
        }

        // If queue isn't empty
        T firstInLine = queue[0];

        T[] newQueue = (T[]) new Object[queue.length];

        System.arraycopy(queue, 1, newQueue, 0, queue.length - 1);

        queue = newQueue;

        return firstInLine;
    }

    // Drain n amount of elements from queue
    T drain(int n){

        T lastN = queue[n];

        T[] newQueue = (T[]) new Object[queue.length];

        System.arraycopy(queue, n, newQueue, 0, queue.length - n);

        if (queue[n] == null){

            for (int i = n; i >= 0; i--){

                if(queue[i] != null){

                    lastN = queue[i];
                }
            }
        }

        queue = newQueue;

        return lastN;

    }

    void drainWhile(Predicate<T> f){

        Arrays.fill(queue, null);

    }

    /*public T[] getQueue() {

        return queue;
    }*/
}
