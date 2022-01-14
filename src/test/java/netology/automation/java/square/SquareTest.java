package netology.automation.java.square;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @ParameterizedTest
    @CsvSource(
            value = {"test 1, 200, 300, 3",
                    "test 2, 100, 400, 11",
                    "test 3, 200, 400, 6",
                    "test 4, 0, 100, 1"
            }
    )
    void payment( String test, int downBorder,int upBorder,int expected) {
        Square service = new Square();


        long actual = service.payment(downBorder,upBorder);

        assertEquals(expected,actual);

    }
}