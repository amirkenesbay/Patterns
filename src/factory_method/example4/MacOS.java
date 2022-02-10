package factory_method.example4;

public class MacOS implements OS{
    @Override
    public void getOS() {
        System.out.println("применить для мак");
    }
}
