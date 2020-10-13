package HelloWorld;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Kitty cat = new Kitty("Барсик", 2, "Чёрный");
	Doggy dog = new Doggy("Бобик", 5, "Чёрный", 500);
	Doggy dog1 = new Doggy("Соболь", 5, "Рыже-коричневый", 650);//Разная дистанция, обьявлена как поле класса(последнее задание)
	cat.voice();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите расстрояние, которое кошка должна пробежать!");
        int catRunDist = scan.nextInt();
        cat.run(catRunDist);
        System.out.println("Введите высоту, на которую кошка должна прыгнуть!");
        int catJumpHeight = scan.nextInt();
        cat.jump(catJumpHeight);
        System.out.println();
        cat.swim();
        System.out.println();
        dog.voice();
        System.out.println("Введите расстрояние, которое собака должна пробежать!");
        int dogRunDist = scan.nextInt();
        dog.run(dogRunDist);
        System.out.println("Введите высоту, на которую собака должна прыгнуть!");
        int dogJumpHeight = scan.nextInt();
        dog.jump(dogJumpHeight);
        dog.swim();
        scan.close();

    }
}
