package seedu.duke;

/**
 * The command class in the command
 * is unknown.
 */
public class UnknownCommand extends Command {

    public void execute() {
        Ui.printWithBorder("Unknown command. Please try again.");
    }
}
