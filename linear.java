import java.util.*;									//time compexity :::::  O(n)

public class linear{

	 int linear_fun(int arr[ ],int n,int x) {
        for (int i = 0; i < n; i++)
        {
       
            if (arr[i] == x)
                return i;
        }
  
     
        return  -1;
    }
	       
	       
	       
 	public void input( int arr[],int n,int s_num){
 	
	} 	       
	
	public static void main(String[] args)
	{
	 
	 
		 Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter the size of array");
	   int  num = sc .nextInt();
	   
	   int  array[] = new int[num];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter the values in array: " + (i+1) + " : ");
		        array[i] = sc.nextInt();
		        }
		         
		        for (int j =0; j< array.length; j++){
		        System.out.println("Values are :"+array[j]);
		        }
		        
		        System.out.println("Enter the value to be search in array");
		        int  s_num = sc .nextInt();
		        
		          linear li = new linear();
			int result = li.linear_fun(array , num , s_num);
		        
		        	
		       	System.out.println("Thee values in array is at : " + (result+1) + " :position");
		        
		        
   }
}
