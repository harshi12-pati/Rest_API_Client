package org.weatherapp.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.weatherapp.model.WeatherData;
import org.weatherapp.util.HttpClientUtil;

import java.io.IOException;

public class WeatherService {

    private final WeatherData weatherData;
    // constructor dependency injection
    public WeatherService(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void getWeather(String city) throws IOException {
            // get raw json response from API
            String jsonResponse = HttpClientUtil.getWeatherData(city);
            // Parse the JSON response using Gson
            JsonObject  jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();
            // // Extract necessary data from JSON
        weatherData.setCity(jsonObject.get("name").getAsString());
        weatherData.setCountry(jsonObject.getAsJsonObject("sys").get("country").getAsString());
        weatherData.setTemperature(jsonObject.getAsJsonObject("main").get("temp").getAsDouble());
        weatherData.setHumidity(jsonObject.getAsJsonObject("main").get("humidity").getAsInt());
        weatherData.setWeatherDescription(jsonObject.getAsJsonArray("weather").get(0).getAsJsonObject().get("description").getAsString());
        weatherData.setWindSpeed(jsonObject.getAsJsonObject("wind").get("speed").getAsDouble());

    }
}
