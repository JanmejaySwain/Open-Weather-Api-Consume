package com.weather.weatherapp.controller;

import com.weather.weatherapp.service.WeatherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WeatherController {
    private WeatherService weatherService;
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;

    }

    @GetMapping("/weather_report")
    public ResponseEntity<String> liveWeatherDetails()
    {
        return new ResponseEntity<>(weatherService.getLiveWeatherReport(), HttpStatus.OK);
    }
}
