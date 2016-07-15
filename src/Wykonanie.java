/**
 * Created by lenus on 13.07.16.
 */
public class Wykonanie {
    public static void main(String[] args) {
        String hour = args[0];
//        String hour = "22:00";

        try {
            Zegar zegar = new Zegar();
            zegar.setHour(hour);
            zegar.displayDegrees();
        } catch (NumberFormatException e) {
            System.out.println("Niepoprawnie wprowadzone dane!");
        } catch (WrongTimeException e) {
            System.out.println(e);
        }

    }
}
