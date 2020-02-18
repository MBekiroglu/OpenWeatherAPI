package org.spartaglobal.mb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CityByGeographicalCoordinatesTests {
    JsonToObject jsonToObject = new JsonToObject();

    @Test
    public void ShouldReturnCityAsShuzenji() {
        assertEquals("Shuzenji", jsonToObject.byGeographicalCoordinates(35, 139).getName());
    }

    @Test
    public void ShouldReturnCityAsJP() {
        assertEquals("JP", jsonToObject.byGeographicalCoordinates(35, 139).getSys().getCountry());
    }

    @Test
    public void ShouldReturnCityAsLondonAndAllowsNegatives() {
        assertEquals("London", jsonToObject.byGeographicalCoordinates(51.51, -0.13).getName());
    }
}
