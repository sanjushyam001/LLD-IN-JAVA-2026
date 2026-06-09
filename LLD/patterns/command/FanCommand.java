package patterns.command;

public class FanCommand implements ICommand {

    private Fan fan = new Fan();

    @Override
    public void execute() {
        fan.on();
    }

    @Override
    public void undo() {
        fan.off();
    }

}
