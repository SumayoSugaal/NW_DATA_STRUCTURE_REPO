# [Video Link](https://youtu.be/n60Dn0UsbEk)

## Submit the following on your Leetcode profile itself.

### Easy
1. [Build Array from Permutation]
Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows: 
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]



2. [Concatenation of Array]

import java.util.Arrays;

public class Concat {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);

        System.out.println(Arrays.toString(result));
    }
}

3. [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)
import java.util.Arrays;

public class Concat {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);

        System.out.println(Arrays.toString(result));
    }
}


4. [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/)
import java.util.Arrays;

public class Concat {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);

        System.out.println(Arrays.toString(result));
    }
}


5. [Shuffle the Array]

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class Test
{
  public static void main(String args[])
  {
    int[] solutionArray = { 1, 2, 3, 4, 5, 6, 16, 15, 14, 13, 12, 11 };

    shuffleArray(solutionArray);
    for (int i = 0; i < solutionArray.length; i++)
    {
      System.out.print(solutionArray[i] + " ");
    }
    System.out.println();
  }

  // Implementing Fisher–Yates shuffle
  static void shuffleArray(int[] ar)
  {
    // If running on Java 6 or older, use `new Random()` on RHS here
    Random rnd = ThreadLocalRandom.current();
    for (int i = ar.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      // Simple swap
      int a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
    }
  }
}



6. [Kids With the Greatest Number of Candies]

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.



7. [Number of Good Pairs]

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.




8. [How Many Numbers Are Smaller Than the Current Number]

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.



9. [Create Target Array in the Given Order]

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.



10. [Check if the Sentence Is Pangram]

input: str = “Abcdefghijklmnopqrstuvwxyz”
Output: Yes
Explanation: The given string contains all the letters from a to z (ignoring case).



11. [Count Items Matching a Rule] 
nput: str = “Abcdefghijklmnopqrstuvwxyz”
Output: Yes
Explanation: The given string contains all the letters from a to z (ignoring case).


12. [Find the Highest Altitude]

nput: str = “Abcdefghijklmnopqrstuvwxyz”
Output: Yes
Explanation: The given string contains all the letters from a to z (ignoring case).



13. [Flipping an Image]

// Flip the image vertically
AffineTransform tx = AffineTransform.getScaleInstance(1, -1);
tx.translate(0, -image.getHeight(null));
AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
image = op.filter(image, null);


// Flip the image horizontally
tx = AffineTransform.getScaleInstance(-1, 1);
tx.translate(-image.getWidth(null), 0);
op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
image = op.filter(image, null);

// Flip the image vertically and horizontally; equivalent to rotating the image 180 degrees
tx = AffineTransform.getScaleInstance(-1, -1);
tx.translate(-image.getWidth(null), -image.getHeight(null));
op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
image = op.filter(image, null);



14. [Cells with Odd Values in a Matrix]

// Flip the image vertically
AffineTransform tx = AffineTransform.getScaleInstance(1, -1);
tx.translate(0, -image.getHeight(null));
AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
image = op.filter(image, null);


// Flip the image horizontally
tx = AffineTransform.getScaleInstance(-1, 1);
tx.translate(-image.getWidth(null), 0);
op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
image = op.filter(image, null);

// Flip the image vertically and horizontally; equivalent to rotating the image 180 degrees
tx = AffineTransform.getScaleInstance(-1, -1);
tx.translate(-image.getWidth(null), -image.getHeight(null));
op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
image = op.filter(image, null);




15. [Matrix Diagonal Sum]

Input 1 :  6 7 3 4
               8 9 2 1
              1 2 9 6
              6 5 7 2




16. [Find Numbers with Even Number of Digits]

Input 1 :  6 7 3 4
               8 9 2 1
              1 2 9 6
              6 5 7 2


17. [Transpose Matrix]

Input 1 :  6 7 3 4
               8 9 2 1
              1 2 9 6
              6 5 7 2



18. [Add to Array-Form of Integer]


Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234




19. [Maximum Population Year]

Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234



20. [Determine Whether Matrix Can Be Obtained By Rotation]

Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234



21. [Two Sum]

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].



22. [Find N Unique Integers Sum up to Zero]
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


23. [Lucky Number In a Matrix]

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].



24. [Maximum Subarray]

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

25. [Reshape the Matrix]
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].



26. [Plus One]

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].



27. [Remove Duplicates from Sorted Array]

Input: nums = [1,1,2]
Output: 2, nums = [1,2]
Explanation: Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the returned length.

28. [Minimum Cost to Move Chips to The Same Position]

Input: nums = [1,1,2]
Output: 2, nums = [1,2]
Explanation: Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the returned length.




### Medium
1. [Spiral Matrix]
import java.util.*;
 
class Solution {
 
    // Function to print in spiral order
    public static List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> ans = new ArrayList<Integer>();
 
        if (matrix.length == 0)
            return ans;
 
        int m = matrix.length, n = matrix[0].length;
        boolean[][] seen = new boolean[m][n];
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };
        int x = 0, y = 0, di = 0;
 
        // Iterate from 0 to R * C - 1
        for (int i = 0; i < m * n; i++) {
            ans.add(matrix[x][y]);
            seen[x][y] = true;
            int cr = x + dr[di];
            int cc = y + dc[di];
 
            if (0 <= cr && cr < m && 0 <= cc && cc < n
                && !seen[cr][cc]) {
                x = cr;
                y = cc;
            }
            else {
                di = (di + 1) % 4;
                x += dr[di];
                y += dc[di];
            }
        }
        return ans;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };
 
        // Function call
        System.out.println(spiralOrder(a));
    }
}


2. [Spiral Matrix II]

import java.util.*;
 
class Solution {
 
    // Function to print in spiral order
    public static List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> ans = new ArrayList<Integer>();
 
        if (matrix.length == 0)
            return ans;
 
        int m = matrix.length, n = matrix[0].length;
        boolean[][] seen = new boolean[m][n];
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };
        int x = 0, y = 0, di = 0;
 
        // Iterate from 0 to R * C - 1
        for (int i = 0; i < m * n; i++) {
            ans.add(matrix[x][y]);
            seen[x][y] = true;
            int cr = x + dr[di];
            int cc = y + dc[di];
 
            if (0 <= cr && cr < m && 0 <= cc && cc < n
                && !seen[cr][cc]) {
                x = cr;
                y = cc;
            }
            else {
                di = (di + 1) % 4;
                x += dr[di];
                y += dc[di];
            }
        }
        return ans;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };
 
        // Function call
        System.out.println(spiralOrder(a));
    }
}



3. [Spiral Matrix III]
import java.util.*;
 
class Solution {
 
    // Function to print in spiral order
    public static List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> ans = new ArrayList<Integer>();
 
        if (matrix.length == 0)
            return ans;
 
        int m = matrix.length, n = matrix[0].length;
        boolean[][] seen = new boolean[m][n];
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };
        int x = 0, y = 0, di = 0;
 
        // Iterate from 0 to R * C - 1
        for (int i = 0; i < m * n; i++) {
            ans.add(matrix[x][y]);
            seen[x][y] = true;
            int cr = x + dr[di];
            int cc = y + dc[di];
 
            if (0 <= cr && cr < m && 0 <= cc && cc < n
                && !seen[cr][cc]) {
                x = cr;
                y = cc;
            }
            else {
                di = (di + 1) % 4;
                x += dr[di];
                y += dc[di];
            }
        }
        return ans;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };
 
        // Function call
        System.out.println(spiralOrder(a));
    }
}


4. [Set Matrix Zeroes]

import java.util.*;
 
class Solution {
 
    // Function to print in spiral order
    public static List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> ans = new ArrayList<Integer>();
 
        if (matrix.length == 0)
            return ans;
 
        int m = matrix.length, n = matrix[0].length;
        boolean[][] seen = new boolean[m][n];
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };
        int x = 0, y = 0, di = 0;
 
        // Iterate from 0 to R * C - 1
        for (int i = 0; i < m * n; i++) {
            ans.add(matrix[x][y]);
            seen[x][y] = true;
            int cr = x + dr[di];
            int cc = y + dc[di];
 
            if (0 <= cr && cr < m && 0 <= cc && cc < n
                && !seen[cr][cc]) {
                x = cr;
                y = cc;
            }
            else {
                di = (di + 1) % 4;
                x += dr[di];
                y += dc[di];
            }
        }
        return ans;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };
 
        // Function call
        System.out.println(spiralOrder(a));
    }
}


5. [Product of Array Except Self]

Input: arr[]  = {10, 3, 5, 6, 2}
Output: prod[]  = {180, 600, 360, 300, 900}
3 * 5 * 6 * 2 product of other array 
elements except 10 is 180
10 * 5 * 6 * 2 product of other array 
elements except 3 is 600
10 * 3 * 6 * 2 product of other array 
elements except 5 is 360
10 * 3 * 5 * 2 product of other array 
elements except 6 is 300
10 * 3 * 6 * 5 product of other array 
elements except 2 is 900


Input: arr[]  = {1, 2, 3, 4, 5}
Output: prod[]  = {120, 60, 40, 30, 24 }
2 * 3 * 4 * 5  product of other array 
elements except 1 is 120
1 * 3 * 4 * 5  product of other array 
elements except 2 is 60
1 * 2 * 4 * 5  product of other array 
elements except 3 is 40
1 * 2 * 3 * 5  product of other array 
elements except 4 is 30
1 * 2 * 3 * 4  product of other array 
elements except 5 is 24


6. [Find First and Last Position of Element in Sorted Array]

Input: arr[]  = {10, 3, 5, 6, 2}
Output: prod[]  = {180, 600, 360, 300, 900}
3 * 5 * 6 * 2 product of other array 
elements except 10 is 180
10 * 5 * 6 * 2 product of other array 
elements except 3 is 600
10 * 3 * 6 * 2 product of other array 
elements except 5 is 360
10 * 3 * 5 * 2 product of other array 
elements except 6 is 300
10 * 3 * 6 * 5 product of other array 
elements except 2 is 900


Input: arr[]  = {1, 2, 3, 4, 5}
Output: prod[]  = {120, 60, 40, 30, 24 }
2 * 3 * 4 * 5  product of other array 
elements except 1 is 120
1 * 3 * 4 * 5  product of other array 
elements except 2 is 60
1 * 2 * 4 * 5  product of other array 
elements except 3 is 40
1 * 2 * 3 * 5  product of other array 
elements except 4 is 30
1 * 2 * 3 * 4  product of other array 
elements except 5 is 24


7. [Jump Game]

Input: s = "011010", minJump = 2, maxJump = 3
Output: true
Explanation:
In the first step, move from index 0 to index 3. 
In the second step, move from index 3 to index 5.


8. [Rotate Array]
Input: s = "011010", minJump = 2, maxJump = 3
Output: true
Explanation:
In the first step, move from index 0 to index 3. 
In the second step, move from index 3 to index 5.


9. [Sort Colors]

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

10. [House Robber]


Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.


### Hard
1. [Max Value of Equation](https://leetcode.com/problems/max-value-of-equation/)
2. [First Missing Positive](https://leetcode.com/problems/first-missing-positive/)
3. [Good Array](https://leetcode.com/problems/check-if-it-is-a-good-array/)