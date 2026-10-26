class Solution {
    public boolean isPalindrome(int x) {
        int ans=0;
        int pal=x;
        if(x<0){
            return false;
        }
        
    while(x!=0){
       
       int digits=x%10;
       ans=(ans*10)+digits;
       x=x/10;
    }
    if(pal==ans){
        return true;
    }
    else{
        return false;
    }
    }
}
