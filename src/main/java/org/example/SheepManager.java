package org.example;

import java.util.ArrayList;


public class SheepManager {

    public static ArrayList<Sheep> arrayList = new ArrayList<>();

    public int AddSheep(Sheep sheepToAdd) {
        // return number of sheep in the Database
        int numberOfSheep = 0;
        arrayList.add(sheepToAdd);
        System.out.println("Added a sheep " + sheepToAdd.SheepName);
        return numberOfSheep;
    }

    public static void main(String[] args) {
        SheepManager sheepManager = new SheepManager();
        sheepManager.AddSheep(new Sheep("Prashant","Red",172,75));
    }


}
