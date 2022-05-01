package com.example.tut9.to_do.bridge.remotes;


import com.example.tut9.to_do.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    //TO-DO: Implement the mute() method
    public void mute() {
    	//Display the current volume status is 'mute'
        System.out.println("Remote: mute");
        device.setVolume(0);
        //Set the volume to 0
        
    }
}
