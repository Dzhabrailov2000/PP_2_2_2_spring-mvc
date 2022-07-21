package web.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Model1", 1, 1));
        carList.add(new Car("Model2", 2, 2));
        carList.add(new Car("Model3", 3, 3));
        carList.add(new Car("Model4", 4, 4));
        carList.add(new Car("Model5", 5, 5));
    }

    @Override
    public List<Car> getCars(int count) {
        return carList.stream()
                .limit(count)
                .toList();
    }
}
