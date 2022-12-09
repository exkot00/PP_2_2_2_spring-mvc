package web.Service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarService {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Kia","White", 688));
        cars.add(new Car("Reno","Black", 456));
        cars.add(new Car("BMW","Blue", 333));
        cars.add(new Car("LADA","Green", 123));
        cars.add(new Car("Mitsubishi","Red", 987));
    }
    public List<Car> getCars(int count) {
        if (count == 0 || count >= 5) { return cars; }
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
