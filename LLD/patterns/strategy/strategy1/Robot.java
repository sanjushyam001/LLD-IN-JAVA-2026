package strategy1;
public abstract class Robot {

    protected Talkable talkable;
    protected Walkable walkable;
    protected Flyable flyable;

    public Robot(Talkable talkable, Walkable walkable, Flyable flyable) {
        this.talkable = talkable;
        this.walkable = walkable;
        this.flyable = flyable;
    }

    public abstract void perform();

}
