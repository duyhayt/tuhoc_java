package ThuatToan;

public class Palindrome_Number {

  public static void main(String[] args) {
    Solution1 solution = new Solution1();

    int num1 = 121;
    boolean result1 = solution.isPalindrome(num1);
    System.out.println(num1 + " is palindrome: " + result1);

    int num2 = -121;
    boolean result2 = solution.isPalindrome(num2);
    System.out.println(num2 + " is palindrome: " + result2);

    int num3 = 10;
    boolean result3 = solution.isPalindrome(num3);
    System.out.println(num3 + " is palindrome: " + result3);
  }

}

class Solution1 {

  public boolean isPalindrome(int x) {
    // Xử lý các trường hợp đặc biệt
    if (x < 0 || (x != 0 && x % 10 == 0)) {
      return false;
    }

    int reverse = 0;
    int original = x;

    while (x != 0) {
      int digit = x % 10;
      reverse = reverse * 10 + digit;
      x /= 10;
    }

    return original == reverse;
  }
}
