package org.files.day_one;

import java.util.Arrays;
import java.util.List;

public class LineToWords {
    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").split("\\s+"));
    }
}
