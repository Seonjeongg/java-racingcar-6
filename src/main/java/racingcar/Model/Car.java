package racingcar.Model;

public class Car {
    private static final String movement="-";
    private String carName;
    private String position="";

    public Car(String carName){
        this.carName=carName;
    }
    public String getCarName() {
        return carName;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position +=movement;
    }
}
