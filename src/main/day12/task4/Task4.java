package main.day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> band1Members = new ArrayList<>();
        band1Members.add("Bill Smith");
        band1Members.add("Michal Jackson");
        band1Members.add("Perl Harbour");

        MusicBand band1 = new MusicBand("Queen", 1980,band1Members);

        List<String> band2Member = new ArrayList<>();
        band2Member.add("Jack Piterson");
        band2Member.add("All Klokher");
        band2Member.add("Fill Hemilton");

        MusicBand band2 = new MusicBand("ColdPlay", 2009, band2Member);

        System.out.println(band1);
        System.out.println(band2);

        MusicBand.printMembers(band1);
        MusicBand.transferMembers(band1,band2);
//        MusicBand.printMembers(band1);
        System.out.println("\n");
        MusicBand.printMembers(band2);




    }

}
