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

    private static int createChocolate(final int small, final int big, final int goal) {{
        int count = 0;
        int b = goal;
        while (b > 4) {
            b = b - 5;
            count++;
        }
         if (count > big){
             return -1;
         }
         if (small > b)
            return b;
         if (small < b )
            return -1;
    }
    return 0;
}
}