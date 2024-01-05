package org.launchcode;

import java.util.ArrayList;

public class CD extends Disc implements Spinnable, Copyable, Loadable{

ArrayList<String> songs = new ArrayList<>();
private boolean isFake;


    public CD(boolean isDirty, boolean isFull, ArrayList<String> songs, boolean isFake){
        super(isDirty, isFull);
        this.songs = songs;
        this.isFake = isFake;
    }


    public ArrayList<String> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<String> songs) {
        this.songs = songs;
    }

    @Override
    public CD copyDisc() {
        return new CD (this.isDirty(), this.isFull(),this.songs, true);
    }

    @Override
    public void addData(String bonus){
    }

    @Override
    public void removeData() {

    }

    @Override
    public void playDisc() {

    }

    @Override
    public void spinDisc() {
        System.out.println("CD has started spinning. How fun wheeeee.");
    }

    public boolean isFake() {
        return isFake;
    }

    public void setFake(boolean fake) {
        isFake = fake;
    }
}
