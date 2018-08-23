package main.java.music;

public class Violin extends StringedInstrument {

    public Violin(){
        setNumberOfStrings(4);
        setName("Violin");
    }

    public Violin(int nrOfString) {
        super(nrOfString);
        setName("Violin");
    }

    public void play() {
        System.out.println(getName() + ", a " + getNumberOfStrings() + "-stringed instrument that goes " + sound());
    }

    public String sound() {
        return "Screech";
    }
}
