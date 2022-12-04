package homeworks.homeworkenum.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainRunner {

    List<Planet> planets = new ArrayList<>();
    List<Parcel> parcels = new ArrayList<>();
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        MainRunner mn = new MainRunner();
        mn.parcels.add(new Parcel("посылка один"));
        mn.parcels.add(new Parcel("посылка два"));
        mn.parcels.add(new Parcel("посылка три"));
        mn.parcels.add(new Parcel("посылка четыре"));
        mn.parcels.add(new Parcel("посылка пять"));

        mn.addAllParcel(mn.parcels, mn.bf);
    }

    public void addParcelPlanet(Parcel parcel, PlanetName planetName) {
        planets.forEach(v -> {
            if (v.getPlanetName().equals(planetName)) {
                v.setParcels(parcel);
                parcels.remove(parcel);
                System.out.println(String.format("Посылка %s отправлена на планету %s!", parcel.getTypeParcel(), planetName.getName()));
            }

        }
        );
    }

    public void addAllParcel(List<Parcel> parcels, BufferedReader bf) throws IOException {
        if (!parcels.isEmpty()) {
            System.out.println(String.format("Капитан! У нас есть еще недоставленная посылка: %s. На какую планету ее доставить?", parcels.get(0)));
            String planet = bf.readLine();

            PlanetName planetName = PlanetName.valueOf(planet);
            addParcelPlanet(parcels.get(0), planetName);

        }

        System.out.println("Все посылки доставлены");
        parcels.toString();
        System.out.println();
        planets.toString();
        return;
    }
}
