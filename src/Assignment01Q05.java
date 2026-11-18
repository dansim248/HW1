public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int n = m.length;
        boolean[] visited = new boolean[n];
        int[] dist = new int[n];
        int[] queue = new int[n];

        int head = 0;
        int tail = 0;

        // starting with vertex 0 push it into the queue, assign its visited value to true and initial distance is 0 
        queue[tail] = i;
        tail++; 
        visited[i] = true;
        dist[i] = 0;

        // while there are still vertices in the queue 
        while (head < tail) {
            int curr = queue[head]; // dequeue the next vertex 
            head++;

            // the first time j is reached is the shortest path
            if (curr == j) {
                return dist[curr];
            }

            for (int next = 0; next <= n - 1; next++) {
                // if there is a directed edge curr -> next and next hasn't been visited yet
                if (m[curr][next] == 1 && !visited[next]) {
                    visited[next] = true; // mark as visited so it won't be revisited  
                    dist[next] = dist[curr] + 1; // path's length is longer by 1 edge than curr's distance    
                    queue[tail] = next; // enqueue neighboor 
                    tail++;
                }
            }
        }

        // j is unreachable from i, return -1
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println( 
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}