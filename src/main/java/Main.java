import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cats[] cats = {
                new Cat_Home("Tom", 20, false),
                new Cat_Wild("Bagira", 70, false),
                new Cats("Vasia", 40, false),
                new Cats("Pirat", 35, false),
                new Cats("Julia", 25, false)
        };
        Bowl bowl = new Bowl();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of cat food!");
        while (true) {
            if (bowl.putFood(scanner.nextInt())){
                break;
            }else bowl.putFood(scanner.nextInt());
        }

        for (Cats cat : cats) {
            cat.eat(bowl);
        }

    }
}
