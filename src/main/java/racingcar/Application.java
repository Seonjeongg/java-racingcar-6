package racingcar;

import racingcar.Controller.GameController;
import racingcar.View.InputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        GameController gameController = new GameController();
        gameController.run();
    }
}
