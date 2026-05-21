package strategy1;
public class SuperRobot extends Robot {

    public SuperRobot(Talkable talkable, Walkable walkable, Flyable flyable) {
        super(talkable, walkable, flyable);
    }

    @Override
    public void perform() {
        talkable.talk();
        walkable.walk();
        flyable.fly();
    }

}
