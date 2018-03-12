package part_06.pt_06_Exercise_01;

public class Controller {


    public static void main(String[] args) {
        // Create a tetrahedrom object
        Tetrahedron tetrahedron = new Tetrahedron();
        // set the private variables from Platonic Solid parent
        tetrahedron.setBaseShape("triangle");
        tetrahedron.setNumberOfFaces(4);
        tetrahedron.setElement(fire);

        //create a hexahedron object
        Hexahedron hexahedron = new Hexahedron();
        // set the private variables from Platonic Solid parent
        hexahedron.setBaseShape("square");
        hexahedron.setElement("earth");
        hexahedron.setNumberOfFaces(6);


    }
}
