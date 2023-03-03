import java.util.*;
public class Main
{
  public static String reverse(String s) {
  String[] words = s.split("\\s");
  int left = 0, right = words.length - 1;
  while (left <= right) {
    String temp = words[left];
    words[left] = words[right];
    words[right] = temp;
    left += 1;
    right -= 1;
  }
  String ans = String.join(" ", words);
  return ans;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(reverse(s));
		
	}
}
