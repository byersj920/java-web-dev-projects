package org.launchcode;

public abstract class Disc {
    private boolean isDirty;
    private boolean isFull;

    public abstract void addData(String bonus);
    public abstract void removeData();


    public Disc(boolean isDirty, boolean isFull){
        this.isDirty = isDirty;
        this.isFull = isFull;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }
}
