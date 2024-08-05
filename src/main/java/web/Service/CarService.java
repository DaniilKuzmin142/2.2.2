package web.Service;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Haima", "M3"));
        cars.add(new Car(2, "Car2", "Car2"));
        cars.add(new Car(3, "Car3", "Car3"));
        cars.add(new Car(4, "Car4", "Car4"));
        cars.add(new Car(5, "Car5", "Car5"));
    }

    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}