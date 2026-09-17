class Solution {

    public int countComponents(int n, int[][] edges) {

        // Step 1: Build adjacency matrix
        int[][] adj = new int[n][n];

        for(int[] edge : edges){
            int a = edge[0];
            int b = edge[1];
            adj[a][b] = 1;
            adj[b][a] = 1;
        }

        boolean[] visited = new boolean[n];
        int components = 0;

        // Step 2: Traverse all nodes
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                components++;            // FIXED
                dfs(i, adj, visited, n); // FIXED
            }
        }

        return components;
    }

    // DFS must be outside the other method
    private void dfs(int node, int[][] adj, boolean[] visited, int n){
        visited[node] = true;

        for(int neighbor = 0; neighbor < n; neighbor++){
            if(adj[node][neighbor] == 1 && !visited[neighbor]){ // FIXED typo
                dfs(neighbor, adj, visited, n);
            }
        }
    }
}
