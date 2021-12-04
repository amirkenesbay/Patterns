package abstract_factory.example1.factories;

import abstract_factory.example1.buttons.Button;
import abstract_factory.example1.buttons.WindowsButton;
import abstract_factory.example1.checkboxes.Checkbox;
import abstract_factory.example1.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
