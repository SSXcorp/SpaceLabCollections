package Collections.Task3.Commands;

public record CommandSTOP() implements Command {

    @Override
    public void execute() {
        System.out.println("The program was finished successfully!");
        System.exit(0);
    }
}
