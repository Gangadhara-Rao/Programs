package Programs;

class FactorialExample{    
    //main() method starts   
    public static void main(String args[]){    
        int i,factorial=1;    
  
        int n = 8;  // Number whose factorial we want to calculate  
        //Calculating factorial of number 8  
        for(i=1;i<=n;i++){      
            factorial = factorial*i;      
        }  
        // Showing factorial of the number      
        System.out.println(factorial+" is the factorial of: "+n);      
    }    
}  