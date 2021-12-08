package builder.example2.builders;

import builder.example2.components.Caliber;
import builder.example2.components.Magazine;
import builder.example2.guns.Gun;
import builder.example2.guns.GunType;
import builder.example2.guns.Manual;

public class GunBuilderManual implements Builder{
    private GunType gunType;
    private Magazine magazine;
    private Caliber caliber;
    private double weight;
    private double distance;

    @Override
    public void setGunType(GunType gunType) {
        this.gunType = gunType;
    }

    @Override
    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }

    @Override
    public void setCaliber(Caliber caliber) {
        this.caliber = caliber;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Manual getResult() {
        return new Manual(gunType, magazine, caliber, weight, distance);
    }

}
