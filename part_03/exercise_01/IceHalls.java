package part_03.exercise_01;

import java.util.ArrayList;

public class IceHalls {

    int iceSheetWidth;
    int getIceSheetLength;
    int seatingCapacity;
    String hallName;

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public IceHalls(int iceSheetWidth, int getIceSheetLength, int seatingCapacity, String hallName) {


        this.iceSheetWidth = iceSheetWidth;
        this.getIceSheetLength = getIceSheetLength;
        this.seatingCapacity = seatingCapacity;
        this.hallName = hallName;
    }

    public int getIceSheetWidth() {
        return iceSheetWidth;
    }

    public void setIceSheetWidth(int iceSheetWidth) {
        this.iceSheetWidth = iceSheetWidth;
    }

    public int getGetIceSheetLength() {
        return getIceSheetLength;
    }

    public void setGetIceSheetLength(int getIceSheetLength) {
        this.getIceSheetLength = getIceSheetLength;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String toString() {
        return "IceHalls{" +
                "iceSheetWidth=" + iceSheetWidth +
                ", getIceSheetLength=" + getIceSheetLength +
                ", seatingCapacity=" + seatingCapacity +
                ", hallName='" + hallName + '\'' +
                '}';
    }
}
