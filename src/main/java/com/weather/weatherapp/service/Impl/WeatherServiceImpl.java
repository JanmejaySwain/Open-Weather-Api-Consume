package com.weather.weatherapp.service.Impl;

import com.weather.weatherapp.service.WeatherService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherServiceImpl implements WeatherService {
    private RestTemplate restTemplate;
    private static  final String WEATHER_REPORT="https://api.openweathermap.org/data/2.5/weather?id=1275817&lang=hi&appid=bb5d7ed2b12590ba0c1ce552cc4b0b27";
    public WeatherServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String getLiveWeatherReport() {
       return restTemplate.getForObject(WEATHER_REPORT,String.class);
    }
}
