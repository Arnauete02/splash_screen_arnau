package com.example.splash_screen_arnau;

public class BikeSpinner {
    private String bikeName;
    private int bikeImg;
    public BikeSpinner(String bikeName, int bikeImg){
        this.bikeName = bikeName;
        this.bikeImg = bikeImg;
    }
    public String getBikeName() {
        return bikeName;
    }
    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }
    public int getBikeImg() {
        return bikeImg;
    }
    public void setBikeImg(int bikeImg) {
        this.bikeImg = bikeImg;
    }
}
