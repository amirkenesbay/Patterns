package factory_method.example3;

import factory_method.example3.Coffee.Coffee;
import factory_method.example3.Coffee.CoffeeType;
import factory_method.example3.Factory.*;

public class Main {
    public static void main(String[] args) {
        /*
            Закажем капучино в итальянском стиле:
            1. Создадим фабрику для приготовления итальянского кофе
            2. Создадим новую кофейню, передав ей в конструкторе фабрику итальянского кофе
            3. Закажем наш кофе
         */
//        SimpleItalianCoffeeFactory italianCoffeeFactory = new SimpleItalianCoffeeFactory();
//        CoffeeShop italianCoffeeShop = new CoffeeShop(italianCoffeeFactory);
//        italianCoffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);

        /*
            Закажем капучино в американском стиле
            1. Создадим фабрику для приготовления американского кофе
            2. Создадим новую кофейню, передав ей в конструкторе фабрику американского кофе
            3. Закажем наш кофе
         */
//        SimpleAmericanCoffeeFactory americanCoffeeFactory = new SimpleAmericanCoffeeFactory();
//        CoffeeShop americanCoffeeShop = new CoffeeShop(americanCoffeeFactory);
//        americanCoffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);

        CoffeeShop italianCoffeeShop = new ItalianCoffeeShop();
        italianCoffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);

        CoffeeShop americanCoffeeShop = new AmericanCoffeeShop();
        americanCoffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);
    }
}
