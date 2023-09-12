package model;

import java.util.List;

public abstract class Entry {
    private String date;
    private String time;
    private String type;

    public Entry(String date, String time, String type) {
    }

        // getters, setters
        public abstract void getDate();
        public abstract void getTime ();
        public abstract void getLabel ();
        public abstract void isRepeating ();
        public abstract void getIntervalOfRepetition ();
        public abstract void setInterval ();


}
