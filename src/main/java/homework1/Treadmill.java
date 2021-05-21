package homework1;

public class Treadmill extends Obstacles {
    private int length;

    public Treadmill(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    protected boolean moving(Human human) {
        System.out.println("Беговая дорожка длиной "  + this.length);
        human.run();
        if (this.getLength() <= human.getRunDistance()) {
            System.out.println("Человек успешно пробежал");
            return true;
        } else {
            System.out.println("Человек не смог пробежать");
            return false;
        }
    }

    protected boolean moving(Robot robot) {
        System.out.println("Беговая дорожка длиной "  + this.length);
        robot.run();
        if (this.getLength() <= robot.getRunDistance()) {
            System.out.println("Робот успешно пробежал");
            return true;
        } else {
            System.out.println("Робот не смог пробежать");
            return false;
        }
    }

    protected boolean moving(Cat cat) {
        System.out.println("Беговая дорожка длиной "  + this.length);
        cat.run();
        if (this.getLength() <= cat.getRunDistance()) {
            System.out.println("Кот успешно пробежал");
            return true;
        } else {
            System.out.println("Кот не смог пробежать");
            return false;
        }
    }
}