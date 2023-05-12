// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название каждой планеты и количество его повторений в списке

package Seminars.Sem03HW;

import java.util.*;

public class task03 {
    public static void main(String[] args) {

        List<String> planets = new ArrayList<String>();
        planets.add("Меркурий");
        planets.add("Марс");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Сатурн");
        planets.add("Юпитер");
        planets.add("Нептун");
        planets.add("Уран");
        planets.add("Плутон");
        planets.add("Уран");
        planets.add("Земля");
        planets.add("Нептун");
        planets.add("Земля");

        Map<String, Integer> planetCounts = new HashMap<String, Integer>();

        for (String planet : planets) {
            Integer count = planetCounts.get(planet);
            if (count == null) {
                planetCounts.put(planet, 1);
            } else {
                planetCounts.put(planet, count + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : planetCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
