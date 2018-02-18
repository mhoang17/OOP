public class Vector {
    int coordinate1;
    int coordinate2;

    public Vector(int coordinate1, int coordinate2) {
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
    }

    public int vectorAd(int coordinate1, int coordinate2){
        return coordinate1 + coordinate2;
    }

    public int vectorSub(int coordinate1, int coordinate2){
        return coordinate1 - coordinate2;
    }
}
