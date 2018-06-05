package com.basic;
public class max {
	
	  public static int getMaxValue(int[] numbers)
	    {
	      int maxValue = numbers[0];
	      for(int i=1;i < numbers.length;i++){
	        if(numbers[i] > maxValue){
	    	  maxValue = numbers[i];
	    	  
	    	}
	      }
	      return maxValue;
	    }
	    public static int getMinValue(int[] numbers){
	      int minValue = numbers[0];
	      for(int i=1;i<numbers.length;i++){
	        if(numbers[i] < minValue){
	    	  minValue = numbers[i];
	    	 
	    	}
	    	}
	      
	      return minValue;
	    }
	      public static void main(String args[]){
 	  	    int array[] = new int[] {67,54,98,43,32,23,40};
	  	    int max = getMaxValue(array);
	  	    System.out.println("Maximum Value is: "+max);
	  	    int min = getMinValue(array);
	  	    System.out.println("Minimum Value is: "+min);
	      }
		
			
		}
	    
		
			
	
	    
	
	


