package factory_method.example3.Factory;

import factory_method.example3.Coffee.Coffee;
import factory_method.example3.Coffee.CoffeeType;
import factory_method.example3.Coffee.ModedCoffee.ItalianStyleCoffees.ItalianStyleAmericano;
import factory_method.example3.Coffee.ModedCoffee.ItalianStyleCoffees.ItalianStyleCaffeLatte;
import factory_method.example3.Coffee.ModedCoffee.ItalianStyleCoffees.ItalianStyleCappuccino;
import factory_method.example3.Coffee.ModedCoffee.ItalianStyleCoffees.ItalianStyleEspresso;

public class SimpleItalianCoffeeFactory extends SimpleCoffeeFactory {
    @Override
    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = null;
        switch (type){
            case AMERICANO -> new ItalianStyleAmericano();
            case ESPRESSO -> new ItalianStyleEspresso();
            case CAPPUCCINO -> new ItalianStyleCappuccino();
            case CAFFE_LATTE -> new ItalianStyleCaffeLatte();
        }
        return coffee;
    }
}
