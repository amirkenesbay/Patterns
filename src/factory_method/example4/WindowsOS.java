package factory_method.example4;

public class WindowsOS implements OS {
    @Override
    public void getOS() {
        System.out.println("применить для виндовс");
    }
}
