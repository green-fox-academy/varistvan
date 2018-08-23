package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar(){
        setNumberOfStrings(6);
        setName("Electric Guitar");
    }

    public ElectricGuitar(int nrOfString) {
        super(nrOfString);
        setName("Electric Guitar");
    }

    public void play() {
        System.out.println(getName() + ", a " + getNumberOfStrings() + "-stringed instrument that goes " + sound());
    }

    public String sound() {
        return "Twang";
    }
}
