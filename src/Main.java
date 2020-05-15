import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текущий курс: ");
        float x = in.nextFloat();
        if (x > 0) {
            System.out.print("Введите количество рублей: ");
            float rub = in.nextFloat();
            float usd = rub / x;
            System.out.printf("Итого: %.2f%9s", usd, "долларов");
        } else {System.out.println("Ошибка: курс не может быть меньше 0");}
    }
}