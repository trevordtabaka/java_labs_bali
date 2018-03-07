package part_03.exercise_01;

public class Controller {

    public static void main(String[] args) {

        IceArena baliArena = new IceArena(2600, "Bali Ice Arena");
        IceArena odenseArena = new IceArena(10000, "Vestfyn Brygeriet");

        odenseArena.addIceHall(addIceHall(50,100,3000,"Vest"));
        odenseArena.addIceHall(addIceHall(60,110,200,"Øst"));

        baliArena.addIceHall(addIceHall(20,80,50,"BaliBali"));



        System.out.println(odenseArena.toString());
        System.out.println(baliArena.toString());

    }

    public static IceHalls addIceHall(int iceWidth, int iceLength, int seatingCapacity, String name){

         IceHalls newIceHall = new IceHalls(iceWidth, iceLength, seatingCapacity, name);

        return newIceHall;
    }
}
/////////////////Output///////////////////////////
// IceArena{iceHalls=[IceHalls{iceSheetWidth=50, getIceSheetLength=100, seatingCapacity=3000, hallName='Vest'}, IceHalls{iceSheetWidth=60, getIceSheetLength=110, seatingCapacity=200, hallName='Øst'}], size=10000, name='Vestfyn Brygeriet'}
// IceArena{iceHalls=[IceHalls{iceSheetWidth=20, getIceSheetLength=80, seatingCapacity=50, hallName='BaliBali'}], size=2600, name='Bali Ice Arena'}
//////////////////////////////////////////////////

