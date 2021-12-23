package birdge.example1.remotes;

import birdge.example1.devices.Device;

public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute(){
        System.out.println("Remote: mute");
        device.setChannel(0);
    }
}
