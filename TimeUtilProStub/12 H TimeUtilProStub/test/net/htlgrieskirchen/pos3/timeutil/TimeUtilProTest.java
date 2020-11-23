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
    public void testIntToLocalDate() {
        System.out.println("intToLocalDate");
        int date = 20030201;
        LocalDate expResult = LocalDate.of(2003, 02, 01);
        LocalDate result = TimeUtilPro.intToLocalDate(date);
        assertEquals(expResult, result);

    }

    /**
     * Test of longToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testLongToLocalDate() {
        System.out.println("longToLocalDate");
        long dateTime = 200302011234L;
        LocalDate expResult = LocalDate.of(2003, 02, 01);
        LocalDate result = TimeUtilPro.longToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    /**
     * Test of dateToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testDateToLocalDate() {
        System.out.println("dateToLocalDate");
        Date dateTime = new Date(103, 01, 01);
        LocalDate expResult = LocalDate.parse("2003-02-01");
        LocalDate result = TimeUtilPro.dateToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    /**
     * Test of calendarToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testCalendarToLocalDate() {
        System.out.println("calendarToLocalDate");
        Calendar dateTime = Calendar.getInstance();
        LocalDate expResult = LocalDate.now();
        LocalDate result = TimeUtilPro.calendarToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    /**
     * Test of intToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testIntToLocalDateTime() {
        System.out.println("intToLocalDateTime");
        int date = 20030201;
        LocalDateTime expResult = LocalDateTime.of(2003, 02, 01, 00, 00);
        LocalDateTime result = TimeUtilPro.intToLocalDateTime(date);
        assertEquals(expResult, result);

    }

    /**
     * Test of longToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testLongToLocalDateTime() {
        System.out.println("longToLocalDateTime");
        long dateTime = 200302011234L;
        LocalDateTime expResult = LocalDateTime.of(2003, 02, 01, 12, 34);
        LocalDateTime result = TimeUtilPro.longToLocalDateTime(dateTime);
        assertEquals(expResult, result);
    }

    /**
     * Test of dateToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testDateToLocalDateTime() {
        System.out.println("dateToLocalDateTime");
        Date dateTime = new Date(103, 01, 01, 12, 34);
        LocalDateTime expResult = LocalDateTime.of(2003, 02, 01, 12, 34);
        LocalDateTime result = TimeUtilPro.dateToLocalDateTime(dateTime);
        assertEquals(expResult, result);
    }

    /**
     * Test of calendarToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testCalendarToLocalDateTime() {
        System.out.println("calendarToLocalDateTime");
        Calendar dateTime = new GregorianCalendar(2003, 02, 01, 12, 34);
        LocalDateTime expResult = LocalDateTime.of(2003, 02, 01, 12, 34);
        LocalDateTime result = TimeUtilPro.calendarToLocalDateTime(dateTime);
        assertEquals(expResult, result);
    }

    /**
     * Test of localDateToInt method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToInt() {
        System.out.println("localDateToInt");
        LocalDate date = LocalDate.of(2003, 02, 01);
        int expResult = 20030201;
        int result = TimeUtilPro.localDateToInt(date);
        assertEquals(expResult, result);

    }

    /**
     * Test of localDateTimeToInt method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToInt() {
        System.out.println("localDateTimeToInt");
        LocalDateTime dateTime = LocalDateTime.of(2003, 02, 01, 12, 34);
        int expResult = 20030201;
        int result = TimeUtilPro.localDateTimeToInt(dateTime);
        assertEquals(expResult, result);

    }

    /**
     * Test of localDateToLong method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToLong() {
        System.out.println("localDateToLong");
        LocalDate date = LocalDate.of(2003, 02, 01);
        long expResult = 200302010000L;
        long result = TimeUtilPro.localDateToLong(date);
        assertEquals(expResult, result);

    }

    /**
     * Test of localDateTimeToLong method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToLong() {
        System.out.println("localDateTimeToLong");
        LocalDateTime dateTime = LocalDateTime.of(2003, 02, 01, 12, 34);
        long expResult = 200302011234L;
        long result = TimeUtilPro.localDateTimeToLong(dateTime);
        assertEquals(expResult, result);

    }

    /**
     * Test of localDateToDate method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToDate() {
        System.out.println("localDateToDate");
        LocalDate date = LocalDate.of(2003, 02, 01);
        Date expResult = new Date(103, 01, 01);
        Date result = TimeUtilPro.localDateToDate(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of localDateTimeToDate method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToDate() {
        System.out.println("localDateTimeToDate");
        LocalDateTime dateTime = LocalDateTime.of(2003, 02, 01, 00, 00);
        Date expResult = new Date(103, 01, 01);
        Date result = TimeUtilPro.localDateTimeToDate(dateTime);
        assertEquals(expResult, result);

    }

    /**
     * Test of localDateToCalendar method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToCalendar() {
        System.out.println("localDateToCalendar");
        LocalDate date = LocalDate.of(2003, 02, 01);
        Calendar expResult = new GregorianCalendar(2003, 02, 01);
        Calendar result = TimeUtilPro.localDateToCalendar(date);
        assertEquals(expResult, result);

    }

    /**
     * Test of localDateTimeToCalendar method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToCalendar() {
        System.out.println("localDateTimeToCalendar");
        LocalDateTime dateTime = LocalDateTime.of(2003, 02, 01, 12, 34);
        Calendar expResult = new GregorianCalendar(2003, 02, 01, 12, 34);
        Calendar result = TimeUtilPro.localDateTimeToCalendar(dateTime);
        assertEquals(expResult, result);

    }

}
