package main.day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> groupMembers;

    public MusicBand(String name, int year, List<String> groupMembers) {
        this.name = name;
        this.year = year;
        this.groupMembers = groupMembers;
    }

    public List<String> getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(List<String> groupMembers) {
        this.groupMembers = groupMembers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2){
        for (String member: band1.getGroupMembers()){
            band2.getGroupMembers().add(member);
        }
        band1.getGroupMembers().clear();
    }

    public static void printMembers(MusicBand band){
        for(String s: band.getGroupMembers()){
            System.out.println(s);
        }
    }


    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", groupMembers=" + groupMembers +
                '}';
    }
}
