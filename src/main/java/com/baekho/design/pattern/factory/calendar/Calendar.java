package com.baekho.design.pattern.factory.calendar;

import java.util.Locale;
import java.util.TimeZone;

public class Calendar {

    public static Calendar getInstance(TimeZone zone) {
        return createCalendar(zone, Locale.getDefault(Locale.Category.FORMAT));
    }

    private static Calendar createCalendar(TimeZone zone, Locale aLocale) {
        if (TimeZone.getTimeZone("1").equals(zone)) {
            return new OneCalendar();
        }
        return new Calendar();
    }
}
