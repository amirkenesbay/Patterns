package factory_method.example1.factory;

import factory_method.example1.buttons.Button;
import factory_method.example1.buttons.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
