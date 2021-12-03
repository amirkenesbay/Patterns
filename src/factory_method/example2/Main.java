package factory_method.example2;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    private void start(){
        Runner runner = new Runner();
        runner.createWatch();
    }
}
