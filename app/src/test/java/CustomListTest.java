import static org.junit.Assert.assertEquals;

import android.util.Log;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    static CustomList list;

    @Before
    public void setup(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        City c = new City("Edmonton", "AB");
        int size = list.getCount();
        list.addCity(c);
        assertEquals(size+1, list.getCount());
    }

    @Test
    public void deleteCityTest(){

        int size = list.getCount();
        for (City city: list.returnArrayList()){
            if(city.getCityName().equals("Edmonton")){
                list.deleteCity(city);
                break;
            }
        }
        assertEquals(size-1, list.getCount());


    }
}

