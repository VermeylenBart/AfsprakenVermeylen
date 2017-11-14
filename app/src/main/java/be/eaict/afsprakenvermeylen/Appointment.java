package be.eaict.afsprakenvermeylen;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Appointment {

    /* Id */
    private int id;

    /* Time slot */
    private int day;
    private int month;
    private int year;
    private int hour;
    private int minute;

    /* Contact */
    private String contactName;
    private String location;
    private String reason;

    public Appointment(int id, int day, int month, int year, int hour, int minute, String contactName, String location, String reason) {
        this.id = id;
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.contactName = contactName;
        this.location = location;
        this.reason = reason;
    }

    public long getTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.year, this.month - 1, this.day, this.hour, this.minute);
        return calendar.getTimeInMillis();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getFormatedTIme(String formatDate){
        SimpleDateFormat sdf = new SimpleDateFormat(formatDate);
        return sdf.format(new Date(getTime()));
    }
}
