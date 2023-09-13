package model;

public class Time {

    private int hours;
    private int minutes;

    public Time(int hour, int minutes) {
        this.hours = hour;
        this.minutes = minutes;
    }

    // getters
    public String getTime12() {
        boolean morning;
        morning = true;
        if (morning)
            return minutes + ":" + hours + "AM";
        else return minutes + ":" + hours/2 + "PM";
    }
    public String getTime24() {
        if (minutes < 10)
            return hours + ":0" + minutes;
        else {
            return hours + ":" + minutes;
        }
    }
}
