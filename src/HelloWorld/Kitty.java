package HelloWorld;

public class Kitty extends Animals {
    final int jumpHeightMax = 2;
    private final int run = 200;
    Kitty(String name, int age, String colour)
    {
        super(age, name, colour);
    }
    @Override
    public void voice()
    {
        System.out.println(name + " мяукает!");
    }
    @Override
    public void run(int runDistance)
    {
        if(runDistance <= run && runDistance>0)
        {
            System.out.println(name + " пробежал  " + runDistance + " метра(-ов)!");
        }
        else if(runDistance > run && runDistance>0)
        {
            System.out.println(name + " не справился и упал от бессилия!");
        }
        else
        {
            System.out.println("Введите значение больше 0!");
        }

    }
    @Override
    protected void jump(int jumpHeight)
    {
        if(jumpHeight > 0 && jumpHeight <= jumpHeightMax)
        {
            System.out.println(name + " прыгнул на " + jumpHeight + " метра(-ов)");
        }
        else if (jumpHeight<=0)
        {
            System.out.println("Кошечки не умеют прыгать под землю!");
        }
        else
        {
            System.out.println(name + " не умеет прыгать так высоко!");
        }
    }
    @Override
    public void swim()
    {
        System.out.println("Кошечки не умеют плавать!");
    }


}
