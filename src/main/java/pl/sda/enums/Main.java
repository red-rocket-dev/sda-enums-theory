package pl.sda.enums;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TODO: enum w klasie
        //TODO: livecoding - miniaplikacja do zarzadzania flota


        Planet planet1 = Planet.EARTH;
        Planet planet2 = Planet.SATURN;
        Planet planet3 = Planet.SATURN;

        //albo za pomoca ==
        if (Planet.SATURN.equals(planet2)) {
            System.out.println("rowne");
        }

        if (planet3.equals(planet2)) {
            System.out.println("rowne");
        }

        Planet[] planets = Planet.values();
        //planets[1];


        for (Planet planet : planets) {
            System.out.println("------------");
            System.out.println(planet);//tutaj jest niejawnie wywolany toString() na planet
            System.out.println(planet.name());
            System.out.println(planet.getReadableName());
            System.out.println(planet.getPolishReadableName());
        }
        Planet earth = Planet.valueOf("EARTH");

        Printable[] array = new Printable[10];
        array[0] = Planet.EARTH;

        List<Printable> list = new ArrayList<>();
        list.add(Planet.EARTH);

        // Konstruktora enum nie wywołujemy nigdzie indziej niż tylko w klasie tego enuma
        // new Planet("", "");


        int planetIndexFromFile = 1; //SATURN
        //to rozwiazanie ma wade, nie bedzie sie zgadzalo jesli cos wstawimy przed saturnem
        System.out.println("Pobieranie enuma o danym indeksie");
        System.out.println(planets[planetIndexFromFile]);


        Scanner scanner = new Scanner(System.in);


        Car car1 = new Car("126p", 24, CarType.HATCHBACK, Brand.FIAT);
        Car car2 = new Car("Bravo", 90, CarType.HATCHBACK, Brand.FIAT);
        Car car3 = new Car("911", 411, CarType.SPORT, Brand.PORSCHE);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        System.out.println("Podaj marke, ktorej chcesz zobaczyc modele:");
        String expectedBrandString = scanner.nextLine();

        Brand expectedBrand = Brand.valueOf(expectedBrandString);

        for (Car car : cars) {
            //można też tak, ale to nie jest dobra praktyka, nie róbcie tak :)
            //if(car.getBrand().name().equals(expectedBrandString))
            if (expectedBrand.equals(car.getBrand())) {
                StringBuilder stringBuilder = new StringBuilder();
                String carMessage = stringBuilder
                        .append(car.getBrand())
                        .append(" ")
                        .append(car.getModel())
                        .append(" ")
                        .append(car.getHorsePower())
                        .append(" ")
                        .append(car.getCarType())
                        .toString();
                System.out.println(carMessage);
            }
        }

        String expectedRatingString = scanner.nextLine();
        int expectedRating = Integer.parseInt(expectedRatingString);

        for (Car car : cars) {
            //można też tak, ale to nie jest dobra praktyka, nie róbcie tak :)
            //if(car.getBrand().name().equals(expectedBrandString))
            if (car.getBrand().isRatingEqual(expectedRating)) {
                StringBuilder stringBuilder = new StringBuilder();
                String carMessage = stringBuilder
                        .append(car.getBrand())
                        .append(" ")
                        .append(car.getModel())
                        .append(" ")
                        .append(car.getHorsePower())
                        .append(" ")
                        .append(car.getCarType())
                        .toString();
                System.out.println(carMessage);
            }
        }


        //Integer.valueOf("1");
        /*if(carTypeString.equals("SEDAN")) {
            carType = CarType.SEDAN;
        } else if(carTypeString.equals("SUV")) {
            carType = CarType.SUV;
        }*/
    }

    public static void writeTenOnes() {

    }
}
