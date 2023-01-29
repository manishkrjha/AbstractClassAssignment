package exceptionHandlingAssignment;

public class Tester {
    public static void main(String[] args) throws CityNotFoundException {
        City c = new City();

        c.addCity(700, "Kolkata");
        c.addCity(456, "Indore");

//        c.findCityByZipCode(456);
        String res = c.findCityByZipCode(456);
        System.out.println(res);
    }
}
