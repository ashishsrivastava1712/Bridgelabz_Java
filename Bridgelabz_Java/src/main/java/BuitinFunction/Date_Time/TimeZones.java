/*
 * Author: Ashish Srivastava
 * Problem Description: Write a program that displays the current time in
 * different time zones: GMT, IST, and PST. Use ZonedDateTime and ZoneId
 * to work with different time zones.
 * Program: Time Zones and ZonedDateTime
 */

import java.time.ZoneId;
import java.time.ZonedDateTime;

class TimeZones {

    // Method to display time for a given time zone
    public static void displayTime(String zoneName, String zoneId) {
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zoneId));

        System.out.println(zoneName + ": " + time);
    }

    public static void main(String[] args) {

        displayTime("GMT", "GMT");
        displayTime("IST", "Asia/Kolkata");
        displayTime("PST", "America/Los_Angeles");
    }
}