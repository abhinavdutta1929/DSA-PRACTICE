//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package array;

public class smallest_letter {
    public static void main(String[] args) {
        char[] letter = new char[]{'a', 'b', 'c', 'd'};
        char target = 'd';
        char ans = small_letter(letter, target);
        System.out.println(ans);
    }

    public static char small_letter(char[] letter, char target) {
        int start = 0;
        int end = letter.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letter[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letter[start % letter.length];
    }
}
