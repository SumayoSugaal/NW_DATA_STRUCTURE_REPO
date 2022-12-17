

# Questions

## Easy
- [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.


- [Majority Element](https://leetcode.com/problems/majority-element/)

Input: nums = [3,2,3]
Output: 3



- [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)

Input: nums = [1,2,3,1]
Output: true



- [Missing Number](https://leetcode.com/problems/missing-number/)

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.



- [Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/)

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.


- [Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/)

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]



- [Third Maximum Number](https://leetcode.com/problems/third-maximum-number/)

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]


- [Assign Cookies](https://leetcode.com/problems/assign-cookies/)

input: g = [1,2,3], s = [1,1]
Output: 1
Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
You need to output 1.


- [Array Partition I](https://leetcode.com/problems/array-partition-i/)
Input: nums = [5,0,3,8,6]
Output: 3
Explanation: left = [5,0,3], right = [8,6]



- [Maximum Product of Three Numbers](https://leetcode.com/problems/maximum-product-of-three-numbers/)
Input: nums = [5,0,3,8,6]
Output: 3
Explanation: left = [5,0,3], right = [8,6]


- [Sort Array By Parity](https://leetcode.com/problems/sort-array-by-parity/)

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.


- [Sort Array By Parity II](https://leetcode.com/problems/sort-array-by-parity-ii/)

Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.


- [Largest Perimeter Triangle](https://leetcode.com/problems/largest-perimeter-triangle/)

Input: nums = [2,1,2]
Output: 5
Explanation: You can form a triangle with three side lengths: 1, 2, and 2.


- [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)

Input: nums = [2,1,2]
Output: 5
Explanation: You can form a triangle with three side lengths: 1, 2, and 2.


- [Matrix Cells in Distance Order](https://leetcode.com/problems/matrix-cells-in-distance-order/)
Input: rows = 2, cols = 2, rCenter = 0, cCenter = 1
Output: [[0,1],[0,0],[1,1],[1,0]]


- [Height Checker](https://leetcode.com/problems/height-checker/)

Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation: 
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]





- [Relative Sort Array](https://leetcode.com/problems/relative-sort-array/)

Input: nums = [2,1,2]
Output: 5
Explanation: You can form a triangle with three side lengths: 1, 2, and 2.

- [Minimum Absolute Difference](https://leetcode.com/problems/minimum-absolute-difference/)

Input: nums = [5,0,3,8,6]
Output: 3
Explanation: left = [5,0,3], right = [8,6]
- [Rank Transform of an Array](https://leetcode.com/problems/rank-transform-of-an-array/)
Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation: 
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]

- [Sort Integers by The Number of 1 Bits](https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/)

Input: arr = [0,1,2,3,4,5,6,7,8]
Output: [0,1,2,4,8,3,5,6,7]


- [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)



## Medium
- [3Sum](https://leetcode.com/problems/3sum/)

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].


- [3Sum Closest](https://leetcode.com/problems/3sum-closest/)

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].


- [4Sum](https://leetcode.com/problems/4sum/)

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]


- [Group Anagrams](https://leetcode.com/problems/group-anagrams/)
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]



- [Merge Intervals](https://leetcode.com/problems/merge-intervals/)

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.


- [Sort Colors](https://leetcode.com/problems/sort-colors/)

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]



- [Insertion Sort List](https://leetcode.com/problems/insertion-sort-list/)

Input: head = [4,2,1,3]
Output: [1,2,3,4]

## Hard
- [First missing Positive](https://leetcode.com/problems/first-missing-positive/)

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.