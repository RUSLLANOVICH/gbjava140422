package HomeWork6;

public class Dog extends Animal{

    public Dog(String name, int run, double jump, int swing){
        this.name = name;
        this.run = run;
        this.jump = jump;
        this.swing = swing;
    }

    void dogInfo(){
        System.out.println("��� ������:" + name + ", " + name + " ��������:" + run + "������" + ", " + name + " ����� ������� ��:"
                + swing + "������" + ", " + name + " ������� ��:" + jump + " �����");
    }

}
