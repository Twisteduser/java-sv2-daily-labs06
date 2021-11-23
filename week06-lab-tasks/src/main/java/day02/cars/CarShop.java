package day02.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String dealership;
    private int maxPrice;
    private List<Car> carsForSell = new ArrayList<>();

    public CarShop(String dealership, int maxPrice) {
        this.dealership = dealership;
        this.maxPrice = maxPrice;
    }

    public String getDealership() {
        return dealership;
    }

    public int getMaxPrice() {
        return maxPrice;
    }


    public List<Car> getCarsForSell() {
        return carsForSell;
    }

    public boolean addCar(Car car){
        if (car.getPrice()< maxPrice){
            carsForSell.add(car);
            return true;
        }else{
            return false;
        }
    }
    public int sumCarPrice(){
        int sum = 0;
        for (Car car: carsForSell){
            sum = sum + car.getPrice();
        }
        return sum;
    }

    public int numberOfCarsCheaperThan(int price){
        int sum = 0;
        for (Car car: carsForSell){
            if (car.getPrice()<=price){
                sum += 1;
            }
        }
        return sum;
    }

    public List<Car> carsWithBrand(String brand){
        List<Car> allCars = new ArrayList<>();
        for (Car car: carsForSell){
            if (car.getBrand().equals(brand)){
                allCars.add(car);
            }
        }
        return allCars;

    }
}
