public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange, Banana, Apple");
    }

    public static void checkSumSign() {
        int a = 50;
        int b = -24;
        int sum = a + b;
        if (sum > 0) {
            System.out.println("Сумма положительная");
        }
        else {
                System.out.println("Отрицательная");
            }
    }

    public static void printColor() {
        int x = 40;
        if (x <= 0) {
            System.out.println("Red");
        }
        else if (0 < x && x <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 50;
        int b = -24;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }

    }
}
