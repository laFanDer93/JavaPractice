package main.day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1=new MusicBand("Queen", 1970);
        MusicBand band2 = new MusicBand("Rammstein",1994);
        MusicBand band3 = new MusicBand("Nirvana", 2002);
        MusicBand band4 = new MusicBand("Metallica", 1981);
        MusicBand band5 = new MusicBand("The Killers", 2004);
        MusicBand band6 = new MusicBand("Coldplay", 2006);
        MusicBand band7 = new MusicBand("The Rolling Stones", 1962);
        MusicBand band8 = new MusicBand("Deep Purple", 1960);
        MusicBand band9 = new MusicBand("Poets of the Fall", 2003);
        MusicBand band10 = new MusicBand("One Direction", 2011);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        System.out.println(musicBands);
        Collections.shuffle(musicBands);
        System.out.println(musicBands);
        System.out.println(groupsAfter2000(musicBands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBands ){
        List<MusicBand> musicBandsReturn = new ArrayList<>();
        for (MusicBand i: musicBands){
            if(i.getYear()>=2000) musicBandsReturn.add(i);
        }
        return musicBandsReturn;
    }
}
