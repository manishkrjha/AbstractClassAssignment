package exceptionHandlingAssignment;

import java.util.HashMap;

public class City {
    HashMap<Integer, String> li = new HashMap<>();

    public void addCity(int zipCode, String cityName){
        li.put(zipCode, cityName);
    }


    public String findCityByZipCode(int zipCode) throws CityNotFoundException {

        try{
            if (li.containsKey(zipCode)) {

                String cityName = li.get(zipCode);

                return cityName;
            } else {
                throw new CityNotFoundException("City not found");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return "";
    }
}
