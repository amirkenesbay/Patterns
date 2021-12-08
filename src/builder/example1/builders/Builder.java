package builder.example1.builders;

import builder.example1.cars.Type;
import builder.example1.components.Engine;
import builder.example1.components.GPSNavigator;
import builder.example1.components.Transmission;
import builder.example1.components.TripComputer;
/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
