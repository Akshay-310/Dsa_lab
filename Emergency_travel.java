package myhelloworld;

import java.util.*;

public class Emergency_travel {
    static class Graph {
        private final Map<Integer, List<Integer>> roadMap;
        private final Map<Integer, Integer> aerialMap;

        public Graph(int cities) {
            roadMap = new HashMap<>();
            aerialMap = new HashMap<>();
            for (int i = 0; i < cities; i++) {
                roadMap.put(i, new ArrayList<>());
            }
        }

        public void addRoad(int source, int destination) {
            roadMap.get(source).add(destination);
            roadMap.get(destination).add(source);
        }

        public void addAerialRoute(int source, int destination) {
            aerialMap.put(source, destination);
        }

        public List<Integer> getNeighbors(int city) {
            return roadMap.get(city);
        }

        public Integer getAerialDestination(int city) {
            return aerialMap.get(city);
        }
    }

    static int findMinimumDays(Graph graph, int start, int end, int maxRoadsPerDay) {
        Queue<int[]> queue = new LinkedList<>(); // [currentCity, daysPassed]
        Set<Integer> visited = new HashSet<>();

        queue.offer(new int[]{start, 0});
        visited.add(start);

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentCity = current[0];
            int daysPassed = current[1];

            if (currentCity == end) {
                return daysPassed;
            }

            // Check for aerial route
            if (graph.getAerialDestination(currentCity) != null) {
                int aerialDestination = graph.getAerialDestination(currentCity);
                if (!visited.contains(aerialDestination)) {
                    queue.offer(new int[]{aerialDestination, daysPassed + 1});
                    visited.add(aerialDestination);
                }
            }

            // Traverse roads
            List<Integer> neighbors = graph.getNeighbors(currentCity);
            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    int citiesTraveled = 1;
                    while (citiesTraveled < maxRoadsPerDay && !visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.offer(new int[]{neighbor, daysPassed + 1});
                        citiesTraveled++;
                    }
                }
            }
        }
        return -1; // If the destination is unreachable
    }

    public static void main(String[] args) {
        // Hardcoded input
        int cities = 30;
        int[][] roadConnections = {
                {1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6},
                {6, 7}, {7, 8}, {8, 9}, {9, 10}, {10, 11},
                {11, 12}, {12, 13}, {13, 14}, {14, 15}, {15, 16},
                {16, 17}, {17, 18}, {18, 19}, {19, 20}, {20, 21},
                {21, 22}, {22, 23}, {23, 24}, {24, 25}, {25, 26},
                {26, 27}, {27, 28}, {28, 29}, {29, 30}
        };
        int[][] aerialConnections = {
                {2, 21}, {4, 7}, {10, 25}, {19, 28}, {26, 0}
        };

        Graph graph = new Graph(cities);

        // Add road connections
        for (int[] road : roadConnections) {
            graph.addRoad(road[0] - 1, road[1] - 1); // Convert to 0-based indexing
        }

        // Add aerial connections
        for (int[] aerial : aerialConnections) {
            graph.addAerialRoute(aerial[0] - 1, aerial[1] - 1); // Convert to 0-based indexing
        }

        // Find minimum days
        int startCity = 0; // City 1 in 0-based indexing
        int endCity = 29; // City 30 in 0-based indexing
        int maxRoadsPerDay = 6;

        int result = findMinimumDays(graph, startCity, endCity, maxRoadsPerDay);

        if (result != -1) {
            System.out.println("Minimum days required: " + result);
        } else {
            System.out.println("Destination unreachable.");
        }
    }
}

