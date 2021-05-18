package homework1;

public abstract class Obstacles {
    private String name;

    public Obstacles(String name) {
        this.name = name;
    }

    protected abstract boolean moving(Human var1);

    protected abstract boolean moving(Robot var1);

    protected abstract boolean moving(Cat var1);

    public String getName() {
        return this.name;
    }
}