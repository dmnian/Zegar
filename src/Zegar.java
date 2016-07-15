public class Zegar {
    private int minutes;
    private int hours;

    public void setHour(String fullHour) throws NumberFormatException, WrongTimeException {

        this.hours = Integer.parseInt(fullHour.substring(0, 2));
        this.minutes = Integer.parseInt(fullHour.substring(3, 5));

        if(hours < 0 || hours > 24 || minutes > 60 || minutes < 0){
            throw new WrongTimeException("Błędnie wprowadzona godzina lub minuta !");
        }
    }

    public int countDegrees(int hour, int minutes) {
        int hourDegrees = (hour % 12) * 30;
        int minsDegrees = minutes * 6;

        if (hourDegrees == minsDegrees)
            return 0;
        else if (hourDegrees < minsDegrees)
            return minsDegrees - hourDegrees;
        else
            return hourDegrees - minsDegrees;

    }

    public int getSmallerDegree(int deegr) {
        return (deegr > 180) ? 360 - deegr : deegr;
    }

    public void displayDegrees() {
        System.out.println(getSmallerDegree(countDegrees(this.hours, this.minutes)));
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }
}
