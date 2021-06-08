package ro.fasttrackit.curs15.ExercitiuTDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.offset;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TemperatureConverterTest {
    TemperatureConverter temperatureConverter;

    @BeforeEach
    void setup() {
        temperatureConverter = new TemperatureConverter();
    }

    @Test
    @DisplayName("conversion from  fahrenheit to celsius OK")
    void fahrenheitToCelsius() {
        assertThat(temperatureConverter.fahrenheitToCelsius(100)).isEqualTo(37.77777777777778);
        assertThat(temperatureConverter.fahrenheitToCelsius(0)).isEqualTo(-17.77777777777778);
        assertThat(temperatureConverter.fahrenheitToCelsius(50)).isEqualTo(10);
    }

    @Test
    @DisplayName("conversion from celsius to fahrenheit OK")
    void celsiusToFahrenheit() {
        assertThat(temperatureConverter.celsiusToFahrenheit(30)).isEqualTo(86);
        assertThat(temperatureConverter.celsiusToFahrenheit(0)).isEqualTo(32);
        assertThat(temperatureConverter.celsiusToFahrenheit(-20)).isEqualTo(-4);
    }
}
