

## Easy
- [Add Binary]

public class GFG {
  
    // This function adds two 
    // binary strings and return
    // result as a third string
    static String addBinary(String a, String b)
    {    
          //If the inputs are 0
        if(a.charAt(0) == '0' && b.charAt(0) == '0'){
             return "0";
        }
        // Initialize result
        StringBuilder result = new StringBuilder(""); 
          
        // Initialize digit sum
        int s = 0;         
  
        // Traverse both strings starting 
        // from last characters
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || s == 1)
        {
              
            // Comput sum of last 
            // digits and carry
            s += ((i >= 0)? a.charAt(i) - '0': 0);
            s += ((j >= 0)? b.charAt(j) - '0': 0);
  
            // If current digit sum is 
            // 1 or 3, add 1 to result
            result.append((char)(s % 2 + '0'));
  
            // Compute carry
            s /= 2;
  
            // Move to next digits
            i--; j--;
        }
        
          // Remove leading zeros, if any
          int start = result.length()-1;
          
        while(start >=0 && result.charAt(start) == '0') {
            start--;
        }
          
        if(start != result.length()-1) {
            result.delete(start+1,result.length());
        }
          
        return result.reverse().toString();
    }
  
    //Driver code
    public static void main(String args[])
    {
        String a = "1101", b="100";
          
        System.out.print(addBinary(a, b));
    }
}
  



- [Single Number]

public int singleNumber(int[] A) {
	int x = 0;
	for (int a : A) {
		x = x ^ a;
	}
	return x;
}


- [Reverse Bits]


Input: n = 00000010100101000001111010011100
Output:    964176192 (00111001011110000010100101000000)
Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596, so return 964176192 which its binary representation is 00111001011110000010100101000000.




- [Number of 1 Bits]

** * Java Program to count number of 1s in the given bit sequence * input : 1001010100111 * output : 7 * * @author WINDOWS 8 */ public class BitSequenceTest{ public static void main(String args[]) { System.out.println("Testing our countBits() method with bit sequences"); String[] input = {"000000", "001000", "101", "111", "1110001", "111110000"}; for(int i=0; i<input.length; i++){ int binary = Integer.parseInt(input[i], 2); int count = countBits(binary); System.out.println("bit sequence : " + input[i] + ", number of 1s : " + count); } } /** * Java method to calculate number of set bits in a given bit sequence. * * @param number is the integer but represent binary value * @return count of set bits in bit sequence */ public static int countBits(int number) { if (number == 0) { return number; } int count = 0; while (number != 0) { number &= (number - 1); count++; } return count; } }

Read more: https://www.java67.com/2016/01/how-to-count-number-of-1s-in-given-bit-sequence-in-java.html#ixzz7njhNdgi8



- [Counting Bits]
** * Java Program to count number of 1s in the given bit sequence * input : 1001010100111 * output : 7 * * @author WINDOWS 8 */ public class BitSequenceTest{ public static void main(String args[]) { System.out.println("Testing our countBits() method with bit sequences"); String[] input = {"000000", "001000", "101", "111", "1110001", "111110000"}; for(int i=0; i<input.length; i++){ int binary = Integer.parseInt(input[i], 2); int count = countBits(binary); System.out.println("bit sequence : " + input[i] + ", number of 1s : " + count); } } /** * Java method to calculate number of set bits in a given bit sequence. * * @param number is the integer but represent binary value * @return count of set bits in bit sequence */ public static int countBits(int number) { if (number == 0) { return number; } int count = 0; while (number != 0) { number &= (number - 1); count++; } return count; } }

Read more: https://www.java67.com/2016/01/how-to-count-number-of-1s-in-given-bit-sequence-in-java.html#ixzz7njhNdgi8


- [Binary Watch]


** * Java Program to count number of 1s in the given bit sequence * input : 1001010100111 * output : 7 * * @author WINDOWS 8 */ public class BitSequenceTest{ public static void main(String args[]) { System.out.println("Testing our countBits() method with bit sequences"); String[] input = {"000000", "001000", "101", "111", "1110001", "111110000"}; for(int i=0; i<input.length; i++){ int binary = Integer.parseInt(input[i], 2); int count = countBits(binary); System.out.println("bit sequence : " + input[i] + ", number of 1s : " + count); } } /** * Java method to calculate number of set bits in a given bit sequence. * * @param number is the integer but represent binary value * @return count of set bits in bit sequence */ public static int countBits(int number) { if (number == 0) { return number; } int count = 0; while (number != 0) { number &= (number - 1); count++; } return count; } }

Read more: https://www.java67.com/2016/01/how-to-count-number-of-1s-in-given-bit-sequence-in-java.html#ixzz7njhNdgi8



- [Hamming Distance]


** * Java Program to count number of 1s in the given bit sequence * input : 1001010100111 * output : 7 * * @author WINDOWS 8 */ public class BitSequenceTest{ public static void main(String args[]) { System.out.println("Testing our countBits() method with bit sequences"); String[] input = {"000000", "001000", "101", "111", "1110001", "111110000"}; for(int i=0; i<input.length; i++){ int binary = Integer.parseInt(input[i], 2); int count = countBits(binary); System.out.println("bit sequence : " + input[i] + ", number of 1s : " + count); } } /** * Java method to calculate number of set bits in a given bit sequence. * * @param number is the integer but represent binary value * @return count of set bits in bit sequence */ public static int countBits(int number) { if (number == 0) { return number; } int count = 0; while (number != 0) { number &= (number - 1); count++; } return count; } }

Read more: https://www.java67.com/2016/01/how-to-count-number-of-1s-in-given-bit-sequence-in-java.html#ixzz7njhNdgi8





- [Number Complement]

** * Java Program to count number of 1s in the given bit sequence * input : 1001010100111 * output : 7 * * @author WINDOWS 8 */ public class BitSequenceTest{ public static void main(String args[]) { System.out.println("Testing our countBits() method with bit sequences"); String[] input = {"000000", "001000", "101", "111", "1110001", "111110000"}; for(int i=0; i<input.length; i++){ int binary = Integer.parseInt(input[i], 2); int count = countBits(binary); System.out.println("bit sequence : " + input[i] + ", number of 1s : " + count); } } /** * Java method to calculate number of set bits in a given bit sequence. * * @param number is the integer but represent binary value * @return count of set bits in bit sequence */ public static int countBits(int number) { if (number == 0) { return number; } int count = 0; while (number != 0) { number &= (number - 1); count++; } return count; } }

Read more: https://www.java67.com/2016/01/how-to-count-number-of-1s-in-given-bit-sequence-in-java.html#ixzz7njhNdgi8



- [Set Mismatch]

** * Java Program to count number of 1s in the given bit sequence * input : 1001010100111 * output : 7 * * @author WINDOWS 8 */ public class BitSequenceTest{ public static void main(String args[]) { System.out.println("Testing our countBits() method with bit sequences"); String[] input = {"000000", "001000", "101", "111", "1110001", "111110000"}; for(int i=0; i<input.length; i++){ int binary = Integer.parseInt(input[i], 2); int count = countBits(binary); System.out.println("bit sequence : " + input[i] + ", number of 1s : " + count); } } /** * Java method to calculate number of set bits in a given bit sequence. * * @param number is the integer but represent binary value * @return count of set bits in bit sequence */ public static int countBits(int number) { if (number == 0) { return number; } int count = 0; while (number != 0) { number &= (number - 1); count++; } return count; } }

Read more: https://www.java67.com/2016/01/how-to-count-number-of-1s-in-given-bit-sequence-in-java.html#ixzz7njhNdgi8



- [Binary Number with Alternating Bits]
Input: n = 5
Output: true
Explanation: The binary representation of 5 is: 101

- [Prime Number of Set Bits in Binary Representation]
Input  : l = 6, r = 10
Output : 4
Explanation  :
6  -> 110  (2 set bits, 2 is prime)
7  -> 111  (3 set bits, 3 is prime)
9  -> 1001 (2 set bits, 2 is prime)
10 -> 1010 (2 set bits, 2 is prime)
Hence count is 4

Input  : l = 10, r = 15
Output : 5
10 -> 1010 (2 set bits, 2 is prime)
11 -> 1011 (3 set bits, 3 is prime)
12 -> 1100 (2 set bits, 2 is prime)
13 -> 1101 (3 set bits, 3 is prime)
14 -> 1110 (3 set bits, 3 is prime)
Hence count is 5



- [Binary Gap]

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
  public int solution(int N) {
    String binaryString = Integer.toBinaryString(N);
   
    int longestBinaryGap = 0;
    List onesList = new ArrayList();
   
    for(int i=0; i<binaryString.length(); i++) {
      if(binaryString.charAt(i) == '0') continue;
      onesList.add(i);
    }

    for(int i=0; i<onesList.size() - 1; i++) {
      //subtract 1 so that don't count 1's next to each other as having any gap
      int indicesDiff = onesList.get(i+1) - onesList.get(i) - 1;
     
      longestBinaryGap = Math.max(longestBinaryGap, indicesDiff);
    }
    return longestBinaryGap;
  }
}


- [Number of Steps to Reduce a Number to Zero](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/)

Input: num = 14
Output: 6
Explanation: 
Step 1) 14 is even; divide by 2 and obtain 7. 
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3. 
Step 4) 3 is odd; subtract 1 and obtain 2. 
Step 5) 2 is even; divide by 2 and obtain 1. 
Step 6) 1 is odd; subtract 1 and obtain 0.




- [Sort Integers by The Number of 1 Bits](https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/)

input: n = 00000000000000000000000000001011
Output: 3
Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.



- [XOR Operation in an Array](https://leetcode.com/problems/xor-operation-in-an-array/)

Input: n = 5, start = 0
Output: 8
Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
Where "^" corresponds to bitwise XOR operator.



- [Count the Number of Consistent Strings](https://leetcode.com/problems/count-the-number-of-consistent-strings/)


Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.




- [Decode XORed Array](https://leetcode.com/problems/decode-xored-array/)

Input: encoded = [1,2,3], first = 1
Output: [1,0,2,1]
Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]



- [Sum of All Subset XOR Totals](https://leetcode.com/problems/sum-of-all-subset-xor-totals/)

Input :  arr[] = {1, 5, 6}
Output : 28
Total Subsets = 23
1 = 1
5 = 5
6 = 6
1 ^ 5 = 4
1 ^ 6 = 7
5 ^ 6 = 3
1 ^ 5 ^ 6 = 2
0(empty subset)
Now SUM of all these XORs = 1 + 5 + 6 + 4 +
                            7 + 3 + 2 + 0
                          = 28

Input : arr[] = {1, 2}
Output : 6


- [Longest Nice Substring](https://leetcode.com/problems/longest-nice-substring/)

Input: s = "YazsaAay"
Output: "aAa"
Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear.
"aAa" is the longest nice substring.



## Medium
- [Subsets](https://leetcode.com/problems/subsets/)

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]


- [Subsets II](https://leetcode.com/problems/subsets-ii/)

Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]



- [Single Number II](https://leetcode.com/problems/single-number-ii/)

Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]


- [Divide Two Integers](https://leetcode.com/problems/divide-two-integers/)

Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = 3.33333.. which is truncated to 3.


- [Gray Code](https://leetcode.com/problems/gray-code/)

Input: n = 2
Output: [0,1,3,2]
Explanation:
The binary representation of [0,1,3,2] is [00,01,11,10].
- 00 and 01 differ by one bit
- 01 and 11 differ by one bit
- 11 and 10 differ by one bit
- 10 and 00 differ by one bit
[0,2,3,1] is also a valid gray code sequence, whose binary representation is [00,10,11,01].
- 00 and 10 differ by one bit
- 10 and 11 differ by one bit
- 11 and 01 differ by one bit
- 01 and 00 differ by one bit


- [Repeated DNA Sequences](https://leetcode.com/problems/repeated-dna-sequences/)
Input: n = 2
Output: [0,1,3,2]
Explanation:
The binary representation of [0,1,3,2] is [00,01,11,10].
- 00 and 01 differ by one bit
- 01 and 11 differ by one bit
- 11 and 10 differ by one bit
- 10 and 00 differ by one bit
[0,2,3,1] is also a valid gray code sequence, whose binary representation is [00,10,11,01].
- 00 and 10 differ by one bit
- 10 and 11 differ by one bit
- 11 and 01 differ by one bit
- 01 and 00 differ by one bit



## Hard
- [Minimum Number of Flips to onvert Binary Matrix to zero matrix](https://leetcode.com/problems/minimum-number-of-flips-to-convert-binary-matrix-to-zero-matrix/)


Input: mat = [[0,0],[0,1]]
Output: 3
Explanation: One possible solution is to flip (1, 0) then (0, 1) and finally (1, 1) as shown.


- [Minimum cost to connect two group of points](https://leetcode.com/problems/minimum-cost-to-connect-two-groups-of-points/)
Input: cost = [[1, 3, 5], [4, 1, 1], [1, 5, 3]]
Output: 4
Explanation: The optimal way of connecting the groups is:
1--A
2--B
2--C
3--A
This results in a total cost of 4.
Note that there are multiple points connected to point 2 in the first group and point A in the second group. This does not matter as there is no limit to the number of points that can be connected. We only care about the minimum total cost.





- [Find XOR Sum of All Pairs Bitwise AND](https://leetcode.com/problems/find-xor-sum-of-all-pairs-bitwise-and/)

Input: arr1 = [1,2,3], arr2 = [6,5]
Output: 0
Explanation: The list = [1 AND 6, 1 AND 5, 2 AND 6, 2 AND 5, 3 AND 6, 3 AND 5] = [0,1,2,0,2,1].
The XOR sum = 0 XOR 1 XOR 2 XOR 0 XOR 2 XOR 1 = 0.

# Additionally
- Click on [*Show problem tags*](https://leetcode.com/tag/bit-manipulation/) and do the questions that contains tags of topics we have covered so far.