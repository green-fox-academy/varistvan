public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        int a = 6*5*17;
        System.out.println("An average Green Fox attendee codes " + a + " hours in total.");
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        // 52-bol 30 orat kodol, vagyis
        double b = ((6*5)*100)/52.;
        System.out.printf("An average Green Fox attendee spends with coding %.2f %% of the working hours", b);
    }
}
