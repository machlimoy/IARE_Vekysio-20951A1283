import java.util.*;
public class reversewords
{
    public static void reverse(String[] words, int left, int right) {
        if(left >= right)
            return;
        String temp = words[left];
        words[left] = words[right];
        words[right] = temp;
        reverse(words,left+1,right-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split("\\s");
        int left = 0, right = words.length - 1;
        reverse(words,left,right);
        String ans = String.join(" ", words);
        System.out.println(ans);

    }
}
