package CourseEra;

public class Greedy {
    public static void main(String[] args) {
        //largest num
        int m = 123489;
        int arr[] = {1, 2, 3, 4, 8, 9};
        char c[] = {'1', '2', '3', '8', '9'};
        int res2 = largestNum(c);
        System.out.print(res2);

    }

    public static int largestNum(char[] ch) {
        StringBuilder sb = new StringBuilder();
        int m= 0;
        for (int i = 0; i < ch.length; i++) {
            m = max(ch);
            sb.append(m);
        }
        String res = sb.toString();
        int res2 = Integer.parseInt(res);
        return res2;
    }

//a function which returns the maximum element from the list and also put a zero in the position of
    //maximum element so that in the next iteration we can find the next max element.

    public static int max(char[] ch) {
        int max = Integer.MIN_VALUE;
        int zero = 0;
        for (int i = 0; i < ch.length; i++) {
            if (max < (ch[i] - '0')) {
                max = ch[i] - '0';
                zero = i;
            }
        }
        ch[zero] = '0';
        return max;
    }
}