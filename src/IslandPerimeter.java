public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {

        int rowCnt = grid.length;  // count of rows of grid
        int colCnt = grid[0].length; // count of columns of grid

        int up, down, left, right;
        int perimeter = 0;
        for (int i = 0; i < rowCnt; i++) {
            for (int j = 0; j < colCnt; j++) {

                if (grid[i][j] == 1) {     // if cell is land

                    if (i == 0) up = 0;   // if first row then top will be water, so assign 0 else move up by one row
                    else up = grid[i - 1][j];

                    if (j == 0)
                        left = 0;   // if first column, then left has water obvio,so assign0 elsemove leftby 1 cell
                    else left = grid[i][j - 1];

                    if (i == rowCnt - 1) down = 0;
                    else down = grid[i + 1][j];

                    if (j == colCnt - 1) right = 0;
                    else right = grid[i][j + 1];

                    perimeter = perimeter + (4 - (up + down + left + right));  // this will subtract land sides (assigned 1) from 4, giving the area surrounded by water.
                }
            }
        }
        return perimeter;
    }
}


/*
You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.

Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).

The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
Output: 16
Explanation: The perimeter is the 16 yellow stripes in the image above.
*/
