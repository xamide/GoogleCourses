import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapSharingTest {

    @Test
    void hashMap() {
        Map<String, String> mapOne = new HashMap<>();
        mapOne.put("a", "aaa");
        mapOne.put("b", "bbb");
        mapOne.put("c", "ccc");

        Map<String, String> mapTwo = new HashMap<>();
        mapTwo.put("b", "xyz");
        mapTwo.put("c", "ccc");

        Map<String, String> mapThree = new HashMap<>();
        mapThree.put("a", "aaa");
        mapThree.put("c", "meh");
        mapThree.put("d", "hi");

        MapSharing testMap = new MapSharing();
        assertEquals("{a=aaa, b=aaa}", testMap.mapShare(mapOne).toString());
        assertEquals("{b=xyz}", testMap.mapShare(mapTwo).toString());
        assertEquals("{a=aaa, b=aaa, d=hi}", testMap.mapShare(mapThree).toString());
    }
}