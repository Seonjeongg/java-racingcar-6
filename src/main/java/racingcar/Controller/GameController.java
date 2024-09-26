package racingcar.Controller;

import racingcar.Model.Car;
import racingcar.Model.Game;
import racingcar.Service.CarService;
import racingcar.Service.Convertor;
import racingcar.Service.GameService;
import racingcar.View.InputView;

import java.util.ArrayList;

public class GameController {
    GameService gameService=new GameService();
    CarService carService=new CarService();
    public void run(){
        Game game=gameService.gamestart(inputStringCars(),inputStringcount());
        carService.perform_racing(game);
    }

    public ArrayList<Car> inputStringCars(){
        return gameService.splitCarName(InputView.ask_car_list());
    }

    public int inputStringcount(){
        return Convertor.string_to_int_COUNT(InputView.ask_for_count());
    }
}
