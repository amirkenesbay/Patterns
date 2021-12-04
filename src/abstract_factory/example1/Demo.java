package abstract_factory.example1;

import abstract_factory.example1.app.Application;
import abstract_factory.example1.factories.GUIFactory;
import abstract_factory.example1.factories.MacOSFactory;
import abstract_factory.example1.factories.WindowsFactory;

import java.util.Locale;

public class Demo {

    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */
    private static Application configureApplication(){
        Application application;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            factory = new MacOSFactory();
            application = new Application(factory);
        } else {
            factory = new WindowsFactory();
            application = new Application(factory);
        }
        return application;
    }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }
}
