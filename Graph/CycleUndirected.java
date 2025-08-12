import java.util.*;

public class CycleUndirected {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Undirected edges (add both ways)
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));

        graph[0].add(new Edge(0, 2));
        graph[2].add(new Edge(2, 0));

        graph[1].add(new Edge(1, 3));
        graph[3].add(new Edge(3, 1));

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 2));
    }

    public static boolean isCycleUndirected(ArrayList<Edge> graph[], boolean vis[], int curr, int parent) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                if (isCycleUndirected(graph, vis, e.dest, curr)) {
                    return true;
                }
            } else if (e.dest != parent) {
                // visited and not parent => cycle
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        boolean vis[] = new boolean[v];
        boolean cycleFound = false;

        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                if (isCycleUndirected(graph, vis, i, -1)) {
                    cycleFound = true;
                    break;
                }
            }
        }

        System.out.println(cycleFound ? "Cycle Found" : "No Cycle");
    }
}