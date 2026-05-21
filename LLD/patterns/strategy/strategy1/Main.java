package strategy1;
public class Main {

    public static void main(String[] args) {
        Talkable talkable = new RobotTalk();
        Walkable walkable = new RobotWalk();
        Flyable flyable = new RobotFly();
        SuperRobot superRobot = new SuperRobot(talkable, walkable, flyable);
        superRobot.perform();
    }

}
