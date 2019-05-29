package car;

import controller.CarController;
import model.Car;
import view.CarView;

public class Main {

    public static void main(String[] args) {
        Car model  = retriveCarFromDatabase();
        CarView view = new CarView();
        CarController controller = new CarController(model, view);
        controller.updateView();
        controller.setCarName("Toyota");
        controller.updateView();
    }
    private static Car retriveCarFromDatabase(){
        Car Car = new Car();
        Car.setName("Ford");
        Car.setModelNo("2010");
        return Car;
    }
}
