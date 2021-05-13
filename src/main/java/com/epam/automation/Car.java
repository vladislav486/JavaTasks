package com.epam.automation;

public class Car{
    public Manufacturer manufacturer;
    public Type type;
    public String model;
    public int price, maxSpeed, year, seatsNumber, fuelConsumption;
    public boolean airConditioning;

    public Car(Manufacturer manufacturer, Type type, String model, int price, int year, int maxSpeed, int seatsNumber, int fuelConsumption,  boolean airConditioning)
    {
        this.manufacturer = manufacturer;
        this.type = type;
        this.model = model;
        this.price = price;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.seatsNumber = seatsNumber;
        this.fuelConsumption = fuelConsumption;
        this.airConditioning = airConditioning;
    }
    @Override
    public String toString(){
       String carInfo = "Manufacturer : " + manufacturer + ", Body type : " + type + ", Price : " + price + ", Car production year : " + year +
                ", Car`s Max speed : " + maxSpeed + ", Car`s fuel consumption is : " + fuelConsumption + " litres per 100 km" + ", Number of seats : " + seatsNumber;
       if (airConditioning == true){
           carInfo = carInfo + ", Has air conditioning system;";
       } else {carInfo = carInfo + ", Has no air conditioning system";}
           return carInfo;
    }
}
