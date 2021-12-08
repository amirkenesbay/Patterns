package builder.example2.builders;

import builder.example2.components.Caliber;
import builder.example2.components.Magazine;
import builder.example2.guns.GunType;

public interface Builder {
    void setGunType(GunType gunType);
    void setMagazine(Magazine magazine);
    void setCaliber(Caliber caliber);
    void setWeight(double weight);
    void setDistance(double distance);
}
