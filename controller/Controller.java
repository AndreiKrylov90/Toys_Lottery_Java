package controller;

import model.Toy;
import service.DataServiceImpl;

public class Controller {
    DataServiceImpl dataService;

    public Controller() {
        this.dataService = new DataServiceImpl();
    }

    public Toy createToy(Integer toyId, String toyName, Integer toyPeriodicity) {
        return dataService.createToy(toyId, toyName, toyPeriodicity);
    }

    public void readToy(Toy toy) {
        dataService.readToy(toy);
    }
}
