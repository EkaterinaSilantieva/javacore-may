package homework1;

public class Robot implements Actions {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Robot(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    public void run() {
        System.out.println("Робот " + this.name + " пробежал " + this.getRunDistance());
    }

    public void jump() {
        System.out.println("Робот " + this.name + " прыгнул " + this.getJumpHeight());
    }

    public int getRunDistance() {
        return this.runDistance;
    }

    public int getJumpHeight() {
        return this.jumpHeight;
    }
}