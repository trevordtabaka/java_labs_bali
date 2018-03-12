package part_06.Part_06_Exercise_03;

public class Mammal extends Animal{

    private boolean hasFurHair;
    private boolean hasNeoCortex;

    public Mammal(int eyes, int limbs) {
        super(eyes, limbs);
        this.hasFurHair = true;
        this.hasNeoCortex = true;
    }

    public boolean isHasFurHair() {
        return hasFurHair;
    }

    public void setHasFurHair(boolean hasFurHair) {
        this.hasFurHair = hasFurHair;
    }

    public boolean isHasNeoCortex() {
        return hasNeoCortex;
    }

    public void setHasNeoCortex(boolean hasNeoCortex) {
        this.hasNeoCortex = hasNeoCortex;
    }

    public void lostEye(int eyes){

        super.setEyes(eyes);

    }
}
