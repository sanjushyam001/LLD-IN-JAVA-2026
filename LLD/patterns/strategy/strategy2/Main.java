package strategy2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<RobotBehavior> behaviors = new ArrayList<>();
        behaviors.add(new TalkBehavior());
        behaviors.add(new WalkBehavior());
        behaviors.add(null);
        // behaviors.add(new FlyBehavior());
        SuperRobot superRobot = new SuperRobot(behaviors);
        superRobot.perform();
    }
}
