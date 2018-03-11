interface DoorPhone {

    int getNumOfAptFloors();

    void setAptFloor(int[] aptFloors);

    int[] getAptFloor();

    String[] getApt();

    void call(int aptFloor, String apt);

}
