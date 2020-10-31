package main.day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> band1Members = new ArrayList<>();
        band1Members.add(new MusicArtist("Member1", 40));
        band1Members.add(new MusicArtist("Member1", 21));
        band1Members.add(new MusicArtist("Member1", 89));

        MusicBand band1 = new MusicBand("Queen", 1980, band1Members);

        List<MusicArtist> band2Member = new ArrayList<>();
        band2Member.add(new MusicArtist("Member2",49));
        band2Member.add(new MusicArtist("Member2", 23));
        band2Member.add(new MusicArtist("Member2", 31));

        MusicBand band2 = new MusicBand("ColdPlay", 2009, band2Member);

        System.out.println(band1);
        System.out.println(band2);

        MusicBand.printMembers(band1);
        MusicBand.transferMembers(band1, band2);
//        MusicBand.printMembers(band1);
        System.out.println("\n");
        MusicBand.printMembers(band2);

    }
}
