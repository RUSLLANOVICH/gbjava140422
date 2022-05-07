package HomeWork5;


public class Employees {
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private int telephoneNumber;
    private int salary;
    private int age;

    public Employees(String lastName, String firstName, String position, String email, int telephoneNumber, int salary, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getEmpolyeeInfo() {
        return "Èìÿ: " + firstName + " Ôàìèëèÿ: " + lastName + " Äîëæíîñòü: " + position + " email: " + email + " Âîçğàñò " + age;
    }


    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {

        this.position = position;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public int getTelephoneNumber() {

        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {

        this.telephoneNumber = telephoneNumber;
    }

    public int getSalary() {

        return salary;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < +200) this.age = age;
    }

    public static void getEmployees() {
        System.out.println();
    }


}

