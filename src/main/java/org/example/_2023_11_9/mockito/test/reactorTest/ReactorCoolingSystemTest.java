package org.example._2023_11_9.mockito.test.reactorTest;

import org.example._2023_11_9.mockito.reactor.ReactorCoolingSystem;
import org.example._2023_11_9.mockito.reactor.Thermometer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ReactorCoolingSystemTest {

    @InjectMocks  // Instantiates R/C System then injects Thermometer mock into it
    ReactorCoolingSystem reactorCoolingSystem;

    @Mock
    Thermometer thermometer;

    @Test
    void testReactorCoolingSystemON() {
        when(thermometer.getTemperature()).thenReturn(250.0);
        reactorCoolingSystem.setTemperatureThreshold(240.0);
        reactorCoolingSystem.checkReactorCoolingSystem();
        assertTrue(reactorCoolingSystem.isOn());
        verify(thermometer, times(1)).getTemperature();
    }

    @Test
    void testReactorCoolingSystemOFF() {
        when(thermometer.getTemperature()).thenReturn(230.0);
        reactorCoolingSystem.setTemperatureThreshold(240.0);
        reactorCoolingSystem.checkReactorCoolingSystem();
        assertFalse(reactorCoolingSystem.isOn());
        verify(thermometer, times(1)).getTemperature();
    }
}