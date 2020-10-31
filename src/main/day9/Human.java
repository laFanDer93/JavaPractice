package main.day9;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void printInfo(){
        System.out.println("Этот человек с именем " + getName());
    }
}
