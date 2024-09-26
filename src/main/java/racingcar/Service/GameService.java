package racingcar.Service;

import racingcar.Model.Car;
import racingcar.Model.Game;
import racingcar.View.OutputView;

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

    public void print_winner(Game game){
        OutputView.final_winner_message();
        OutputView.print_winner(calculate_winner(game));
    }

    private ArrayList<String> calculate_winner(Game game) {
        ArrayList<String> winners = new ArrayList<>();
        ArrayList<Car> carList = game.getCars();
        int MAXlength=0;
        for(Car car:carList){
            int carlength=car.getPosition().length();
            if(carlength>MAXlength){
                MAXlength=carlength;
                winners.clear();
            }
            if(carlength>=MAXlength) {
                winners.add(car.getCarName());
            }
        }
        return winners;
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
