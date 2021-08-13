package com.ltts;

public class array {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++ )
		{
			arr[i]=i;
		}
        for(int x : arr)
        {
        	if(x==5)
        	{
        		continue;
        	}
            System.out.println(x);
        }

	}

}
