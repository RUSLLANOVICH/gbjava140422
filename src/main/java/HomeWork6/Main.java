package HomeWork6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("����", 120, 1.5, 12);
        Cat cat2 = new Cat("������", 100, 1.2, 6);
        Dog dog1 = new Dog("�������", 300, 1.7, 150);
        Dog dog2 = new Dog("���", 270,  1.4, 180);
        cat1.catInfo();
        cat2.catInfo();
        dog1.dogInfo();
        dog2.dogInfo();


    }
}
