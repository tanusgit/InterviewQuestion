package Practice;

import java.util.*;

public class ShortestPathMatrix {
    //we need a directions array for accessing the adjacent nodes in 8 directions
    private static final int[][] directions =
            new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    public int shortestPathMatrix(int[][] grid) {
        // Firstly, we will check if we can start our journey through
        // the grid by checking if the first cell has 0 or not
        // we also need to see if the target if is reacheble or not by checking if the target
        // cell has a 0 value or not.
        if (grid[0][0] != 0 || grid[grid.length - 1][grid[0].length - 1] != 0) {
            return -1;
        }
       //we will use BFS to find the shortest path. We update the cell of the matrix
        //by putting a distance value in each valid cell of the matrix
        //valid cell = cell which has a 0 initially
        //we need a queue and we only add a node to the q if it has a distance value 0
        //initially all the cells which has open path in the grid has a 0 value in it
        //we are updating the value of the cells by updating the distance and assigning
        //the distance for each cell
        Queue<int[]> queue = new LinkedList<>();
        grid[0][0] = 1;
        //we start with the first cell of the grid which is the start of our journey
        //and it has a coordinate of (0,0). So, we add (0,0) to the queue
        queue.add(new int[]{0, 0});

        // Our BFS algorithm starts here
        while (!queue.isEmpty()) {
            int[] cell = queue.remove();
            int row = cell[0];
            int col = cell[1];
            int distance = grid[row][col];
            //if we have reached the target cell we just return the distance
            if (row == grid.length - 1 && col == grid[0].length - 1) {
                return distance;
            }

            for (int i = 0; i < directions.length; i++) {
                int newRow = row + directions[i][0];
                int newCol = col + directions[i][1];
                //if we cross the boundary of the grid or the grid does not contain a 0
                //value then we move on and continue searching for other adjacent nodes
                if (newRow < 0 || newCol < 0 || newRow >= grid.length
                        || newCol >= grid[0].length
                        || grid[newRow][newCol] != 0) {
                    continue;
                }
                //if we get an adjacent node with a 0 value we add it to the queue and
                //update the distance by adding 1 to it.So, each cell containing 0 will be
                //updated with the previous distance value + 1
                // we do not add any node to the queue containing other than 0 value
                queue.add(new int[]{newRow, newCol});
                grid[newRow][newCol] = distance + 1;
            }
        }

        // The target is not reachable, and we return -1.
        return -1;
    }



    }

