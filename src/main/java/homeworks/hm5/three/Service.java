package homeworks.hm5.three;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class Service {

    Server server = new Server();
    @SneakyThrows
    public void addPlain(String day, String plan) {


            server.put(day, new Plain(plan, day));
        }

        public void getAllPlan() {
            List<String> collect = server.getMapPlain().entrySet()
                    .stream()
                    .flatMap(k -> k.getValue()
                            .stream().map(v -> v.getPlan()))
                    .collect(Collectors.toList());

            collect.forEach(System.out::println);
        }

    public void getPlanDay(String day) {
        List<String> collect = server.getMapPlain().entrySet()
                .stream()
                .flatMap(k -> k.getValue()
                        .stream()
                        .filter(p -> p.getDay().equals(day))
                        .map(v -> v.getPlan()))
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}