package main.day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String lesson;

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public void evaluate(Student student) {
        int rand = new Random().nextInt(3) + 2;
        String mark = "";
        switch (rand) {
            case 5:
                mark = "Отлично";
                break;
            case 4:
                mark = "Хорошо";
                break;
            case 3:
                mark = "Удовлетворительно";
                break;
            case 2:
                mark = "Неудовлетворительно";
                break;
        }
        System.out.println("Преподаватель " + this.name
                + " оценил студента с именем " + student.getName()
                + " по предмету " + this.lesson
                + " на оценку " + mark);
    }
}
