package strategy2;

import java.util.ArrayList;
import java.util.List;

public abstract class Robot {

    protected List<RobotBehavior> behaviors = new ArrayList<>();

    public Robot(List<RobotBehavior> behaviors) {
        this.behaviors = behaviors;
    }

    public abstract void perform();
}
