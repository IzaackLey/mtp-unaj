package command;

import java.util.ArrayList;

public class Calculadora {
	ArrayList<Command> commands;
	public Calculadora() {
		commands = new ArrayList<Command>();
	}

	public void setCommand(Command command) {
		commands.add(command);
	}

	public void invoke(int arg1, int arg2, int botnumber) {
		commands.get(botnumber).execute(arg1, arg2);
	}
}
