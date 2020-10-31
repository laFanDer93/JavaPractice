package main.day8;

public class Task1 {
    public static void main(String[] args) {
        long millis_startTime = System.currentTimeMillis();
//        stringBufferTask();    //~50 milli sec
//        stringTask();  //~150-190 milli sec
        long millis_endTime = System.currentTimeMillis();
        System.out.println("\nTime taken in milli seconds: "

                + (millis_endTime - millis_startTime));

    }

    public static void stringTask() {
        String s = "";
        for (int i = 0; i <= 20000; i++) {
            s = i + " ";
            System.out.print(s);
        }
    }

    public static void stringBufferTask() {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i <= 20000; i++) {
            sb.append(" " + i);
        }
        System.out.print(sb);
    }
}



