package main.day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");

        user1.sendMessage(user2,"Hello, user2");
        user2.sendMessage(user1,"Hi, user1! Whats'up?");
        user1.sendMessage(user2,"Fine,thanks");

        MessageDatabase.showDialog(user1,user2);
    }
}
