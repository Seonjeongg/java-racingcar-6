package racingcar.View;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String ASK_CAR_LIST="경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String ASK_FOR_COUNT="시도할 회수는 몇회인가요?";

    public static String ask_car_list() {
        System.out.println(ASK_CAR_LIST);
        return Console.readLine();
    }
    public static String ask_for_count() {
        System.out.println(ASK_FOR_COUNT);
        return Console.readLine();
    }
}
