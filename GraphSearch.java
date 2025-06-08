// Program Java untuk pencarian DFS dan BFS pada graf dengan 7 node(a1, a2, a3, a4, a5, a6, a7)

import java.util.*;

public class GraphSearch {
    static class Graph {
        private Map<String, List<String>> adjList = new HashMap<>();

        public void addEdge(String u, String v) {
            adjList.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adjList.computeIfAbsent(v, k -> new ArrayList<>()).add(u); // Jika graf tidak berarah
        }

        // DFS menggunakan  nilai node
        public boolean dfsValue(String current, int targetValue, Set<String> visited, Map<String, Integer> nodeValue) {
            if (visited.contains(current)) return false;
            visited.add(current);

            int currentValue = nodeValue.getOrDefault(current, -1);
            System.out.println("Visiting node " + current + " with value " + currentValue);
            if (currentValue == targetValue) return true;

            for (String neighbor : adjList.getOrDefault(current, new ArrayList<>())) {
                if (dfsValue(neighbor, targetValue, visited, nodeValue)) return true;
            }
            return false;
        }

        // BFS berdasarkan nilai node
        public boolean bfsValue(String start, int targetValue, Map<String, Integer> nodeValue) {
            Queue<String> queue = new LinkedList<>();
            Set<String> visited = new HashSet<>();
            queue.add(start);
            visited.add(start);

            while (!queue.isEmpty()) {
                String current = queue.poll();
                int currentValue = nodeValue.getOrDefault(current, -1);
                System.out.println("Visiting node " + current + " with value " + currentValue);
                if (currentValue == targetValue) return true;

                for (String neighbor : adjList.getOrDefault(current, new ArrayList<>())) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Graph graph = new Graph();

        // Membangun graf dengan 7 node: a1 - a7
        graph.addEdge("a1", "a2");
        graph.addEdge("a1", "a3");
        graph.addEdge("a2", "a4");
        graph.addEdge("a2", "a5");
        graph.addEdge("a3", "a6");
        graph.addEdge("a3", "a7");

        // Nilai pada tiap node
        Map<String, Integer> nodeValue = new HashMap<>();
        nodeValue.put("a1", 14);
        nodeValue.put("a2", 8);
        nodeValue.put("a3", 10);
        nodeValue.put("a4", 2);
        nodeValue.put("a5", 12);
        nodeValue.put("a6", 4);
        nodeValue.put("a7", 6);

        // Tampilkan isi node dan nilainya
        System.out.println("Node dan nilainya:");
        for (Map.Entry<String, Integer> entry : nodeValue.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Input nilai target untuk pencarian
        System.out.print("\nMasukkan nilai target untuk pencarian: ");
        int targetNumber = scanner.nextInt();

        System.out.println("\nPencarian DFS by value:");
        boolean foundDFS = graph.dfsValue("a1", targetNumber, new HashSet<>(), nodeValue);
        System.out.println("Nilai: " + (foundDFS ? "Ditemukan" : "Tidak ditemukan"));

        System.out.println("\nPencarian BFS by value:");
        boolean foundBFS = graph.bfsValue("a1", targetNumber, nodeValue);
        System.out.println("Nilai: " + (foundBFS ? "Ditemukan" : "Tidak ditemukan"));
        scanner.close();
    }
}
