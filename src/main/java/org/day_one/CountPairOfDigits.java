package org.day_one;

import org.files.GetLines;
import org.files.day_one.LineToWords;

import javax.sound.sampled.Line;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountPairOfDigits {
    public static int countPairOfDigits(String file) throws IOException {
        int sum = 0;
        for (String currLine : GetLines.getLines(file)){
            StringBuilder currLineStringBuilder = new StringBuilder(currLine);
            sum += findFirstDigit(currLine)*10 + findFirstDigit(currLineStringBuilder.reverse().toString());
        }
        return sum;
    }

    private static int findFirstDigit(String line){
        for (Character currChar : line.toCharArray()){
            if (!Character.isDigit(currChar))continue;
            return Character.getNumericValue(currChar);
        }

        return 0;
    }
}
