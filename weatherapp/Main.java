package org.weatherapp;

import org.weatherapp.model.WeatherData;
import org.weatherapp.service.WeatherService;
import org.weatherapp.util.HttpClientUtil;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        WeatherService weatherService = new WeatherService(weatherData);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter city:");
        String city = scanner.nextLine();

        try {
            weatherService.getWeather(city);

            //display weather data
            System.out.println(weatherData);
        } catch (IOException e) {
            System.out.println("Error fetching weather data: " + e.getMessage());
        }


    }
}