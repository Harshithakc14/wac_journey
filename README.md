# wac_journey
   LeetCode 7 – Reverse Integer

Problem

Given a signed 32-bit integer "x", reverse its digits. If the reversed integer falls outside the signed 32-bit integer range, return "0".

Examples

Input| Output
"x = 123"| "321"
"x = -123"| "-321"
"x = 120"| "21"
"x = 1534236469"| "0"

Approach

1. Store the sign of the original number.
2. Convert the number to its absolute value using "abs()".
3. Extract the last digit using "% 10".
4. Build the reversed number using "rev = rev * 10 + digit".
5. Remove the last digit using "// 10".
6. Restore the original sign.
7. Check whether the result is within the signed 32-bit integer range. If not, return "0".


Complexity Analysis

- Time Complexity: "O(log |x|)" — each loop processes one digit.
- Space Complexity: "O(1)" — only a constant amount of extra space is used.

Concepts Learned

- Conditional expressions ("if-else")
- Absolute value using "abs()"
- Modulo operator ("%")
- Integer division ("//")
- Reversing digits using arithmetic
- Signed 32-bit integer overflow checking

Platform: LeetCode
Problem Number: 7
Language: Python and java
