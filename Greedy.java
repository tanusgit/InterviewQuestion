package CourseEra;

public class Greedy {
    public static void main(String[] args) {
        //largest num
        int m = 123489;
        int arr[] = {1, 2, 3, 4, 8, 9, 0, 5, 6, 1, 2, 5};
        char c[] = {'1', '2', '3', '8', '9'};
       // int res2 = largestNum(c);
       // System.out.print(res2);
        /*bubbleSort(arr);
        for (int i: arr
             ) {
            System.out.print(i);
        }*/

       mergeSort(arr, 0, 11);
       // merge(arr, 0, 5, 11);
        for (int i: arr
        ) {
           System.out.println("after mergesort " + i);
        }

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


    public static void bubbleSort(int[] a ){
        for(int i = 0; i < a.length-1; i++){
            for(int j = i+1; j < a.length; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] a, int left, int right ){
            if(left < right){
                int mid = left + (right - left) / 2;
                mergeSort(a, left, mid);
                mergeSort(a, mid+1, right);
                merge(a, left, mid, right);
            }
    }

    private static void merge(int[] a, int left, int mid, int right) {
        int leftlen = (mid - left )+1;
        int rightlen = (right - mid);
        int[] l = new int[leftlen];
        int[] r = new int[rightlen];
        for(int i = 0; i < leftlen; i++){
            l[i] = a[i+left];
        }
        for(int j = 0; j < rightlen; j++){
            r[j] = a[j+mid+1];
        }
        int i = 0;
        int j = 0;
        int k = left;

        while(i < leftlen && j < rightlen){
            if(l[i] <= r[j]){
                a[k] = l[i];
                i++;
                k++;
            }else{
                a[k] = r[j];
                j++;
                k++;
            }
        }
        while(i < leftlen){
            a[k] = l[i];
            i++;
            k++;
        }
        while(j < rightlen){
            a[k] = r[j];
            j++;
            k++;
        }

    }


    public static void merge(int[] a , int[] b){
        int len = a.length;
        int len2 = b.length;
        int c[] = new int[len+len2];
        int i = 0;
        int j = 0;

        while(i < len && j < len2){
            if(a[i] < b[j]){
                c[i] = a[i];
                i++;
            }else{
                c[j] = b[j];
                j++;
            }
        }
        while(i < len){
            c[i] = a[i];
            i++;
        }
        while(j < len2){
            c[j] = b[j];
            j++;
        }
    }


}