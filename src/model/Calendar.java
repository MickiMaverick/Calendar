package model;

import  model.Date;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    public String date;
    public String email;
    public String calendarName;
    public Entry e;
    public List<Entry> calendarEntries;

    public Calendar(String date, String calendarName, String email) {
        this.date = date;
        this.email = email;
        this.calendarName = calendarName;
        calendarEntries = new ArrayList<>();
    }

    // getters
    public List<Entry> getAllEvents () {
        return this.calendarEntries;
    }

    public List<Entry> getSoonestEvent () {
        return this.calendarEntries;
    }

    public void addEntry(Entry e) {
        this.calendarEntries.add(e);
    }

}
