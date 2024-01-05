package org.launchcode;

import java.util.ArrayList;

public class DVD extends Disc implements Spinnable, Loadable{
    private boolean isBluRay;
    private String title;
    private double runTime;

    private ArrayList<String> bonusContent = new ArrayList<>();


    public DVD(boolean isDirty, boolean isFull, boolean isBluRay, String title, double runTime){
        super(isDirty, isFull);
        this.isBluRay = isBluRay;
        this.title = title;
        this.runTime = runTime;
    }


    @Override
    public void addData(String bonus) {
        if (!this.isFull()){
            bonusContent.add(bonus);
        } else {
            System.out.println("Error: Too much content!");
        }
    }

    @Override
    public void removeData() {

    }

    @Override
    public void playDisc() {

    }

    @Override
    public void spinDisc() {
        System.out.println("The DVD is now spinning. I think I'm going to be sick...too much spinning!");
    }
}
