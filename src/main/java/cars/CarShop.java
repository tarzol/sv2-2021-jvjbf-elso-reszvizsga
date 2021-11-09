package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String carShopName;
    private int maxPrice;
    List<Car> cars = new ArrayList<>();

    public CarShop(String carShopName, int maxPrice) {
        this.carShopName = carShopName;
        this.maxPrice = maxPrice;
    }

    public String getCarShopName() {
        return carShopName;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCars() {
        return cars;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() <= maxPrice) {
            cars.add(car);
            return true;
        }
        return false;
    }

    public int sumCarPrice() {
        int totalValueOfCars = 0;
        for (Car car : cars) {
            totalValueOfCars += car.getPrice();
        }
        return totalValueOfCars;
    }

    public int numberOfCarsCheaperThan(int price) {
        int noOfCars = 0;
        for (Car car : cars) {
            if (car.getPrice() <= price) {
                noOfCars++;
            }
        }
        return noOfCars;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> sameBrand = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                sameBrand.add(car);
            }
        }
        return sameBrand;
    }
}
