package com.lclv.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DrinkUtils {


    public static String getCurrentDate() {
        LocalDateTime ldt = LocalDateTime.now();
        return DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.FRANCE).format(ldt);
    }
}
