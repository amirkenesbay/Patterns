package builder.example2.components;

import builder.example2.guns.Gun;
import builder.example2.guns.GunType;

public class Magazine {
    private final int capacity;
    private MagazineType magazineType;
    private GunType gunType;
    private Gun gun;

    public Magazine(int capacity) {
        this.capacity = capacity;
    }

    public MagazineType checkMagazineType(GunType gunType) {
        if (GunType.PISTOL.equals(gunType)) {
            return MagazineType.HORIZONTAL;
        } else if (GunType.SHOTGUN.equals(gunType)) {
            return MagazineType.TUBULAR;
        } else if (GunType.RIFLE.equals(gunType)) {
            return MagazineType.BOX;
        } else if (GunType.MACHINE_GUN.equals(gunType)) {
            return MagazineType.PAN;
        } else {
            throw new RuntimeException("Incorrect gun type");
        }
    }

    public boolean showGunLoading() {
        return !this.gun.isLoaded();
    }

    public int getCapacity() {
        return capacity;
    }
}
