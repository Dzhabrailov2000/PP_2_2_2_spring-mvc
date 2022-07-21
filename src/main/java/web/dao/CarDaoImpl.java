package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getCars() {
        List<Car> carList;
        {
            carList = new ArrayList<>();
            carList.add(new Car("Model1", 1, 1));
            carList.add(new Car("Model2", 2, 2));
            carList.add(new Car("Model3", 3, 3));
            carList.add(new Car("Model4", 4, 4));
            carList.add(new Car("Model5", 5, 5));
        }
        return carList;
    }
}
