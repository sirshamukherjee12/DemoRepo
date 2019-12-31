import java.lang.*; 
import java.io.*; 
import java.util.*; 
  
// Class of ReverseString 
class ReverseString 
{ 
    public static void main(String[] args) 
    { 
        String input = "GeeksforGeeks"; 
  
        byte [] strAsByteArray = input.getBytes(); //63
  
        byte [] result =  
                   new byte [strAsByteArray.length]; 
  
        // Store result in reverse order into the 
        // result byte[] 
        for (int i = 0; i<strAsByteArray.length; i++) 
            result[i] =  
             strAsByteArray[strAsByteArray.length-i-1]; 
  
        System.out.println(new String(result)); 
    } 
} 
