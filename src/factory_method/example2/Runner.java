package factory_method.example2;

import factory_method.example2.factory.DigitalWatchMaker;
import factory_method.example2.factory.RomeWatchMaker;
import factory_method.example2.factory.WatchMaker;
import factory_method.example2.watches.Watch;

public class Runner {
    public void createWatch(){
        WatchMaker maker = getMakerByName("Digital");
        Watch watch = maker.createWatch();
        watch.showTime();
    }

    public WatchMaker getMakerByName(String maker){
        if(maker.equals("Digital"))
            return new DigitalWatchMaker();
        else if(maker.equals("Rome"))
            return new RomeWatchMaker();

        throw new RuntimeException("Не поддерживаемая производственная линия часов: " + maker);
    }
}
