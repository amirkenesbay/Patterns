package abstract_factory.example1.factories;

import abstract_factory.example1.buttons.Button;
import abstract_factory.example1.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
