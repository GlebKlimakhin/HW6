package HelloWorld;

public class Kitty extends Animals {
    final int jumpHeightMax = 2;
    private final int run = 200;
    Kitty(String name, int age, String colour, int runDistanceMax, int jumpHeightMax)
    {
        super(age, name, colour, runDistanceMax, jumpHeightMax);
    }
    @Override
    public void voice()
    {
        System.out.println(name + " мяукает!");
    }
    @Override
    public void swim()
    {
        System.out.println("Кошечки не умеют плавать!");
    }


}
