package builder.example1;

import builder.example1.builders.CarBuilder;
import builder.example1.builders.CarManualBuilder;
import builder.example1.cars.Car;
import builder.example1.cars.Manual;
import builder.example1.director.Director;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        // Директор получает объект конкретного строителя от клиента
        // (приложения). Приложение само знает какой строитель использовать,
        // чтобы получить нужный продукт.
        CarBuilder carBuilder = new CarBuilder();
        director.constructCityCar(carBuilder);

        // Готовый продукт возвращает строитель, так как Директор чаще всего не
        // знает и не зависит от конкретных классов строителей и продуктов.
        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getType());

        CarManualBuilder carManualBuilder = new CarManualBuilder();

        // Директор может знать больше одного рецепта строительства.
        director.constructCityCar(carManualBuilder);
        Manual carManual = carManualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
