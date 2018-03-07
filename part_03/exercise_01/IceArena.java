package part_03.exercise_01;

import java.util.ArrayList;

public class IceArena {
    ArrayList<IceHalls> iceHalls = new ArrayList<>();
    int size;
    String name;

    public IceArena( int size, String name) {

        ArrayList<IceHalls> iceHalls = new ArrayList<>();
        this.iceHalls = iceHalls;
        this.size = size;
        this.name = name;
    }

    public ArrayList<IceHalls> getIceHall() {
        return iceHalls;
    }

    public void addIceHall(IceHalls iceHalls) {
        this.iceHalls.add(iceHalls);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getAddress() {
        return name;
    }

    public void setAddress(String address) {
        this.name = address;
    }

    @Override
    public String toString() {
        return "IceArena{" +
                "iceHalls=" + iceHalls.toString() +
                ", size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
