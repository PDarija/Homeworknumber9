package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    Insurance insurance;
    @BeforeEach
    public void setupEachTest() {
        insurance = new Insurance();
    }



    @ValueSource(ints = {18, 19, 25, 28, 29})
    @ParameterizedTest
    public void positiveTestFor120(int clientAge){
        int result = insurance.insurance(clientAge);
        Assertions.assertEquals(120, result, 0.001);
    }

    @ValueSource(ints = {30, 50, 64, 65})
    @ParameterizedTest
    public void positiveTestFor100(int clientAge){
        int result = insurance.insurance(clientAge);
        Assertions.assertEquals(100, result, 0.001);
    }
    @ValueSource(ints = {66, 67, 70, 78, 79})
    @ParameterizedTest
    public void positiveTestFor130(int clientAge){
        int result = insurance.insurance(clientAge);
        Assertions.assertEquals(130, result, 0.001);
    }
    @ValueSource(ints = {17, 80})
    @ParameterizedTest
    public void positiveTestResultZero(int clientAge) {
        int result = insurance.insurance(clientAge);
        Assertions.assertEquals(0, result, 0.001);
    }




}
