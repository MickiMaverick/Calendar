package ui;

import model.*;

public class Main {
    public static void main(String[] args) {
        Calendar michisCalendar = new Calendar("12-09-2023", "Michis calendar", "michael@email.com");

        Date date1 = new Date(12, 9, 2023);
        Date date2 = new Date(15, 9, 2023);
        Date date3 = new Date(20, 10, 2023);

        Time time1 = new Time(12, 0);
        Time time2 = new Time(15, 0);
        Time time3 = new Time(9, 0);

        String note1 = "Do your homework!";
        String note2 = "Prepare in time!";

        Entry event = new Event("Lunch with Sarah", date1, time1, "Event", true, "every day");
        Reminder reminder = new Reminder ("CS Homework", date2, time2, "Reminder", false, null);
        Reminder reminderMeeting = new Reminder ("Preparation", date1, time1, "Reminder", false, null);
        Event meeting = new Meeting ("Sprint review with team", date3, time3, "Meeting", false, null);

        reminder.setNote(note1);
        reminderMeeting.setNote(note2);

        michisCalendar.addEntry(event);
        michisCalendar.addEntry(reminder);
        michisCalendar.addEntry(meeting);

        meeting.setReminder(reminderMeeting);

        michisCalendar.printAllEvents();
        michisCalendar.getAllEntries();
        michisCalendar.getSoonestEntry();

        michisCalendar.printReminder(reminderMeeting);



    }
}