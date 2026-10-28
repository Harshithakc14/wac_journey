Day 009 – Add Digits

Problem

LeetCode 258: Add Digits

Given an integer "num", repeatedly add all its digits until the result contains only one digit, and return that digit.

Pattern

- Mathematics
- Digit Manipulation
- Digital Root

Languages

- Python
- Java

Approach 1: Iterative

1. Extract the last digit using "num % 10".
2. Add the digit to a running sum.
3. Remove the last digit using integer division.
4. Repeat until all digits are processed.
5. Replace "num" with the sum and repeat until one digit remains.

Approach 2: Mathematical

Use the digital root formula:

- If "num == 0", return "0".
- If "num % 9 == 0", return "9" for positive numbers.
- Otherwise, return "num % 9".

The mathematical approach takes constant time.

Complexity

Iterative approach

- Time: O(log n) per digit-sum pass; repeated passes depend on the number of digits.
- Space: O(1)

Mathematical approach

- Time: O(1)
- Space: O(1)

What I Learned

- How to extract digits using modulo.
- How integer division removes the last digit.
- How to solve digit-manipulation problems using loops.
- How the digital root formula optimizes the solution.
- How to implement the solution in Python and Java.

LeetCode




LeetCode 1952 – Three Divisors

Problem

Given an integer "n", return "true" if "n" has exactly three positive divisors. Otherwise, return "false".

Pattern

- Mathematics
- Number Theory
- Prime Numbers
- Perfect Squares

Python Approach – Count Divisors

1. Initialize "count = 0".
2. Iterate from "1" to "n".
3. If "n % i == 0", increment "count".
4. Return "count == 3".

Time Complexity: O(n)
Space Complexity: O(1)

Java Approach – Perfect Square and Prime Check

1. Calculate the integer square root of "n".
2. If "root * root != n", return "false".
3. Check whether the square root is prime by testing divisors up to its square root.
4. Return "true" if the root is prime; otherwise, return "false".

A number has exactly three positive divisors if and only if it is the square of a prime number.

Time Complexity: O(√n)
Space Complexity: O(1)

Example

Input: "n = 9"

Output: "true"

Explanation: The positive divisors of 9 are "1, 3, 9". Therefore, it has exactly three divisors.

What I Learned

- How to count divisors using the modulo operator.
- How to check whether a number is a perfect square.
- How prime numbers relate to the number of divisors.
- How to improve a brute-force approach using mathematics.

LeetCode

"Three Divisors – LeetCode 1952" (https://leetcode.com/problems/three-divisors/)"Add Digits – LeetCode 258" (https://leetcode.com/problems/add-digits/)
