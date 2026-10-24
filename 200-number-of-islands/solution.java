// 8 ms | 50.9 MB
class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        int[][] directions = {
            {-1, 0},
            {1, 0},  
            {0, -1}, 
            {0, 1}   
        };

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == '1') {
                    count++;
                    Queue<int[]> queue = new LinkedList<>();
                    queue.offer(new int[]{i, j});
                    grid[i][j] = '0';

                    while (!queue.isEmpty()) {
                        int[] cell = queue.poll();
                        int r = cell[0];
                        int c = cell[1];

                        for (int[] dir : directions) {
                            int nr = r + dir[0];
                            int nc = c + dir[1];

                            if (nr >= 0 && nr < rows &&
                                nc >= 0 && nc < cols &&
                                grid[nr][nc] == '1') {

                                queue.offer(new int[]{nr, nc});
                                grid[nr][nc] = '0';
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
}