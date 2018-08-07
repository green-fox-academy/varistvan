import java.util.Arrays;
import java.util.ArrayList;

public class SolarSystem {
    public static void main(String... args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));
        System.out.println(putSaturn(planetList));
    }

    public static ArrayList putSaturn(ArrayList<String> toChange) {
        toChange.add(5, "Saturn");
        return toChange;
    }
}
