package HomeWork5;

public class HomeWork5 {

    public static void main(String[] args) {

        Employees[] empArray = new Employees[6];
        empArray[0] = new Employees("Романов", "Альберт", "Директор", "romanova@gamil.com", 996999777, 50000, 45);
        empArray[1] = new Employees("Юриков", "Макс", "Менеджер", "maks@gamil.com",4124141, 20000, 24 );
        empArray[2] = new Employees("Алексеев", "Гоша", "Офисный работник", "alekseev@gmail.com", 12312312, 25000, 32);
        empArray[3] = new Employees("Никитин", "Костя", "Бухгалтер", "nikitin@gmail.com",231241124, 30000, 53 );
        empArray[4] = new Employees("Степанов", "Михаил", "Уборщик", "stepanov@gmail.com", 1231233, 15000, 43 );
        empArray[5] = new Employees("Николаев", "Олег", "Замдиректор", "nikolaev@gmail.com",1231231, 40000, 37);

        for (int i = 0; i < empArray.length; i++) {

            System.out.println(empArray[i]);
        }
        }






}
