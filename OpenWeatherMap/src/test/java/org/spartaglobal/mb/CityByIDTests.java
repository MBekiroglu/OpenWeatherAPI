package org.spartaglobal.mb;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CityByIDTests {
    JsonToObject jsonToObject = new JsonToObject();

    @Test
    public void ShouldReturnCityAsLondon() {
        assertEquals("London", jsonToObject.byCityID(2643743).getName());
    }

    @Test
    public void ShouldReturnCityAsSydney() {
        assertEquals("Sydney", jsonToObject.byCityID(2147714).getName());
    }

    @Test
    public void ShouldReturnCityAU() {
        assertEquals("AU", jsonToObject.byCityID(2147714).getSys().getCountry());
    }
}
