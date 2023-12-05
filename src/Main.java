// Класс Main для тестирования
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры классов
        People person = new People("Иван", "Иванов", 30);
        Student student = new Student("Анна", "Петрова", 20);
        Teacher teacher = new Teacher("Владимир", "Сидоров", 40);

        // Вызываем методы
        person.walk();
        person.voice();
        person.run();

        student.walk();
        student.voice();
        student.run();
        student.learn();

        teacher.walk();
        teacher.voice();
        teacher.run();
        teacher.teach();
    }
}