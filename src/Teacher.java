public class Teacher extends People {
    // Конструктор
    public Teacher(String name, String lastname, int age) {
        super(name, lastname, age);
    }

    // Метод
    public void teach() {
        System.out.println("Преподаю");
    }
}