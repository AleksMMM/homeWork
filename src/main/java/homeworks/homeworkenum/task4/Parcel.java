package homeworks.homeworkenum.task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Parcel {

    private String typeParcel;

    @Override
    public String toString() {
        return typeParcel;
    }
}
