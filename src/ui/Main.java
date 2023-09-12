package ui;

import model.*;

public class Main {
    public static void main(String[] args) {
        Calendar michisCalendar = new Calendar("12-09-2023", "Michis calendar", "michael@email.com");

        Entry event = new Event("12-09-2023", "12:00", "event");
        Entry reminder = new Reminder ("15-09-2023", "15:00", "reminder");
        Entry meeting = new Meeting ("20-10-2023", "09:00", "meeting");

        michisCalendar.addEntry(event);
        michisCalendar.addEntry(reminder);
        michisCalendar.addEntry(meeting);

        michisCalendar.getAllEvents();
        michisCalendar.getSoonestEvent();

    }
}