package com.WeatherMockito;

public class WeatherService {
	private WeatherAPI wApi;

    public WeatherService(WeatherAPI wApi) {
        this.wApi = wApi;
    }

    public String getWeatherReport(String city) {
        String w = wApi.getWeather(city);
        return "Weather report in " + city + " is " + w;
    }
}
