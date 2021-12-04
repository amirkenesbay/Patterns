package abstract_factory.example1.factories;

import abstract_factory.example1.buttons.Button;
import abstract_factory.example1.buttons.MacOSButton;
import abstract_factory.example1.checkboxes.Checkbox;
import abstract_factory.example1.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
