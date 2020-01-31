package repository;

import model.Costumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CostumerRepository {


    List<Costumer> costumerList;

    public CostumerRepository() {

        Costumer costumer1 = new Costumer("Flavia", "123-1234", "banana", "flavia@email.com", "555-1234");

        this.costumerList = new ArrayList<>(Arrays.asList(costumer1));
    }

    public List<Costumer> getCostumerList() {
        return this.costumerList;
    }

    public void printCostumer() {
        System.out.println("===================================================");
        System.out.println("                 COSTUMER INFORMATION");
        System.out.println("===================================================\n");

        System.out.printf("%-20s %-20s %-20s\n", "NAME", "EMAIL", "PHONE NUMBER");

        for (int index = 0; index < costumerList.size(); index++) {

            if (costumerList.get(index).getLogged() == true) {
                System.out.printf("%-20s %-20s %-20s\n", costumerList.get(index).getName(), costumerList.get(index).getEmail(),
                        costumerList.get(index).getPhoneNumber());

            }
        }
    }



}
