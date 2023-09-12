package model;

public class Date {

    private int dayNum, monthNum, yearNum;
    private String dayName, monthName, yearName;

    public Date(int dayNum, int monthNum, int yearNum) {
        this.dayNum = dayNum;
        this.monthNum = monthNum;
        this.yearNum = yearNum;
    }

    // getters
    public String getDateNum() {return monthNum + "-" + dayNum + "-" + yearNum;}
    public String getDateName() {return monthName + " " + dayName + "," + yearName;}

}
