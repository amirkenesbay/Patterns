package prototype.example3;

public class ComplicatedObject implements Copyable {
    private Type type;

    public enum Type {
        ONE, TWO
    }

    @Override
    public Copyable copy() {
        ComplicatedObject complicatedobject = new ComplicatedObject();
        return complicatedobject;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
