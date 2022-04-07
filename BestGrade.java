package Practice;

import java.util.HashMap;
import java.util.Map;

public class BestGrade {
    public static void main(String[] args) {
        String a[] = {"Tanu: 5000", "Man: 5000", "Man: 101", "Tanu: 100", "Rubi: 60"};
        String res = bestgrade(a);
        System.out.println(res);


    }
    public static String bestgrade(String a[]){
        String best = "";
        HashMap<String, Pair2> map = new HashMap<>();
        HashMap<String, Double> map2 = new HashMap<>();
        for(int i =0; i < a.length; i++){
            String name = getName(a[i]);
            double grade = getGrade(a[i]);
            Pair2 p = new Pair2(1, grade);
            if(!map.containsKey(name)){
                map.put(name, p);
            }else{
                map.put(name, new Pair2(map.get(name).name+1, map.get(name).grade+grade));
            }
        }
        double max = Double.MIN_VALUE;
        Pair3 p2 = new Pair3("", 0.0);
        for(Map.Entry<String, Pair2> m: map.entrySet() ){
            String name = m.getKey();
            Pair2 p =  m.getValue();
            double avg = p.grade / p.name;
            System.out.println("best name = " +  name);
            System.out.println("best avg = " +  avg);
            if(max < avg){
                max = avg;
                 p2 = new Pair3(name, max);
            }
        }

        return p2.name;
    }

    public static String getName(String a){
        String b[] = a.split(":");
        return b[0];
    }

    public static int getGrade(String a){
        String b[] = a.split(":");
        int res = 0;
        for(int i =0; i < b.length; i++){
            char c[] = b[i].toCharArray();
            for(int j = 0; j < c.length; j++){
                if(Character.isDigit(c[j])){
                    res = (res * 10)+ (c[j]-'0');
                }
            }

        }
        return res;
    }
}

class Pair2{
    int name;
    double grade;
    public Pair2(int a, double b){
        name = a;
        grade = b;
    }

}
class Pair3{
    String name;
    double grade;
    public Pair3(String a, double b){
        name = a;
        grade = b;
    }

}