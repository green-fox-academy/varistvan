public class Main {
    public static void main(String[] args) {
        Station mol = new Station();
        Station omv = new Station(1700);
        Car toyota = new Car();
        Car vw = new Car(55);

        System.out.println("MOL has " + mol.gasAmount + " litres of petrol.");
        System.out.println("OMV has " + omv.gasAmount + " litres of petrol.");
        System.out.println("Toyota capacity: " + toyota.capacity + "l, actual gas amount is " + toyota.gasAmount);
        System.out.println("VW capacity: " + vw.capacity + "l, actual gas amount is " + vw.gasAmount);

        mol.refill(vw);
        omv.refill(toyota);

        System.out.println("------------------------------");
        System.out.println("MOL remains with " + mol.gasAmount + " litres of petrol.");
        System.out.println("OMV remains with " + omv.gasAmount + " litres of petrol.");
        System.out.println("The Toyota's actual gas amount is " + toyota.gasAmount + " litres of petrol.");
        System.out.println("The VW's actual gas amount is " + vw.gasAmount + " litres of petrol.");
    }
}
