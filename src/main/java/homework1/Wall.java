package homework1;

public class Wall extends Obstacles {
    private int heigth;

    public Wall(String name, int heigth) {
        super(name);
        this.heigth = heigth;
    }

    public int getHeigth() {
        return this.heigth;
    }

    protected boolean moving(Human human) {
        System.out.println("Стена высотой " + this.heigth);
        human.jump();
        if (this.getHeigth() <= human.getJumpHeight()) {
            System.out.println("Человек успешно прыгнул");
            return true;
        } else {
            System.out.println("Человек не смог прыгнуть");
            return false;
        }
    }

    protected boolean moving(Robot robot) {
        System.out.println("Стена высотой " + this.heigth);
        robot.jump();
        if (this.getHeigth() <= robot.getJumpHeight()) {
            System.out.println("Робот успешно прыгнул");
            return true;
        } else {
            System.out.println("Робот не смог прыгнуть");
            return false;
        }
    }

    protected boolean moving(Cat cat) {
        System.out.println("Стена высотой " + this.heigth);
        cat.jump();
        if (this.getHeigth() <= cat.getJumpHeight()) {
            System.out.println("Кот успешно прыгнул");
            return true;
        } else {
            System.out.println("Кот не смог прыгнуть");
            return false;
        }
    }
}
