package racingcar.Model;

import java.util.ArrayList;

public class Game {
    private int count;
    private ArrayList<Car> cars;

    public Game(ArrayList<Car> cars, int count) {
        this.cars = cars;
        this.count = count;
    }

    public int getCount() {
        return count;
    }
    public ArrayList<Car> getCars() {
        return cars;
    }
}
