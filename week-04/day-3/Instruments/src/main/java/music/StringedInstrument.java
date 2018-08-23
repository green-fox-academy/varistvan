package main.java.music;

abstract class StringedInstrument extends Instrument {

    private int numberOfStrings;

    public StringedInstrument(){
    }

    public StringedInstrument(int nrOfString) {
        this.numberOfStrings = nrOfString;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    abstract void play();

    abstract String sound();

}
