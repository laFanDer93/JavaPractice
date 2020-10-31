package main.day9;

public class Teacher extends Human{
    private String lessonName;

    public Teacher(String name, String lessonName) {
        super(name);
        this.lessonName = lessonName;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    protected void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());
    }

}
