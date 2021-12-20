package InterviewString;

public class UniqueCharacters {
    public static void main(String[] args) {
        //all characters have to be letters as it ignores to see the difference between
        //two digits for 455 it returns true as it thinks that it is 45 and 5
        //for 5656 it returns false as it thinks that 56 56
        System.out.println("Hello world");
        String one = "abbcd";
        String two = "abcd;";
        String three = "aabbcc";
        String b = "abbb";
        String c = "cdbbavnd";
        String d = "sl5656";

        Boolean a = isUnique(d);
        System.out.println(a);
    }
    public static Boolean isUnique(String s){
        boolean res = true;
        for( int i = 0; i < s.length()-2; i++){
            for(int j = i+1; j < s.length()-1; j++){
                if(s.charAt(i) == s.charAt(j)){
                    res = false;
                }
            }
        }
        return res;
    }
}
