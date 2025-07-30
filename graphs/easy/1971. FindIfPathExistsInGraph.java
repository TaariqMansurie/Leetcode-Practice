package graphs.easy;

import java.util.List;
import java.util.ArrayList;


public class FindIfPathExistsInGraph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));
        
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));
    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        // Step 1: Create the adjacency list
        @SuppressWarnings("unchecked")
        List<Integer>[] graph = new ArrayList[n];
        for(int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph[u].add(v);
            graph[v].add(u); // Since it's undirected
        }

        // Step 2: DFS to check for path
        boolean[] visited = new boolean[n];
        return dfs(graph, source, destination, visited);
    }

    private static boolean dfs(List<Integer>[] graph, int current, int destination, boolean[] visited) {
        if(current == destination) return true;

        visited[current] = true;
        for(int neighbor : graph[current]) {
            if(!visited[neighbor]) {
                if(dfs(graph, neighbor, destination, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        // FindIfPathExistsInGraph graph = new FindIfPathExistsInGraph();
        int n = 6;
        int[][] edges = {
            {0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}
        };
        int source = 0;
        int destination = 5;

        boolean result = validPath(n, edges, source, destination);
        System.out.println("Path exists: " + result); // Output: false
    }
}
