package service;


import model.Toy;

public class DataServiceImpl implements Service {

    @Override
    public Toy createToy(Integer toyId, String toyName, Integer toyPeriodicity) {
        Toy toy = new Toy();
        toy.toyId = toyId;
        toy.toyName = toyName;
        toy.toyPeriodicity = toyPeriodicity;
        return toy;
    }

    @Override
    public void readToy(Toy toy) {
        System.out.println(toy.toyId + " " +  toy.toyName + " " + toy.toyPeriodicity);
    }
}