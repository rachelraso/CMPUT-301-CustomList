import static org.junit.Assert.assertEquals;
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
    public void hasCity(){
        City addACity = new City("Halifax", "NS");
        list.addCity(addACity);
        assertTrue(list.hasCity(addACity));
    }

    @Test
    public void deleteCity(){
        City addACity = new City("Halifax", "NS");
        list.hasCity(addACity);
        int listSize = list.getCount();
//        list.deleteCity("Halifax", "NS");
        assertEquals(list.getCount(), listSize-1);
    }
}
