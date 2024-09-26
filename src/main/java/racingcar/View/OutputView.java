package racingcar.View;

import racingcar.Model.Car;

import java.util.ArrayList;

public class OutputView {
    public static final String execution_result="실행 결과";
    public static final String final_winner="최종 우승자";
    public static final String OUTPUT_Signal=":";

    public static void execution_result_message(){
        System.out.println(execution_result);
    }
    public static void final_winner_message(){
        System.out.println(final_winner);
    }
    public static void Car_racing_situation(ArrayList<Car> cars){
        for(Car car : cars){
            System.out.print(car.getCarName());
            System.out.print(OUTPUT_Signal);
            System.out.println(car.getPosition());
        }
        System.out.println();
    }
}
