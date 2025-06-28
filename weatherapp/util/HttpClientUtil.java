package org.weatherapp.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class HttpClientUtil {
    //send an HTTP request to the weather API and return the JSON response.
    private static final String API_KEY = "your_api_key";
    private static final String BASE_URL ="https://api.openweathermap.org/data/2.5/weather?q=%s&units=%s&units=metric&appid=%s";



    public static String getWeatherData(String city) throws IOException {
        String urlString = String.format(BASE_URL, city,"metric", API_KEY);
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        //Get for retrieve data from API
        connection.setRequestMethod("GET");
        // set time out for 5 seconds
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);;

        int responseCode = connection.getResponseCode();
        // response code 200 that is OK
        //If the response is not 200, we throw an exception
        if(responseCode != 200){
            throw new IOException("Failed to fetch weather data. HTTP response code: " + responseCode);

        }

        Scanner scanner = new Scanner(url.openStream());
        StringBuilder response = new StringBuilder();
        while (scanner.hasNext()) {
            response.append(scanner.nextLine());
        }
        scanner.close();
        // return json response
        return response.toString();

    }
}

