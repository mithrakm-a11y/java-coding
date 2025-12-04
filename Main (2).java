import java.util.*;
public class Main {
    public static void DFSTraversal(List<List<Integer>> graph, boolean[] visited, int startVertex) {
        visited[startVertex] = true;
        System.out.print(startVertex + " ");
        for (int neighbor : graph.get(startVertex)) {
            if (!visited[neighbor]) {
                DFSTraversal(graph, visited, neighbor);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertices = sc.nextInt();
        int edges = sc.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int startVertex = sc.nextInt();

        boolean[] visited = new boolean[vertices];


        System.out.println("DFS Traversal:");
        DFSTraversal(graph, visited, startVertex);
    }
}
