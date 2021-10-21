package com.wizard;

public class HeadPhones {
    private String brand;

    public HeadPhones(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "HeadPhones{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
