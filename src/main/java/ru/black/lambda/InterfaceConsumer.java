package ru.black.lambda;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class InterfaceConsumer {
    public static ArrayList<Cars> createThreeCars(Supplier<Cars> carSupplier) {
        ArrayList<Cars> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrayList.add(carSupplier.get());
        }
        return arrayList;
    }

    public static void changeCar(Cars cars, Consumer<Cars> carsConsumer) {
         carsConsumer.accept(cars);
    }

    public static void main(String[] args) {
        ArrayList<Cars> ourCars = createThreeCars(() ->
                new Cars("Nissan Tiida", "Silver metallic", 1.6));
        System.out.println("Our cars: " + ourCars);

        changeCar(ourCars.get(0), cars -> {
            cars.setColor("Red");
            cars.setEngine(2.4);
            System.out.println("upgrading car: " + cars);
            System.out.println("Our cars: " + ourCars);
        });
    }
}

class Cars {
    private String model;
    private String color;
    private double engine;

    public Cars(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + '\''
                + ", color='" + color + '\''
                + ", engine=" + engine
                + '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }
}