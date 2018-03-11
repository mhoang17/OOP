@SuppressWarnings("unchecked")

public class Append <T> {

    T[] append (Integer[] a, Integer[] b){

        T[] result;

        result = (T[]) new Integer [a.length + b.length];

        System.arraycopy(a,0, result, 0, a.length);

        System.arraycopy(b, 0, result, a.length, b.length);

        return result;
    }

}
