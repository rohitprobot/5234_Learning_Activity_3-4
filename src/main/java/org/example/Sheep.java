package org.example;
public class Sheep {
    public String SheepName;
    public String SheepFavColor;
    public double height;
    public double weight;
    public static int numberOfSheep = 0;

    public Sheep(String sName, String sFavColor, int sheight, int sweight) {
        this.SheepName = sName;
        this.SheepFavColor = sFavColor;
        this.height = sheight;
        this.weight = sweight;
        Sheep.numberOfSheep++;
    }

    public String getSheepName() {
        return SheepName;
    }

    public void setSheepName(String sheepName) {
        SheepName = sheepName;
    }

    public String getSheepFavColor() {
        return SheepFavColor;
    }

    public void setSheepFavColor(String sheepFavColor) {
        SheepFavColor = sheepFavColor;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static int getNumberOfSheep() {
        return numberOfSheep;
    }

    public static void setNumberOfSheep(int numberOfSheep) {
        Sheep.numberOfSheep = numberOfSheep;
    }





}
