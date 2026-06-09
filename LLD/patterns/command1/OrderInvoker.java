package patterns.command1;

public class OrderInvoker {

    private Command command;

    public void process() {

        command.execute();
    }

    public void setCommand(Command command) {
        if (command != null) {
            this.command = null;
            this.command = command;
        }

    }
}
