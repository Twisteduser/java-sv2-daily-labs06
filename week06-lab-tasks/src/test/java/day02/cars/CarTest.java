package day02.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    Car car = new Car("Toyota",1.2,Color.BLUE,120);

    @Test
    void createCarTest(){
        Car car = new Car("Toyota",1.2,Color.BLUE,120);
        assertEquals("Toyota",car.getBrand());
        assertEquals(1.2,car.getEngineSize());
        assertEquals(Color.BLUE,car.getColor());
        assertEquals(120,car.getPrice());
    }

    @Test
    void decreasePriceTest(){
        Car car = new Car("Toyota",1.2,Color.BLUE,120);

        car.decreasePrice(10);
        assertEquals(108,car.getPrice());

    }

    @Test
    void decreasePriceWithWringPercentTest(){
        car.decreasePrice(-90);
        assertEquals(228,car.getPrice());

        car.decreasePrice(100);
        assertEquals(0,car.getPrice());
    }
}
