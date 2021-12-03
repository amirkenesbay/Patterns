package factory_method.example2.factory;

import factory_method.example2.watches.RomeWatch;
import factory_method.example2.watches.Watch;

public class RomeWatchMaker implements WatchMaker{
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
