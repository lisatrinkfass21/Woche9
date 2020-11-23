package net.htlgrieskirchen.pos3.timeutil;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeUtilPro {

    private TimeUtilPro() {
    }

    // ########## LOCALDATE METHODS ##########
    public static LocalDate intToLocalDate(int date) {
        String s = String.valueOf(date);
        String year = s.substring(0, 4);
        String month = s.substring(4, 6);
        String day = s.substring(6);
        LocalDate ld = LocalDate.parse(year + "-" + month + "-" + day);
        return ld;
    }

    public static LocalDate longToLocalDate(long dateTime) {
        String s = String.valueOf(dateTime);
        String year = s.substring(0, 4);
        String month = s.substring(4, 6);
        String day = s.substring(6, 8);
        LocalDate ld = LocalDate.parse(year + "-" + month + "-" + day);
        return ld;
    }

    public static LocalDate dateToLocalDate(Date dateTime) {
        LocalDate dt = dateTime.toInstant().atZone(ZoneId.systemDefault())
                .toLocalDate();
        //Zone wird die standard zone eigngestellt == +1 h
        return dt;
    }

    public static LocalDate calendarToLocalDate(Calendar dateTime) {
        LocalDate dt = LocalDateTime.ofInstant(dateTime.toInstant(), dateTime.getTimeZone()
                .toZoneId()).toLocalDate();
        //es wird die selbe Zeitzone wie im Calendar genommen
        return dt;
    }

    // ########## LOCALDATETIME METHODS ##########
    public static LocalDateTime intToLocalDateTime(int date) {
        String s = String.valueOf(date);
        String year = s.substring(0, 4);
        String month = s.substring(4, 6);
        String day = s.substring(6, 8);
        LocalDateTime ld = LocalDate.parse(year + "-" + month + "-" + day).atStartOfDay();
        return ld;
    }

    public static LocalDateTime longToLocalDateTime(long dateTime) {
        String s = String.valueOf(dateTime);
        String year = s.substring(0, 4);
        String month = s.substring(4, 6);
        String day = s.substring(6, 8);
        String hour = s.substring(8, 10);
        String minute = s.substring(10, 12);
        LocalDateTime ld = LocalDateTime.parse(year + "-" + month + "-" + day + "T" + hour + ":" + minute);
        return ld;
    }

    public static LocalDateTime dateToLocalDateTime(Date dateTime) {
        LocalDateTime ldt = LocalDateTime.ofInstant(dateTime.toInstant(), ZoneId.systemDefault());
        return ldt;
    }

    public static LocalDateTime calendarToLocalDateTime(Calendar dateTime) {
        int year = dateTime.get(Calendar.YEAR);
        int month = dateTime.get(Calendar.MONTH);
        int day = dateTime.get(Calendar.DAY_OF_MONTH);
        int hour = dateTime.get(Calendar.HOUR_OF_DAY);//in 24 studen -> ohne of_day in 12 stunden
        int minute = dateTime.get(Calendar.MINUTE);

        LocalDateTime ldt = LocalDateTime.of(year, month, day, hour, minute);

        return ldt;
    }

    // ########## INT METHODS ##########
    public static int localDateToInt(LocalDate date) {
        return -1;
    }

    public static int localDateTimeToInt(LocalDateTime dateTime) {
        return -1;
    }

    // ########## LONG METHODS ##########
    public static long localDateToLong(LocalDate date) {
        return -1L;
    }

    public static long localDateTimeToLong(LocalDateTime dateTime) {
        return -1L;
    }

    // ########## DATE METHODS ##########
    @SuppressWarnings("deprecation")
    public static Date localDateToDate(LocalDate date) {
        return null;
    }

    @SuppressWarnings("deprecation")
    public static Date localDateTimeToDate(LocalDateTime dateTime) {
        return null;
    }

    // ########## CALENDAR METHODS ##########
    public static Calendar localDateToCalendar(LocalDate date) {
        return null;
    }

    public static Calendar localDateTimeToCalendar(LocalDateTime dateTime) {
        return null;
    }

}
