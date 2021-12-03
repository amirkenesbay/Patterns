package factory_method.example3.Factory;

import factory_method.example3.Coffee.Coffee;
import factory_method.example3.Coffee.CoffeeType;
import factory_method.example3.Coffee.ModedCoffee.AmericanStyleCoffees.AmericanStyleAmericano;
import factory_method.example3.Coffee.ModedCoffee.AmericanStyleCoffees.AmericanStyleCaffeLatte;
import factory_method.example3.Coffee.ModedCoffee.AmericanStyleCoffees.AmericanStyleCappuccino;
import factory_method.example3.Coffee.ModedCoffee.AmericanStyleCoffees.AmericanStyleEspresso;

public class SimpleAmericanCoffeeFactory extends SimpleCoffeeFactory {
    @Override
    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = null;

        switch (type){
            case AMERICANO -> new AmericanStyleAmericano();
            case ESPRESSO -> new AmericanStyleEspresso();
            case CAPPUCCINO -> new AmericanStyleCappuccino();
            case CAFFE_LATTE -> new AmericanStyleCaffeLatte();
        }
        return coffee;
    }
}
