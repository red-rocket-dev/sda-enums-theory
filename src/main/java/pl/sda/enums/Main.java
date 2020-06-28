package pl.sda.enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TODO: pola w enumach + konstruktor
        //TODO: jak z toString()?
        //TODO: wszystkie metody enumow
        //TODO: enum w klasie
        //TODO: jak to wyglada w pamieci (podejrzec w debuggerze)
        //TODO: livecoding - miniaplikacja do zarzadzania flota


        Planet planet1 = Planet.EARTH;
        Planet planet2 = Planet.SATURN;
        Planet planet3 = Planet.SATURN;

        if(Planet.SATURN.equals(planet2)) {
            System.out.println("ok");
        }

        Scanner scanner = new Scanner(System.in);

        String carTypeString = scanner.nextLine();



        //Integer.valueOf("1");
        /*if(carTypeString.equals("SEDAN")) {
            carType = CarType.SEDAN;
        } else if(carTypeString.equals("SUV")) {
            carType = CarType.SUV;
        }*/
    }
}
