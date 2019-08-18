import java.util.Scanner;


public class Choko {
    Scanner scanner = new Scanner(System.in);
   //создаем переменную с большой шоколадкой
    int bigChoko = 5;

    public void logic() {
        //спрашиваем сколько всего будет киллограм
        System.out.println("Enter value killogram");
        int valueKillogram = scanner.nextInt();
        // если остаток от деления общего кол-ва шоколада на большую шоколадку будет равно 0
        // выводим -1, и так же если общее кол-во шоколада меньше 5 тоже выводим -1
        if (valueKillogram % bigChoko == 0 || valueKillogram < 5) {
            System.out.println("-1");
        } else {
            // тут выводим остаток от деления на большую шоколадку общего кол-ва шоколада
            // остаток и есть количество маленьких шоколадок
            int result = valueKillogram % bigChoko;
            System.out.println("little choko: " + result);
        }
    }
}

