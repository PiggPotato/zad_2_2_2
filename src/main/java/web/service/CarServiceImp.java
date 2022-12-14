package web.service;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class CarServiceImp implements CarService{

    private List<Car> cars;


    public CarServiceImp() {
        cars = new ArrayList<>();
        cars.add(new Car(1, "car1", 40));
        cars.add(new Car(2, "car2", 50));
        cars.add(new Car(3, "car3", 60));
        cars.add(new Car(4, "car4", 70));
        cars.add(new Car(5, "car5", 80));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getLimitCars(int limit) {
        return cars.stream().limit(limit).collect(Collectors.toList());
    }
}
