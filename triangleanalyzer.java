package firstpackage;

public class triangleanalyzer {
                   public static void main(String args[])
                   { 
                	   int a=1,b=3,c=3;
                	   if((a+b>c)&&(b+c>a)||(a+c>b))
                	   {
                		 if((a==b)&&(b==c))
                		 {
                			System.out.println("This is equilateral"); 
                		 } 
                		 else if((a==b)||(b==c)||(c==a))
                		 {
                			 System.out.println("This is isosceles");
                		 }
                		 else
                		 {
                			 System.out.println("This is scalene"); 
                		 }
                	   }
                	   else 
                	   {
                		   System.out.println("It's not a triangle");
                	   }
                   }
}
