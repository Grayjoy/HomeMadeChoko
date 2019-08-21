import java.util.Scanner;

public class Choko2 {

    public void logic2() {

        final int small, big, goal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество маленьких шоколадок: ");
        small = scanner.nextInt();
        System.out.println("Введите количество больших шоколадок: ");
        big = scanner.nextInt();
        System.out.println("Общее количество киллограмм в пакете: ");
        goal = scanner.nextInt();
        int result = createChocolate(small, big, goal);
        if (result > 0) {
            System.out.printf("Необходимо использовать %s маленьких шоколадок", result);
        } else
            System.out.println("Это невозможно выполнить при таких условиях, результат: " + result);
    }

    private static int createChocolate(final int small, final int big, final int goal) {
        int a = goal;
        int counter = 0;
        while (a > 0 && counter < big) {
            a = a - 5;

            counter++;
            if (a < 0) {
                a += 5;
            }
        }

        if (small >= a) {
            return a;
        }


        return -1;
    }

}
