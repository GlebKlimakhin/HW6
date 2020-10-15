package HelloWorld;

import java.util.Scanner;

public class Doggy extends Animals {
 int swimDistanceMax;

    Doggy(String name, int age, String colour, int runDistanceMax, int jumpHeightMax, int swimDistanceMax) {
        super(age, name, colour, runDistanceMax, jumpHeightMax);
        this.swimDistanceMax = swimDistanceMax;
    }


    @Override
    public void swim() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дистанцию, на которую должна проплыть собака!");
        int swimDistance = scanner.nextInt();
        if (swimDistance <= 0) {
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


}
