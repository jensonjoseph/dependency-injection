package ufm.cis.jayani.di;

public class HouseImpl implements House {

    Door door;

    public HouseImpl(Door door) {
        this.door = door;
    }

    public void doSomething() {
        String info = door.getInfo();
        System.out.println(info);
    }

    public void setService(Door door) {
        this.door = door;
    }
}