package ro.fasttrackit.curs15.ExercitiuTDD;

public class TemperatureConverter {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}
