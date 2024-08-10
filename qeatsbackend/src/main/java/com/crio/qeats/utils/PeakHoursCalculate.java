package com.crio.qeats.utils;

import java.time.LocalTime;

public class PeakHoursCalculate {

  

    public static boolean isWithinRange(LocalTime time, LocalTime start, LocalTime end) {
        return !time.isBefore(start) && !time.isAfter(end);
    }



    
}


