package HomeWork6;

public class Cat extends Animal {



    public Cat(String name, int run, double jump, int swing) {


        this.name = name;
        this.run = run;
        this.jump = jump;
        this.swing = swing;

    }

    public void exemination (){
        if (run >= 200){
          run = run;
        }else {
            String exe = String.valueOf(run);
        }
    }

    void catInfo(){
        System.out.println("Имя кота:" + name + ", " + name + " пробежал:" + run + "метров" + ", " + name + " умеет плавать на:"
                + swing + "метров" + ", " + name + " прыгает на:" + jump + "метров");
    }



}
