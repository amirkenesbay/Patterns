package builder.example2.guns;

import builder.example2.components.Caliber;
import builder.example2.components.Magazine;

public class Gun {
    private final GunType gunType;
    private final Magazine magazine;
    private final Caliber caliber;
    private final double weight;
    private final double distance;
    private boolean isLoaded;

    public Gun(GunType gunType, Magazine magazine, Caliber caliber, double weight, double distance) {
        this.gunType = gunType;
        this.magazine = magazine;
        this.caliber = caliber;
        this.weight = weight;
        this.distance = distance;
    }

    public GunType getGunType() {
        return gunType;
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public Caliber getCaliber() {
        return caliber;
    }

    public double getWeight() {
        return weight;
    }

    public double getDistance() {
        return distance;
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public boolean isLoaded() {
        return isLoaded;
    }


}
