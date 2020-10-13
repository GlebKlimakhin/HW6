package HelloWorld;

public abstract class Animals {
    protected String name;
    protected int age;
    protected String colour;

    Animals(int age, String name, String colour) {
        this.age = age;
        this.name = name;
        this.colour = colour;

    }

    protected void run(int runDistance) {
        System.out.println("Животное пробежало " + runDistance + " метров");
    }
    public abstract void swim();

    protected void jump(int jumpHeight)
    {
        System.out.println("Живтное прогнуло на " + jumpHeight + " Метра(-ов)");
    }

    protected abstract void voice();
}