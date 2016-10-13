package com.example.bangash.listfragment;

import android.os.Bundle;

/**
 * Created by Bangash on 10/12/2016.
 */
public class Flower {

    //constants fields

    public static final String Flower_Name = "flowername";
    public static final String Instructions = "instructions";
    public static final String Image_Resources = "imageresources";
    public static final String Price = "price";

    //private fields

    private int imageResources;
    private String instructions;
    private double price;
    private String flowerName;

    //for creating data object

    public Flower(String flowerName, int imageResources, String instructions, double price) {
        this.flowerName = flowerName;
        this.imageResources = imageResources;
        this.instructions = instructions;
        this.price = price;
    }


    //getters and setters

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImageResources() {
        return imageResources;
    }

    public void setImageResources(int imageResources) {
        this.imageResources = imageResources;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }


    public Flower(Bundle bundle) {
        if (bundle != null) {
            this.flowerName = bundle.getString(Flower_Name);
            this.imageResources = bundle.getInt(Image_Resources);
            this.instructions = bundle.getString(Instructions);
            this.price = bundle.getDouble(Price);

        }
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(Flower_Name, this.flowerName);
        bundle.putInt(Image_Resources, this.imageResources);
        bundle.putString(Instructions, this.instructions);
        bundle.putDouble(Price, this.price);
        return bundle;
    }


}
