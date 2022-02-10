package factory_method.example4;

public class FactoryTest {
    public static void main(String[] args) {
        String win = "Linux";
        Factory factory = new Factory();
        OS os = factory.getCurrentOS(win);
        os.getOS();
    }
}
