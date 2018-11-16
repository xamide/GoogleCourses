import java.util.HashMap;
import java.util.Map;

public class MapSharing {
    public Map mapShare (Map map) {

        if (map.get("a") != null) {
            map.put("b", map.get("a"));
        }
        map.remove("c");

        return map;
    }

    /*
    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
    In all cases remove the key "c", leaving the rest of the map unchanged.

    mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
    mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
    mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
     */
}
