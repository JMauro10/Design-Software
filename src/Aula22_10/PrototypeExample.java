package Aula22_10;


interface Prototype extends Cloneable {
    Prototype clone();
}


class Car implements Prototype {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public Prototype clone() {
        return new Car(model, color);
    }

    public String getInfo() {
        return "Carro: " + this.model + ", Cor: " + this.color;
    }
}


public class PrototypeExample {
    public static void main(String[] args) {
        
        Car originalCar = new Car("Sedan", "Preto");

        
        Car clonedCar = (Car) originalCar.clone();

        
        System.out.println(originalCar.getInfo());
        System.out.println(clonedCar.getInfo());
    }
}

