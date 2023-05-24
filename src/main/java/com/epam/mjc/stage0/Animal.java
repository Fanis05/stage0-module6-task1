package com.epam.mjc.stage0;

public class  Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    String description;


    public Animal (String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }



    String getDescription() {
        String pawWord;
        if (numberOfPaws == 1){
            pawWord = "paw";
        }else {
            pawWord = "paws";
        }

        if (hasFur) {
            description =  "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawWord + " and a fur.";
        } else {
            description = "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawWord + " paws and no fur.";
        }
        return description;
    }

}