package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
@Transactional
public class CarDaoImp implements CarDao {
    private List<Car> carList;
    public List<Car> getListCar(Integer count) {
        if (count > 5)  count = 5;
        if (carList == null) setCarList();
        return carList.stream().limit(count).toList();
    }

    public void setCarList() {
        carList = new ArrayList<>();
        Collections.addAll(carList, new Car("BMW", 134, "E60"),
                new Car("Chevrolet", 411, "Impala"),
                new Car("YAZ", 777, "Patriot"),
                new Car("Renault", 131, "Logan"),
                new Car("Mitsubishi ", 141, "Lancer"));
    }
}
