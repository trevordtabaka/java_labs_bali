package part_06.pt_06_Exercise_01;

public class Polyhedron {

    private int numberOfFaces;
    private String element;
    private String baseShape;

    public Polyhedron(int numberOfFaces, String element, String baseShape) {
        this.numberOfFaces = numberOfFaces;
        this.element = element;
        this.baseShape = baseShape;
    }

    public int getNumberOfFaces() {
        return numberOfFaces;
    }

    public void setNumberOfFaces(int numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getBaseShape() {
        return baseShape;
    }

    public void setBaseShape(String baseShape) {
        this.baseShape = baseShape;
    }
}
