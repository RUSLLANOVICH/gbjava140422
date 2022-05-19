package HomeWork6;

public class Dog extends Animal{

    public Dog(String name, int run, double jump, int swing){
        this.name = name;
        this.run = run;
        this.jump = jump;
        this.swing = swing;
    }

    void dogInfo(){
        System.out.println("Имя собаки:" + name + ", " + name + " пробежал:" + run + "метров" + ", " + name + " умеет плавать на:"
                + swing + "метров" + ", " + name + " прыгает на:" + jump + " метра");
    }

}
