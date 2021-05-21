package homework1;

public class Cat implements Actions {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Cat(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    public void run() {
        System.out.println("Кот " + this.name + " пробежал " + this.getRunDistance());
    }

    public void jump() {
        System.out.println("Кот " + this.name + " прыгнул " + this.getJumpHeight());
    }

    public int getRunDistance() {
        return this.runDistance;
    }

    public int getJumpHeight() {
        return this.jumpHeight;
    }
}