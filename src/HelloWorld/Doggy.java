package HelloWorld;

import java.util.Scanner;

public class Doggy extends Animals {
    final int swimDistanceMax = 10;
    int runDistance;
    final int jumpHeightMax = 2;

    Doggy(String name, int age, String colour, int runDistance) {
        super(age, name, colour);
        this.runDistance = runDistance;
    }


    @Override
    public void swim() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дистанцию, на которую должна проплыть собака!");
        int swimDistance = scanner.nextInt();
        if (swimDistance < 0) {
            System.out.println("Укажите дистанцию больше нуля!");
        } else if (swimDistance > swimDistanceMax) {
            System.out.println(name + " проплыл " + swimDistanceMax + " метра(-ов) и упал от бессилия!");
        } else {
            System.out.println(name + " проплыл " + swimDistance + " метра(-ов)!");
        }
        scanner.close();
    }

    @Override
    public void voice() {
        System.out.println(name + " гавкает!");
    }

    @Override
    protected void run(int runCommand) {
        if (runCommand < 0) {
            System.out.println("Введите число больше 0!");
        } else if (runCommand > runDistance) {
            System.out.println(name + " пробегает " + runDistance + " метров и падает от бессилия!");
        } else {
            System.out.println(name + " пробегает " + runCommand + " метра(-ов!)");
        }
    }

    @Override
    protected void jump(int jumpHeight) {
        if (jumpHeight > 0 && jumpHeight <= jumpHeightMax) {
            System.out.println(name + " прыгнул на " + jumpHeight + " метра(-ов)");
        } else if (jumpHeight <= 0) {
            System.out.println("Собачки не умеют прыгать под землю!");
        } else {
            System.out.println(name + " не умеет прыгать так высоко!");
        }
    }
}
