package com.blankspace.sort.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class DataGenerator {

    private static final int RECORDS_LENGTH = 10000;

    private static final int RECORD_MAX_VALUE = 999999;

    private static final int RECORD_MIN_VALUE = -1000000;

    private static final String RECORDS_FILE_PATH = "random_case_1.txt";

    private static final String RECORDS_DICTIONARY_PATH = "src/main/resources/cases/";

    public static int[] getRandomRecords() {
        Random random = new Random();
        int[] records = new int[RECORDS_LENGTH];
        for (int i = 0; i < RECORDS_LENGTH; i++) {
            records[i] = random.nextInt(2 * (RECORD_MAX_VALUE + 1)) - RECORD_MAX_VALUE;
        }
        return records;
    }

    public static int[] getReversedRecords() {
        int[] records = getRandomRecords();
        Integer[] boxedArray = Arrays.stream(records).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArray, Comparator.reverseOrder());
        records = Arrays.stream(boxedArray).mapToInt(Integer::intValue).toArray();
        return records;
    }

    public static int[] getFileRecords() {
        return getFileRecords(RECORDS_DICTIONARY_PATH + RECORDS_FILE_PATH);
    }

    private static int[] getFileRecords(String filename) {
        int[] records = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            int num = Integer.parseInt(reader.readLine());
            records = new int[num];
            String[] nums = reader.readLine().split("\\s+");
            for (int i = 0; i < num; i++) {
                records[i] = Integer.parseInt(nums[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }

    public static List<int[]> getFilesRecords() {
        File dictionary = new File(RECORDS_DICTIONARY_PATH);
        List<int[]> recordsList = new ArrayList<>();
        return accessDictionary(dictionary, recordsList);
    }

    private static List<int[]> accessDictionary(File dictionary, List<int[]> recordsList) {
        File[] fileList = dictionary.listFiles();
        if (fileList != null) {
            for (File file : fileList) {
                if (file.isDirectory()) {
                    accessDictionary(file, recordsList);
                }
                if (file.isFile()) {
                    getFileRecords(file.getName());
                }
            }
        }
        return recordsList;
    }

}
