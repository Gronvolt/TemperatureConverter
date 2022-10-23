package com.vogella.android.temperatureconverter;


public class ConvertUtil {
    public static float convertFahrenheitToCelsius (float fahrenheit) {
        System.out.println(fahrenheit);
        return ((fahrenheit - 32) * 5 / 9);
    }

    public static float convertCelsiusToFahrenheit (float celsius) {
        System.out.println(celsius);
        return ((celsius * 9) / 5) + 32;
    }
}
