public class Student extends People {
    // Конструктор
    public Student(String name, String lastname, int age) {
        super(name, lastname, age);
    }

    // Метод
    public void learn() {
        System.out.println("Учусь");
    }
}