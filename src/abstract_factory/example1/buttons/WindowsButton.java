package abstract_factory.example1.buttons;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
