package com.headfirst.commands;

import com.headfirst.command.Command;
import com.headfirst.domains.GarageDoor;

public class GarageDoorOpenCommand implements Command {
	
	GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
//		super();
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
		garageDoor.lightOn();
	}

}
