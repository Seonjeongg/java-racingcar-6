package racingcar.Service;

import racingcar.Model.Car;
import racingcar.Model.Game;

import java.util.ArrayList;

public class GameService {
    public Game gamestart(ArrayList<Car> cars,int count) {
        Game game = new Game(cars,count);
        return game;
    }

    public ArrayList<Car> splitCarName(String cars) {
        String[] car=cars.split(",");
        checkexception(car);
        ArrayList<Car> carList = new ArrayList<>();
        for (int i = 0; i < car.length; i++) {
            if(!carList.contains(car[i])){
                carList.add(new Car(car[i]));
            }
        }
        return carList;
    }

    private boolean checkexception(String[] car){
        for(int i=0;i<car.length;i++){
            if(check_carname_length(car[i])) throw new IllegalArgumentException();
        }
        return true;
    }

    public boolean check_carname_length(String carname){
        if(carname.length()>5) return true;
        return false;
    }

}
