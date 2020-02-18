package org.spartaglobal.mb;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CityByNameTests {
    JsonToObject jsonToObject = new JsonToObject();

    @Test
    public void shouldReturnCityAsLondon() {
        assertEquals("London", jsonToObject.byCityName("London").getName());
    }

    @Test
    public void shouldReturnCityAsColombo() {
        assertEquals("Colombo", jsonToObject.byCityName("Colombo").getName());
    }

    @Test
    public void shouldReturnCityAsHongKong() {
        assertEquals("Hong Kong", jsonToObject.byCityName("Hong Kong").getName());
    }

    @Test
    public void shouldReturnSameRegardlessOfLowercase() {
        assertEquals("London", jsonToObject.byCityName("london").getName());
    }

    @Test
    public void shouldReturnSameRegardlessOfUpperCase() {
        assertEquals("London", jsonToObject.byCityName("LONDON").getName());
    }

    @Test
    public void shouldReturnLondonWhilstInputtingTheState() {
        assertEquals("London", jsonToObject.byCityName("London", "Greater").getName());
    }

    @Test
    public void shouldReturnLondonWhilstInputtingTheStateAndCountryCode() {
        assertEquals("London", jsonToObject.byCityName("London", "Greater", 44).getName());
    }

    @Test
    public void shouldReturnCoordLonAsNegativeZeroPointOneThree() {
        assertEquals(-0.13, jsonToObject.byCityName("London").getCoord().getLon());
    }

    @Test
    public void shouldReturnCoordLatAsFiftyOnePointFiftyOne() {
        assertEquals(51.51, jsonToObject.byCityName("London").getCoord().getLat());
    }

    @Test
    public void shouldReturnWeatherIdAs500IfItIsRainingOutside() {
        assertEquals(500, jsonToObject.byCityName("London").getWeather().get(0).getId());
    }

    @Test
    public void shouldReturnWeatherAsRainingIfRainingInLondon() {
        assertEquals("Rain", jsonToObject.byCityName("London").getWeather().get(0).getMain());
    }

    @Test
    public void shouldReturnWeatherDescriptionAsLightRain() {
        assertEquals("light rain", jsonToObject.byCityName("London").getWeather().get(0).getDescription());
    }

    @Test
    public void shouldReturnWeatherIconAsTenN() {
        assertEquals("10n", jsonToObject.byCityName("London").getWeather().get(0).getIcon());
    }

    @Test
    public void shouldReturnBaseAsStations() {
        assertEquals("stations", jsonToObject.byCityName("London").getBase());
    }

    @Test
    public void shouldReturnMainTempAs284() {
        assertEquals(284.86, jsonToObject.byCityName("London").getMain().getTemp());
    }

    @Test
    public void shouldReturnVisibilityAs8000() {
        assertEquals(8000, jsonToObject.byCityName("London").getVisibility());
    }

    @Test
    public void shouldReturnWindSpeedAs10() {
        assertEquals(10.8, jsonToObject.byCityName("London").getWind().getSpeed());
    }

    @Test
    public void shouldReturnWindDegAs210() {
        assertEquals(210, jsonToObject.byCityName("London").getWind().getDeg());
    }

    @Test
    public void shouldReturnDTAs1581797245() {
        assertEquals(1581797245, jsonToObject.byCityName("London").getDt());
    }

    @Test
    public void shouldReturnTimeZoneCorrectly() {
        assertEquals(0, jsonToObject.byCityName("London").getTimezone());
    }

    @Test
    public void shouldReturnCountryAsGB() {
        assertEquals("GB", jsonToObject.byCityName("London").getSys().getCountry());
    }
}