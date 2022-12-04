package homeworks.homeworkenum.task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Planet {

   private PlanetName planetName;
   private List<Parcel> parcels;

   public void setParcels(Parcel parcel) {
      parcels.add(parcel);
   }

   @Override
   public String toString() {
      return "planetName=" + planetName +
              ", parcels=" + parcels;
   }
}
