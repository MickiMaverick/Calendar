package model;

public class Reminder extends Entry{
    public String note;
    public Reminder(String title, Date date, Time time, String type, Boolean repeating, String interval) {
        super(title, date, time, type, repeating, interval);
    }

    public String getNote() {
        return note;
    }

    public void setNote(String s) {
        this.note = s;
    }
}
