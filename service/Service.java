package service;

import model.Toy;

public interface Service {
    public Toy createToy(Integer toyId, String toyName, Integer toyPeriodicity);

    public void readToy(Toy toy);

}
