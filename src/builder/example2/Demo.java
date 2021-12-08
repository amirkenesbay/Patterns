package builder.example2;

import builder.example2.builders.GunBuilder;
import builder.example2.builders.GunBuilderManual;
import builder.example2.director.Director;
import builder.example2.guns.Gun;
import builder.example2.guns.Manual;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        GunBuilder gunBuilder = new GunBuilder();
        director.constructShotGun(gunBuilder);

        Gun gun = gunBuilder.getResult();
        System.out.println("Gun built:\n" + gun.getGunType());

        GunBuilderManual gunBuilderManual = new GunBuilderManual();
        director.constructShotGun(gunBuilderManual);
        Manual manual = gunBuilderManual.getResult();
        System.out.println("\nGun manual built:\n" + manual.print());
    }
}
