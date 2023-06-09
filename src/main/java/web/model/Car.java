package web.model;

public class Car {
    private String model;
    private int number;
    private String carBrand;

    public Car(String model, int number, String carBrand) {
        this.model = model;
        this.number = number;
        this.carBrand = carBrand;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "   Model = " + model +
                "  Number = " + number +
                "  Car Brand = " + carBrand + "   ";
    }
}
