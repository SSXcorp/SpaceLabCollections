package Collections.Task3.Components;

import Collections.Task3.Commands.Command;

import java.util.HashSet;
import java.util.Set;

public class Operations {
    private static Set<String> carNumbers = new HashSet<>();

    private Command command;

    public static Set<String> getCarNumbers() {
        return carNumbers;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
