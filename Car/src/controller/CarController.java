package controller;

import model.Car;
import view.CarView;

public class CarController {

    private Car model;
    private CarView view;
    public CarController(Car model, CarView view){
        this.model = model;
        this.view = view;
    }
    public void setCarName(String name){
        model.setName(name);
    }
    public String getCarName(){
        return model.getName();
    }
    public void setCarModelNo(String modelNo){
        model.setModelNo(modelNo);
    }
    public String getCarModelNo(){
        return model.getModelNo();
    }
    public void updateView(){
        view.printCarDetails(model.getName(), model.getModelNo());
    }
}
