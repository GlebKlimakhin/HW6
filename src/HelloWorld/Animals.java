package HelloWorld;

public abstract class Animals {
    protected String name;
    protected int age;
    protected String colour;
    protected int runDistanceMax;
    protected int jumpHeightMax;

    Animals(int age, String name, String colour, int runDistanceMax, int jumpHeightMax) {
        this.age = age;
        this.name = name;
        this.colour = colour;
        this.runDistanceMax = runDistanceMax;
        this.jumpHeightMax = jumpHeightMax;
    }

    protected void run(int runDistance) {
        if(runDistance>0 && runDistance<=runDistanceMax)
        System.out.println(name +  " пробежал " + runDistance + " метра(-ов)");
        else if(runDistance>0 && runDistance>runDistanceMax)
            System.out.println(name + " не может пробежать так много");
        else
            System.out.println("Введите целое число > 0!");
    }
    public abstract void swim();

    protected void jump(int jumpHeight)
    {
        if(jumpHeight>0)
        {
            if(jumpHeight>=jumpHeightMax && jumpHeight>0)
                System.out.println(name + " прыгнул на " + jumpHeight + "метра(-ов)!");
            else
                System.out.println(name + " не может прыгать так высоко!");
        }
        else
            System.out.println(" введите число > 0");
    }

    protected abstract void voice();
}