import static org.junit.Assert.assertEquals;

import android.util.Log;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    static CustomList list;
    City c;

    @Before
    public void setup(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        c = new City("Edmonton", "AB");
        int size = list.getCount();
        list.addCity(c);
        assertEquals(size+1, list.getCount());
    }

    @Test
    public void deleteCityTest(){
        list.deleteCity(c);
        int size = list.getCount();
        assertEquals(size, list.getCount());


    }


    @Test
    public void hasCityTest(){
        list.addCity(c);
        assertEquals(true, list.hasCity(c));

    }
}

