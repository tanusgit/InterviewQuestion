package Teacher;

public class Mergesort {
    public static void main(String[] args) {
        //merge two sorted array
        int[] a = {1, 2, 9, 10};
        int[] b = {7, 8};
        int r[] = mergeMe(a,b);
        for (int res: r) {
            System.out.print(res + ", ");
        }
    }

    private static int[] mergeMe(int[] a, int[] b) {
        int len = (a.length) + (b.length);
        System.out.println(len);
        int arr[]= new int[len];
        int counta = 0;
        int countb = 0;
        int i = 0; int j = 0;

        while(a[i] < b[j]){
            arr[i] = a[i];
            i++;
            counta = i;
        }
        while(b[j] < a[i]){
            arr[i] = b[j];
            j++;
            i++;
            if(j == b.length){
                break;
            }
            countb = j;
        }
        System.out.println(counta);
        while(counta < a.length){
            arr[i] = a[counta];
            i++;
            if(i == arr.length){
                break;
            }
        }
        return arr;
    }
}
