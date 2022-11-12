package homeworks.hm5.three;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@ToString
public class Plain {

    private String plan;
    private String day;

    private List<Plain> plainList;

    public Plain(String plan, String day) {
        this.plan = plan;
        this.day = day;
        plainList = new ArrayList<>();
    }
}
