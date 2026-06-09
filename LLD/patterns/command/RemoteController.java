package patterns.command;

public class RemoteController {

    private static int numOfButtons = 4;

    ICommand commands[] = new ICommand[numOfButtons];
    boolean buttons[] = new boolean[numOfButtons];

    public void pressButton(int index) {

        if (!(index >= 0 && index < numOfButtons)) {
            System.out.println("Invalid button position !");
            return;

        }
        if (commands[index] == null) {
            System.out.println("Button has not been assigned for given position");
            return;
        }

        if (buttons[index] == false)
            commands[index].execute();
        else
            commands[index].undo();

        buttons[index] = !buttons[index];

    }

    public void setCommand(int index, ICommand command) {

        if (index >= 0 && index < numOfButtons && command != null) {
            commands[index] = null;
            commands[index] = command;
        } else {
            System.out.println("Invalid Operation");
        }
    }
}
