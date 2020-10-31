package main.day9;

public class Task1 {
    public static void main(String[] args) {

        Student student1 = new Student("Алексей Петров", "Инфокоммуникационные технологии");
        Teacher teacher1 = new Teacher("Елена Анатольевна", "Информатика");

        System.out.println(student1.getGroupName());
        System.out.println(teacher1.getLessonName());

        student1.printInfo();
        teacher1.printInfo();
    }
}
