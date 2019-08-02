package com.headfirst;

import static org.junit.Assert.*;

import java.rmi.Remote;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.headfirst.commands.GarageDoorOpenCommand;
import com.headfirst.domains.GarageDoor;
import com.headfirst.remote.SimpleRemoteControl;

public class RemoteControlTest {
	
	public SimpleRemoteControl remote;
	public GarageDoor garageDoor;
	public GarageDoorOpenCommand garageDoorOpen;

	@Before
	public void setUp() throws Exception {
//		initialise the remote control
		remote = new SimpleRemoteControl();
//		initialise the garage door itself
		garageDoor = new GarageDoor();
//		initialise the garage door open command
		garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGarageDoorOpen() {
		remote.setCommand(garageDoorOpen);
		remote.buttonWasPressed();
	}

}
