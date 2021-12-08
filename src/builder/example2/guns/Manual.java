package builder.example2.guns;

import builder.example2.components.Caliber;
import builder.example2.components.Magazine;

public class Manual {
    private final GunType gunType;
    private final Magazine magazine;
    private final Caliber caliber;
    private final double weight;
    private final double distance;
    private boolean isLoaded;

    public Manual(GunType gunType, Magazine magazine, Caliber caliber, double weight, double distance) {
        this.gunType = gunType;
        this.magazine = magazine;
        this.caliber = caliber;
        this.weight = weight;
        this.distance = distance;
    }

    public String print() {
        String info = "";
        info += "Type of gun: " + gunType + "\n";
        info += "Type of magazine: " + magazine.checkMagazineType(gunType) + "\n";
        if(isLoaded){
            info += "Gun loading: " + magazine.showGunLoading() + "\n";
        }
        info += "Caliber largeness: " + caliber.checkLargeness() + "\n";
        info += "Gun weight: " + weight + "\n";
        info += "Gun distance: " + distance + "\n";
        return info;
    }
}
