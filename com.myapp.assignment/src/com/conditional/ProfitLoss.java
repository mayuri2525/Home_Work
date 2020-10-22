package com.conditional;

public class ProfitLoss { 
	
		static int Profit(int costPrice,  
                int sellingPrice) 
{ 
  int profit = (sellingPrice - costPrice); 

  return profit; 
} 

//Function to calculate Loss. 
static int Loss(int costPrice, 
              int sellingPrice) 
{ 
  int Loss = (costPrice - sellingPrice); 

  return Loss; 
} 

//Driver Code. 
public static void main(String[] args)  
{ 
  int costPrice = 600,  
      sellingPrice = 786; 

  if (sellingPrice == costPrice) 
      System.out.println("No profit nor Loss"); 

  else if (sellingPrice > costPrice) 
      System.out.println(Profit(costPrice,  
                                sellingPrice) +  
                                   " Profit "); 

  else
      System.out.println(Loss(costPrice, 
                              sellingPrice) + 
                                   " Loss "); 
} 
} 
