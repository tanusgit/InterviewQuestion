//add strings
class Solution {
    public String addStrings(String nums1, String nums2) {
        int p1 = nums1.length()-1;
        int p2 = nums2.length()-1;
        int carry =0;
        StringBuilder sb = new StringBuilder();
        while(p1 >=0 || p2 >= 0){
            int a = p1>= 0? nums1.charAt(p1)-'0' : 0;
            int b = p2>= 0? nums2.charAt(p2)-'0' : 0;
            int sum = (a+b+ carry)%10; 
            carry = (a+b+carry)/10; 
            sb.append(sum);
            p1--;
            p2--;
            }
        if(carry > 0){
            sb.append(carry);
        }
        return sb.reverse().toString();
        
    }
}
