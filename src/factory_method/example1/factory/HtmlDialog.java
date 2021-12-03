package factory_method.example1.factory;

import factory_method.example1.buttons.Button;
import factory_method.example1.buttons.HtmlButton;

/**
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
