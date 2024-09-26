package racingcar.Service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.Model.Car;

import java.util.ArrayList;

public class CarService {
    public void getRandomValues(ArrayList<Car> cars) {
        for(int i=0;i<cars.size();i++){
            int n=generateRandomValue();
            if(n>=4) moveCar(cars.get(i));
            else stopCar(cars.get(i));
        }
    }

    private int generateRandomValue(){
        return Randoms.pickNumberInRange(0,9);
    }

    private void moveCar(Car car){
        String position=car.getPosition();
        car.setPosition(position);
    }

    private void stopCar(Car car){}
}
