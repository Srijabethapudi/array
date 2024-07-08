public class Array {
    public static void main(String[] args)
  {
	 //array declaration
	  int[] variableintarray=new int[5];
	  
	  variableintarray[0]=10;
	  variableintarray[1]=20;
	  variableintarray[2]=30;
	  variableintarray[3]=40;
	  variableintarray[4]=50;
	   
	  System.out.println(variableintarray.length);
	  
	  for(int i=0;i<variableintarray.length;i++)
		  System.out.println(variableintarray[i]+" ");
	  System.out.println();
	  //array
	  int arr[]= {1,2,3,4,5};
	  arr[4]=5;
	 //for each loop
	  for(int a:arr)
		  System.out.println(a);
  }
}
