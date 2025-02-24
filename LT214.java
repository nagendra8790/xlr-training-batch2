class Solution {
    public String shortestPalindrome(String s) {
        int n = s.length();
        if(n<=1){
            return s;
        }
        int i=0;
        for(int j = n-1;j>=0;j--){
            if(s.charAt(i)==s.charAt(j)){
                i++;
            }
        }
        if(i==n){
            return s;
        }
        String suffix = s.substring(i);
        String prefix = new StringBuilder(suffix).reverse().toString();
        return prefix+shortestPalindrome(s.substring(0,i))+suffix; 
    }
}