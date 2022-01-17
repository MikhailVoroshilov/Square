package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(
            value = {"should numberSquare from 200 to 300, 200, 300, 3",
                    "should numberSquare from 100 to 400, 100, 400, 11",
                    "should numberSquare from 200 to 400, 200, 400, 6",
                    "should numberSquare from 0 to 100, 0, 100, 1"
            }
    )
    void numberSquare(String test, int downBorder, int upBorder, int expected) {
        SQRService service = new SQRService();


        long actual = service.numberSquare(downBorder, upBorder);

        assertEquals(expected, actual);

    }
}