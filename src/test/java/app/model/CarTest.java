package app.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class CarTest {
    
    @Test
    public void testMockCar() {
        Car car = mock(Car.class);
        when(car.getMiles()).thenReturn(30);

        assertEquals(30,  car.getMiles());

    }
}
