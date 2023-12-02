package org.day_one;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class CountPairOfDigitsTest {
    String file1 = "/Users/gim/Scrivania2.0/Programmazione/advent_of_code/src/main/java/org/files/day_one/test1";
    String file2 = "/Users/gim/Scrivania2.0/Programmazione/advent_of_code/src/main/java/org/files/day_one/test2";
    @Test
    void countPairOfDigits() throws IOException {
        assertEquals(142,CountPairOfDigits.countPairOfDigits(file1));
        System.out.println(CountPairOfDigits.countPairOfDigits(file2));
    }
}