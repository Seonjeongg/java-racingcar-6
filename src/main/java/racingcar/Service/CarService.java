package racingcar.Service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.Model.Car;
import racingcar.Model.Game;
import racingcar.View.OutputView;

import java.util.ArrayList;

public class CarService {
    GameService gameService = new GameService();
    public void perform_racing(Game game){
        int count=game.getCount();
        for(int i=0;i<count;i++){
            getRandomValues(game.getCars());
        }
        gameService.print_winner(game);
    }
    public void getRandomValues(ArrayList<Car> cars) {
        for(int i=0;i<cars.size();i++){
            int n=generateRandomValue();
            if(n>=4) moveCar(cars.get(i));
            else stopCar(cars.get(i));
        }
        print_car_position_situation(cars);
    }

    private int generateRandomValue(){
        return Randoms.pickNumberInRange(0,9);
    }

    private void print_car_position_situation(ArrayList<Car> cars) {
        OutputView.Car_racing_situation(cars);
    }

    private void moveCar(Car car){
        String position=car.getPosition();
        car.setPosition(position);
    }

    private void stopCar(Car car){}


}
