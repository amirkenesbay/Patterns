package factory_method.example3.Coffee;

public abstract class Coffee {
    public void grindCoffee(){
        System.out.println("Grind coffee");
    }

    public void makeCoffee(){
        System.out.println("Make coffee");
    }

    public void pourIntoCup(){
        System.out.println("Pour into cup");
    }
}
