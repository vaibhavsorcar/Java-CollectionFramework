import java.util.Arrays;
public class AssignCookies {
    public static int findContentChildren(int[] greed, int[] cookieSize) {
        Arrays.sort(greed);
        Arrays.sort(cookieSize);
        int l = 0, r = 0;

        while (l < cookieSize.length && r < greed.length) {
            if (greed[r] <= cookieSize[l]) r++;
            l++;
        }

        return r;
    }

    public static void main(String[] args) {
        int[] greed = {1, 5, 3, 3, 4};
        int[] cookieSize = {4, 2, 1, 2, 1, 3};

        System.out.println("Array Representing Greed: " + Arrays.toString(greed));
        System.out.println("Array Representing Cookie Size: " + Arrays.toString(cookieSize));

        int ans = findContentChildren(greed, cookieSize);
        System.out.println("No. of kids assigned cookies: " + ans);
    }
}
