package Programs;

import java.util.*;  

//Creating PalindromeNumber class  
public class PalindromeNumber{    
  //Creating checkPalindrome() method to check number  
  public static void checkPalindrome(int number){    
      int rem, sum=0, temp;      
      //Storing value of number into temp variable  
      temp=number;      
        
      //Reversing number  
      while(number>0){      
          rem = number%10;  //getting remainder    
          sum = (sum*10)+rem;      
          number = number/10;      
      }   

      //Checking whether the reversing number is equal to the number or not  
      if(temp==sum)      
          System.out.println(temp+" is a palindrome number");      
      else      
          System.out.println(temp+ "is not a palindrome");          
  }     

  //main() method starts  
  public static void main(String[] args) {   
    
      //Getting number from the user  
      Scanner sc = new Scanner(System.in);   
      int number = sc.nextInt();  
    
      //Calling checkPalindrome() method to check whether the given number is palindrome or not  
      checkPalindrome(number);  
  }  
}  
