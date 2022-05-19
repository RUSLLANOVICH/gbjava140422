package HomeWork6;

public class Animal {
    int run;
    double jump;
    int swing;
    String name;
    String exe = "Неверное значение!!!";

    void setName(String name){
        System.out.println("Животное зовут: " + name );
    }

    void setRun(int run){
        System.out.println("Животное бегает: " + run + "меторв");
    }

    void setSwing(int swing){
        System.out.println("Животное плавает: " + swing + "метров");
    }

    void setJump(int jump){
        System.out.println("Животное прыгает: " + jump + "метров");
    }


}
