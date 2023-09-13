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
    public List<Entry> getAllEntries() {
        return this.calendarEntries;
    }

    public void printAllEvents() {
        System.out.println("Here are all your calendar entries: ");
        System.out.println("---------------");
        for (Entry e : calendarEntries) {
            System.out.print(e.getType());
            System.out.print(": ");
            System.out.println(e.getTitle());
            System.out.print(e.getDate());
            System.out.print(", ");
            System.out.println(e.getTime());
                        if (e.repeating == true) {
                System.out.print("Repeats ");
                System.out.println(e.getIntervalOfRepetition());
            }
            else
                System.out.println("Does not repeat");
            System.out.println("---------------");
        }
    }

    public List<Entry> getSoonestEntry() {
        return this.calendarEntries;
    }

    public void addEntry(Entry e) {
        this.calendarEntries.add(e);
    }

    public void printReminder(Reminder r) {
        System.out.print (r.getType());
        System.out.print(": ");
        System.out.println(r.getTitle());
        System.out.print(r.getDate());
        System.out.print(", ");
        System.out.println(r.getTime());
        if (r.repeating == true) {
            System.out.print("Repeats ");
            System.out.println(r.getIntervalOfRepetition());
        }
        else
            System.out.println("Does not repeat");
        System.out.println(r.getNote());
        System.out.println("---------------");
    }

}
