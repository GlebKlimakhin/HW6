package HelloWorld;

public class Akita extends Doggy {
    int waitTime;
    final int waitTimeMax = 25;
    public Akita(String name, int age, String colour, int runDistance, int waitTime)
    {
        super(name, age, colour, runDistance);
        this.waitTime = waitTime;
    }
    private void waitForOwner(int waitTime)
    {
        if(waitTime>0)
        {
            if (waitTime<=waitTimeMax)
            System.out.println(name + " гавкает, бежит и облизывает хозяйна!");
            else
                System.out.println(name + " отправился ждать хозяйна в другой мир");
        }
        else
            System.out.println(" Собаки не умеют путешествовать во времени!");
    }
}
