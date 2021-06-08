package ro.fasttrackit.curs15;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("sum method works")
    void simpleSum() {
        assertThat(calculator.sum(1, 1)).isEqualTo(2);
        assertThat(calculator.sum(2, 3)).isEqualTo(5);
    }

    @Test
    @DisplayName("dif method works")
    void simpleDif() {
        assertThat(calculator.dif(5, 4)).isEqualTo(1);
        assertThat(calculator.dif(5, 8)).isEqualTo(-3);
        assertThat(calculator.dif(-1, -2)).isEqualTo(1);
    }

    @Test
    @DisplayName("inmultirea merge")

    void simpleInmultire(){
        assertThat(calculator.inmultire(2,3)).isEqualTo(6);
        assertThat(calculator.inmultire(2,0)).isEqualTo(0);
    }

    @Test
    @DisplayName("impartirea merge")
    void simpleImpartire(){
        assertThat(calculator.impartire(5,5)).isEqualTo(1);
        assertThat(calculator.impartire(-10,3)).isEqualTo(-3.33, Offset.offset(.1));
    }
}
