package com.example.praktikum9_ti_c.helper;

import java.text.*;
import java.util.*;

public class DateHelper {
    public static String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault());
        Date date = new Date();
        return dateFormat.format(date);
    }
}
