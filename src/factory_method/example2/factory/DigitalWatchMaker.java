package factory_method.example2.factory;

import factory_method.example2.watches.DigitalWatch;
import factory_method.example2.watches.Watch;

public class DigitalWatchMaker implements WatchMaker{
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
