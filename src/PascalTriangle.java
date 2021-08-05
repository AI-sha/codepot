import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascalTri = new ArrayList<List<Integer>>();
        // creating an arraylist of lists pascalTri which is the pascal's triangle

        pascalTri.add(new ArrayList<>());
        // what does this achieve? error without this statement

        pascalTri.get(0).add(1); // first row of the triangle

        for(int row = 1; row < numRows; row++)
        {
            List<Integer> currRow = new ArrayList<>(); // current row array list
            List<Integer> prevRow = pascalTri.get(row-1); // prev row array list

            currRow.add(1); // this is the first row element

            for(int j = 1; j < row; j++) // loop to exclude first and last element of each row
            {
                currRow.add(prevRow.get(j-1) + prevRow.get(j));
            }

            currRow.add(1); // the last row element is 1

            pascalTri.add(currRow);

        }

        return pascalTri;
    }

}

/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */

