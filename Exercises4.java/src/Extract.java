public class Extract <T> {

    T extract(T[] a){

        if(a[0] == null){
            return a[1];
        }
        else {
            return a[0];
        }
    }

}
