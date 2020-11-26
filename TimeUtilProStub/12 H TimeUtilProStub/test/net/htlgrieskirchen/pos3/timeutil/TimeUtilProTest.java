/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos3.timeutil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lisa
 */
public class TimeUtilProTest {

    public TimeUtilProTest() {

    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of intToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testIntToLocalDate01() {
        System.out.println("intToLocalDate normal");
        int date = 20030201;
        LocalDate expResult = LocalDate.of(2003, 02, 01);
        LocalDate result = TimeUtilPro.intToLocalDate(date);
        assertEquals(expResult, result);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testIntToLocalDate02() {
        System.out.println("intToLocalDate zu kurzer Parameter");
        int date = 2003;
        TimeUtilPro.intToLocalDate(date);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIntToLocalDate03() {
        System.out.println("intToLocalDate negativer Parameter");
        int date = -20030201;
        TimeUtilPro.intToLocalDate(date);
    }

    /**
     * Test of longToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testLongToLocalDate01() {
        System.out.println("longToLocalDate normal");
        long dateTime = 200302011234L;
        LocalDate expResult = LocalDate.of(2003, 02, 01);
        LocalDate result = TimeUtilPro.longToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testLongToLocalDate02() {
        System.out.println("longToLocalDate kurzer Parameter");
        long dateTime = 2003020;
        TimeUtilPro.longToLocalDate(dateTime);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLongToLocalDate03() {
        System.out.println("longToLocalDate negativer Parameter");
        long dateTime = -200302011234L;
        TimeUtilPro.longToLocalDate(dateTime);
    }

    /**
     * Test of dateToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testDateToLocalDate01() {
        System.out.println("dateToLocalDate normal");
        Date dateTime = new Date(103, 01, 01);
        LocalDate expResult = LocalDate.parse("2003-02-01");
        LocalDate result = TimeUtilPro.dateToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    @Test(expected = NullPointerException.class)
    public void testDateToLocalDate02() {
        System.out.println("dateToLocalDate null wert");
        TimeUtilPro.dateToLocalDate(null);
    }

    /**
     * Test of calendarToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testCalendarToLocalDate01() {
        System.out.println("calendarToLocalDate");
        Calendar dateTime = Calendar.getInstance();
        LocalDate expResult = LocalDate.now();
        LocalDate result = TimeUtilPro.calendarToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    @Test(expected = NullPointerException.class)
    public void testCalendarToLocalDate02() {
        System.out.println("calendarToLocalDate");
        TimeUtilPro.calendarToLocalDate(null);
    }

    /**
     * Test of intToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testIntToLocalDateTime01() {
        System.out.println("intToLocalDateTime");
        int date = 20030201;
        LocalDateTime expResult = LocalDateTime.of(2003, 02, 01, 00, 00);
        LocalDateTime result = TimeUtilPro.intToLocalDateTime(date);
        assertEquals(expResult, result);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testIntToLocalDateTime02() {
        System.out.println("intToLocalDateTime Parameter ist negativ");
        int date = -20030201;
        TimeUtilPro.intToLocalDateTime(date);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIntToLocalDateTime03() {
        System.out.println("intToLocalDateTime Parameter zu kurz");
        int date = 0201;
        TimeUtilPro.intToLocalDateTime(date);
    }

    /**
     * Test of longToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testLongToLocalDateTime01() {
        System.out.println("longToLocalDateTime");
        long dateTime = 200302011234L;
        LocalDateTime expResult = LocalDateTime.of(2003, 02, 01, 12, 34);
        LocalDateTime result = TimeUtilPro.longToLocalDateTime(dateTime);
        assertEquals(expResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLongToLocalDateTime02() {
        System.out.println("longToLocalDateTime kurzer Parameter");
        long dateTime = 2003234L;
        TimeUtilPro.longToLocalDateTime(dateTime);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLongToLocalDateTime03() {
        System.out.println("longToLocalDateTime negativer Parameter");
        long dateTime = -200302011234L;
        TimeUtilPro.longToLocalDateTime(dateTime);
    }

    /**
     * Test of dateToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testDateToLocalDateTime01() {
        System.out.println("dateToLocalDateTime");
        Date dateTime = new Date(103, 01, 01, 12, 34);
        LocalDateTime expResult = LocalDateTime.of(2003, 02, 01, 12, 34);
        LocalDateTime result = TimeUtilPro.dateToLocalDateTime(dateTime);
        assertEquals(expResult, result);
    }

    @Test(expected = NullPointerException.class)
    public void testDateToLocalDateTime02() {
        System.out.println("dateToLocalDateTime null");
        TimeUtilPro.dateToLocalDateTime(null);
    }

    /**
     * Test of calendarToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testCalendarToLocalDateTime01() {
        System.out.println("calendarToLocalDateTime");
        Calendar dateTime = new GregorianCalendar(2003, 02, 01, 12, 34);
        LocalDateTime expResult = LocalDateTime.of(2003, 02, 01, 12, 34);
        LocalDateTime result = TimeUtilPro.calendarToLocalDateTime(dateTime);
        assertEquals(expResult, result);
    }

    @Test(expected = NullPointerException.class)
    public void testCalendarToLocalDateTime02() {
        System.out.println("calendarToLocalDateTime");
        TimeUtilPro.calendarToLocalDateTime(null);
    }

    /**
     * Test of localDateToInt method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToInt01() {
        System.out.println("localDateToInt");
        LocalDate date = LocalDate.of(2003, 02, 01);
        int expResult = 20030201;
        int result = TimeUtilPro.localDateToInt(date);
        assertEquals(expResult, result);

    }

    @Test(expected = NullPointerException.class)
    public void testLocalDateToInt02() {
        System.out.println("localDateToInt");
        TimeUtilPro.localDateToInt(null);

    }

    /**
     * Test of localDateTimeToInt method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToInt01() {
        System.out.println("localDateTimeToInt");
        LocalDateTime dateTime = LocalDateTime.of(2003, 02, 01, 12, 34);
        int expResult = 20030201;
        int result = TimeUtilPro.localDateTimeToInt(dateTime);
        assertEquals(expResult, result);

    }

    @Test(expected = NullPointerException.class)
    public void testLocalDateTimeToInt02() {
        System.out.println("localDateTimeToInt");
        TimeUtilPro.localDateTimeToInt(null);

    }

    /**
     * Test of localDateToLong method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToLong01() {
        System.out.println("localDateToLong");
        LocalDate date = LocalDate.of(2003, 02, 01);
        long expResult = 200302010000L;
        long result = TimeUtilPro.localDateToLong(date);
        assertEquals(expResult, result);

    }

    @Test(expected = NullPointerException.class)
    public void testLocalDateToLong02() {
        System.out.println("localDateToLong");
        TimeUtilPro.localDateToLong(null);

    }

    /**
     * Test of localDateTimeToLong method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToLong01() {
        System.out.println("localDateTimeToLong");
        LocalDateTime dateTime = LocalDateTime.of(2003, 02, 01, 12, 34);
        long expResult = 200302011234L;
        long result = TimeUtilPro.localDateTimeToLong(dateTime);
        assertEquals(expResult, result);

    }

    @Test(expected = NullPointerException.class)
    public void testLocalDateTimeToLong02() {
        System.out.println("localDateTimeToLong");
        TimeUtilPro.localDateTimeToLong(null);

    }

    /**
     * Test of localDateToDate method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToDate01() {
        System.out.println("localDateToDate");
        LocalDate date = LocalDate.of(2003, 02, 01);
        Date expResult = new Date(103, 01, 01);
        Date result = TimeUtilPro.localDateToDate(date);
        assertEquals(expResult, result);
    }

    @Test(expected = NullPointerException.class)
    public void testLocalDateToDate02() {
        System.out.println("localDateToDate");
        TimeUtilPro.localDateToDate(null);

    }

    /**
     * Test of localDateTimeToDate method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToDate01() {
        System.out.println("localDateTimeToDate");
        LocalDateTime dateTime = LocalDateTime.of(2003, 02, 01, 00, 00);
        Date expResult = new Date(103, 01, 01);
        Date result = TimeUtilPro.localDateTimeToDate(dateTime);
        assertEquals(expResult, result);

    }

    @Test(expected = NullPointerException.class)
    public void testLocalDateTimeToDate02() {
        System.out.println("localDateTimeToDate");
        TimeUtilPro.localDateTimeToDate(null);

    }

    /**
     * Test of localDateToCalendar method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToCalendar01() {
        System.out.println("localDateToCalendar");
        LocalDate date = LocalDate.of(2003, 02, 01);
        Calendar expResult = new GregorianCalendar(2003, 02, 01);
        Calendar result = TimeUtilPro.localDateToCalendar(date);
        assertEquals(expResult, result);

    }

    @Test(expected = NullPointerException.class)
    public void testLocalDateToCalendar02() {
        System.out.println("localDateToCalendar");
        TimeUtilPro.localDateToCalendar(null);

    }

    /**
     * Test of localDateTimeToCalendar method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToCalendar01() {
        System.out.println("localDateTimeToCalendar");
        LocalDateTime dateTime = LocalDateTime.of(2003, 02, 01, 12, 34);
        Calendar expResult = new GregorianCalendar(2003, 02, 01, 12, 34);
        Calendar result = TimeUtilPro.localDateTimeToCalendar(dateTime);
        assertEquals(expResult, result);

    }

    @Test(expected = NullPointerException.class)
    public void testLocalDateTimeToCalendar02() {
        System.out.println("localDateTimeToCalendar");
        TimeUtilPro.localDateTimeToCalendar(null);

    }

}
