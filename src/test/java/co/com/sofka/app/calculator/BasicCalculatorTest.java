package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();
    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
    @Test
    @DisplayName("Testing sum: 3-1=2")
    public void resta() {
        // Arrange
        Long number1 = 3L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.resta(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
    @DisplayName("Testing several resta")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,    1,   -1",
            "2,    1,   1",
            "49,  51, -2",
            "1,  100, -99"
    })
    public void severalRestas(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.resta(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
    @DisplayName("Testing several resta")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "1,    0,   0",
            "12,    12,   144",
            "5,  5, 25",
            "-1,  -1, 1",
            "5,    -5,  -25"
    })
    public void severalMultiplicaciones(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiplicacion(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
}