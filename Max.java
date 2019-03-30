import java.util.*; import java.util.List; import java.util.ArrayList; public class SetAB  
{ 
public static void main(String[] args)
     {
       Integer[] a={1,2,3,4};
      Integer[] b={1,2,3,4}; 
      Arrays.sort(a); Arrays.sort(b,Collections.reverseOrder()); int sum=0; 
	for(int i=0;i<a.length;i++)
	{ 
                    sum+=a[i]*b[i];
	}
       System.out.println(sum);
      }
} 

