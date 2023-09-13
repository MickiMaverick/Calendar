package model;

public abstract class Entry {
    public String title, interval;
    public Date date;
    public Time time;
    public String type;
    public Boolean repeating;

    public Entry(String title, Date date, Time time, String type, Boolean repeating, String interval) {
        this.title = title;
        this.interval = interval;
        this.date = date;
        this.time = time;
        this.type = type;
        this.repeating = repeating;
    }

        // getters, setters
        public String getTitle() {
            return title;
        }
        public String getDate() {
            return date.getDateNum();
        }
        public String getTime() {
            return time.getTime24();
        }
        public String getType() {
            return type;
        }
        public Boolean isRepeating() {
            return repeating;
        }
        public String getIntervalOfRepetition() {
            return interval;
        }

    //public abstract void setInterval()


}
