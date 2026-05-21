package strategy2;

import java.util.List;

public class SuperRobot extends Robot {

    public SuperRobot(List<RobotBehavior> behaviors) {
        super(behaviors);
    }

    public void perform() {
        for (RobotBehavior behavior : behaviors) {
            if (behavior != null)
                behavior.execute();
        }
    }
}
