package com.WeatherMockito;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class WeatherServiceTest {

	@Test
	void test() {
		WeatherAPI wMock = mock(WeatherAPI.class);
        // Stub Method
        when(wMock.getWeather("New York")).thenReturn("sunny");
        // Using Mock in WeatherService
        WeatherService service = new WeatherService(wMock);
        String ans = service.getWeatherReport("New York"); 
        // Assert
        assertEquals("Weather report in New York is sunny",ans);
	}

}
