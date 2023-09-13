package model;

public class Event extends Entry{
    Reminder reminder;
    public Event(String title, Date date, Time time, String type, Boolean repeating, String interval) {
        super(title, date, time, type, repeating, interval);
    }

    public Reminder getReminder() {
        return reminder;
    }

    public void setReminder(Reminder r) {
        reminder = r;
    }
}
