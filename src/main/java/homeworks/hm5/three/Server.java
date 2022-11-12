package homeworks.hm5.three;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Server {

    private List<Plain> plainList;
    private Map<String, List<Plain>> mapPlain;

    public Server() {
        this.plainList = new ArrayList<>();
        this.mapPlain = new HashMap<>();
    }

    public List<Plain> addList(Plain plain) {
        if (plain.getPlan() != null) {
            plainList.add(plain);
        }
        return plainList;
    }

    public void put(String day, Plain plain) {

        if (mapPlain.containsKey(day)) {
            mapPlain.get(day).add(plain);
        } else {
            mapPlain.put(day, addList(plain));
        }

    }
}
