package patterns.command;

class LightCommand implements ICommand {

    private Light light = new Light();

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }

}