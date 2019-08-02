package com.headfirst.remote;

import com.headfirst.command.Command;

public class SimpleRemoteControl {
	
	Command slot;
	
	// empty constructor
	public SimpleRemoteControl() {
		
	}
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
	
	

}
