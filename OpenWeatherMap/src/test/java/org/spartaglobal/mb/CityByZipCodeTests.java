package org.spartaglobal.mb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CityByZipCodeTests {
    JsonToObject jsonToObject = new JsonToObject();

    @Test
    public void ShouldReturnCityAsUSEvenWithUpperCase() {
        assertEquals("US", jsonToObject.byZIPCode(94040, "US").getSys().getCountry());
    }

    @Test
    public void ShouldReturnCityAsUSEveWithLowerCase() {
        assertEquals("US", jsonToObject.byZIPCode(94040, "us").getSys().getCountry());
    }

    @Test
    public void ShouldReturnSacramento() {
        assertEquals("Sacramento", jsonToObject.byZIPCode(95814, "us").getName());
    }

    @Test
    public void ShouldReturnDenver() {
        assertEquals("Denver", jsonToObject.byZIPCode(80202, "us").getName());
    }
}
