package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar(){
        setNumberOfStrings(4);
        setName("Bass Guitar");
    }

    public BassGuitar(int nrOfString) {
        super(nrOfString);
        setName("Bass Guitar");
    }

    public void play() {
        System.out.println(getName() + ", a " + getNumberOfStrings() + "-stringed instrument that goes " + sound());
    }

    public String sound() {
        return "Duum-duum-duum";
    }
}
