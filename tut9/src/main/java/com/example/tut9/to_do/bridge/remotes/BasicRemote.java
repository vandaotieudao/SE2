package com.example.tut9.to_do.bridge.remotes;

import com.example.tut9.to_do.bridge.devices.Device;

public class BasicRemote implements Remote {
	protected Device device;

	public BasicRemote() {
	}

	public BasicRemote(Device device) {
		this.device = device;
	}

	@Override
	public void power() {
		System.out.println("Remote: power toggle");
		if (device.isEnabled()) {
			device.disable();
		} else {
			device.enable();
		}
	}

	//TO-DO: Implement the volumeDown() method
	@Override
	public void volumeDown() {
		//Display the current status is 'volume down'
		System.out.println("Volume down ");

        //Decrease the current volume for 10
		device.setVolume(device.getVolume()-10);
	}

	//TO-DO: Implement the volumeUp() method
	@Override
	public void volumeUp() {
		//Display the current status is 'volume up'
		System.out.println("Volume up ");

		//Increase the current volume for 10

		device.setVolume(device.getVolume()+10);
	}

	//TO-DO: Implement the channelDown() method
	@Override
	public void channelDown() {
		//Display the current status is 'channel down'
		System.out.println("Remote: channel down");
        //Decrease the current channel for 1

		device.setChannel(device.getChannel() - 1);
	}
	
	//TO-DO: Implement the channelUp() method
	@Override
	public void channelUp() {
		//Display the current status is 'channel up'
		System.out.println("Remote: channel up");
		//Increase the current channel for 1
		device.setChannel(device.getChannel() + 1);
		
	}
}
