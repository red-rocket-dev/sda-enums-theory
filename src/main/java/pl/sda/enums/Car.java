package pl.sda.enums;

public class Car {
    private String model;
    private long horsePower;
    private CarType carType;
    private Brand brand;

    public Car(String model, long horsePower, CarType carType, Brand brand) {
        this.model = model;
        this.horsePower = horsePower;
        this.carType = carType;
        this.brand = brand;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public long getHorsePower() {
        return horsePower;
    }

    public CarType getCarType() {
        return carType;
    }
}
