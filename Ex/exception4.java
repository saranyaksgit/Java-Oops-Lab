public class exception4
{    
public static void main(String args[])
{   
      	try 
	{    
         	int data=25/0;    
       		System.out.println(data);    
      	}   
         
      	catch(ArrayIndexOutOfBoundsException e)
	{  
        	System.out.println("Exception handled");  
        	System.out.println(e);  
      	}   
         
      	finally 
	{  
        	System.out.println("finally block is always executed");  
      	}    
     
	System.out.println("helooooooooooo");    
      
}   

}
