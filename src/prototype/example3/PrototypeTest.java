package prototype.example3;

public class PrototypeTest {
    public static void main(String[] args) {
        ComplicatedObject prototype = new ComplicatedObject();
        ComplicatedObject clone = (ComplicatedObject) prototype.copy();
        clone.setType(ComplicatedObject.Type.ONE);
    }
}
