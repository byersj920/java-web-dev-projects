package org.launchcode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> playlist = new ArrayList<>();
        playlist.add("Jingle Bells");
        playlist.add("Frosty the Snowman");
        playlist.add("Rockin' Around the Christmas Tree");
        CD myCD = new CD(false, true, playlist, false);
        myCD.spinDisc();

        DVD myDVD = new DVD(false, true, false, "Home Alone", 1.43);
        myDVD.spinDisc();
        CD fakeDisc = myCD.copyDisc();
        System.out.println(myCD.isFake());
        System.out.println(fakeDisc.isFake());
    }
}