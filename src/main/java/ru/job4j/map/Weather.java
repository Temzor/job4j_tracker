package ru.job4j.map;

import java.util.*;

public class Weather {
    public static List<Info> editData(List<Info> list) {
        Map<String, List<Integer>> map = new HashMap<>();
        for (Info info : list) {
            map.putIfAbsent(info.getCity(), new ArrayList<>());
            map.get(info.getCity()).add(info.getRainfall());
        }
        List<Info> infoList = new ArrayList<>();
        for (String city : map.keySet()) {
            int sum = 0;
            for (Integer i : map.get(city)) {
                sum += i;
            }
            infoList.add(new Info(city, sum));
        }
        return infoList;

    }

    public static class Info {
        private String city;

        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall
                    && Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}