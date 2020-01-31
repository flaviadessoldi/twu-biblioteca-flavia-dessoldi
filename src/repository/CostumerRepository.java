package repository;

import model.Costumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CostumerRepository {

    List<Costumer> costumerList;

    public CostumerRepository() {

        Costumer costumer1 = new Costumer("Flavia", "123-1234", "banana");
        this.costumerList = new ArrayList<>(Arrays.asList(costumer1));
    }

    public List<Costumer> getCostumerList() {
        return this.costumerList;
    }



}
