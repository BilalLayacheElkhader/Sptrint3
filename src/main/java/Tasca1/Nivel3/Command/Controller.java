package Tasca1.Nivel3.Command;

import Tasca1.Nivel3.Command.Command;

public class Controller {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand(){
        command.execute();
    }
}
