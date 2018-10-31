package Fatorial;

public class Fatorial{
   public int fat (int n){
       if(n>=0) {
    	   int f=1;
	       for (int i=1; i<=n; i++) f = f * i;
	       return f;
       }
       return -1;
   }
}
