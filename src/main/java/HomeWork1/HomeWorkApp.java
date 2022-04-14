package HomeWork1;

public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords (){
        System.out.println("Orage");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 25, b = 33, result = 25 + 33;
        if (result >= 0){
            System.out.println("Сумма положительна");
        }
        if (result < 0) {
            System.out.println("Сумма отрцательна");
        }

    }
    public static void printColor (){
        int value = (int) (Math.random() * 120);
        if (value <= 0){
            System.out.println("Красный");
        }else if (value > 0 && value < 100) {
            System.out.println("Желтый");
        }else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers (){
        int a = (int) (Math.random()*50);
        int b = (int) (Math.random()*50);
        if (a >= b){
            System.out.println("a");

        }
    }
}
