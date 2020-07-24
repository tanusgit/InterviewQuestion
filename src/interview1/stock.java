
package interview1;
public class stock {
  public static void main(String args[]) {
      int array[] = {100, 180, 300, 400, 20, 100, 500};
      int min;
      int max;
      int j =1;
      for(int i = 0; i < array.length-1; i++){
            if(array[i] < array[j + i]){
                j++;
                System.out.print(j);
            }
      }

  }
}
