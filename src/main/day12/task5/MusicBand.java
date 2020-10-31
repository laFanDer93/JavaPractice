package main.day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> groupMembers;

    public MusicBand(String name, int year, List<MusicArtist> groupMembers) {
        this.name = name;
        this.year = year;
        this.groupMembers = groupMembers;
    }

    public List<MusicArtist> getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(List<MusicArtist> groupMembers) {
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
        for (MusicArtist member: band1.getGroupMembers()){
            band2.getGroupMembers().add(member);
        }
        band1.getGroupMembers().clear();
    }

    public static void printMembers(MusicBand band){
        for(MusicArtist s: band.getGroupMembers()){
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
