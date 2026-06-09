package patterns.command;

public class Main {

    public static void main(String[] args) {

        RemoteController rc = new RemoteController();
        rc.setCommand(0, new LightCommand());
        rc.setCommand(1, new FanCommand());
        rc.pressButton(1);
        rc.pressButton(1);
    }

}
