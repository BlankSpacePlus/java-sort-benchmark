package com.blankspace.sort.util;

import java.util.Random;

public class DataGenerator {

    private static final int RECORDS_LENGTH = 100;

    private static final int RECORD_MAX_VALUE = 999999;

    private static final int RECORD_MIN_VALUE = -1000000;

    public static int[] getRandomRecords() {
        Random random = new Random();
        int[] records = new int[RECORDS_LENGTH];
        for (int i = 0; i < RECORDS_LENGTH; i++) {
            records[i] = random.nextInt(2 * (RECORD_MAX_VALUE + 1)) - RECORD_MAX_VALUE;
        }
        return records;
    }

}
