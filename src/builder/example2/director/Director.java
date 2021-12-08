package builder.example2.director;

import builder.example2.builders.Builder;
import builder.example2.components.Caliber;
import builder.example2.components.Magazine;
import builder.example2.components.MagazineType;
import builder.example2.guns.GunType;

public class Director {
    public void constructShotGun(Builder builder) {
        builder.setGunType(GunType.SHOTGUN);
        builder.setMagazine(new Magazine(45));
        builder.setCaliber(new Caliber(12, 5.5));
        builder.setWeight(5.7);
        builder.setDistance(15.2);
    }

    public void constructRifleGun(Builder builder) {
        builder.setGunType(GunType.MACHINE_GUN);
        builder.setMagazine(new Magazine(64));
        builder.setCaliber(new Caliber(13, 7.5));
        builder.setWeight(1.6);
        builder.setDistance(10.2);
    }

    public void constructPistolGun(Builder builder) {
        builder.setGunType(GunType.PISTOL);
        builder.setMagazine(new Magazine(13));
        builder.setCaliber(new Caliber(5.5, 2.2));
        builder.setWeight(1.9);
        builder.setDistance(6.8);
    }

    public void constructMachineGun(Builder builder) {
        builder.setGunType(GunType.MACHINE_GUN);
        builder.setMagazine(new Magazine(200));
        builder.setCaliber(new Caliber(8, 4.4));
        builder.setWeight(2.7);
        builder.setDistance(6.8);
    }
}
