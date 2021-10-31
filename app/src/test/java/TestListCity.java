import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestListCity {

    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCityTest(){
        City addACity = new City("Halifax", "NS");
        list.addCity(addACity);
        assertTrue(list.hasCity(addACity));

    }

    @Test
    public void deleteCityTest(){
        int listSize = 0;
        City cityName = new City("Halifax", "NS");
        list.addCity(cityName);
        if(list.hasCity(cityName)){
            listSize = list.getCount();
            list.deleteCity(cityName);
            assertEquals(list.getCount(), listSize-1);
            assertFalse(list.hasCity(cityName));
        }
        else {
            assertEquals(list.getCount(), listSize);
        }

    }


}
