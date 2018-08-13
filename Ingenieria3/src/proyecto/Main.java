package proyecto;


import java.util.Scanner; 



public class Main { 


 
	public static void main(String[] args) { 


 
	        Scanner LEER = new Scanner(System.in); 


 
	        int A,B,C; 


 
 


 
	        System.out.print("INGRESE EL NUMERO 01 : "); 


 
	        A = LEER.nextInt(); 


 
	        System.out.print("INGRESE EL NUMERO 02 : "); 


 
	        B = LEER.nextInt(); 


 
	        System.out.print("INGRESE EL NUMERO 03 : "); 


 
	        C = LEER.nextInt(); 


 
 


 
	        System.out.println("\nLOS NUMEROS DE MAYOR A MENOR SON: "); 


 
	         


 
	        if(A >= B && A >= C) 


 
	        { 


 
	            if(B >= C) 


 
	            { 


 
	                System.out.println("\n" + A + "\n" + B + "\n" + C); 


 
	            } 


 
	            else 


 
	            { 


 
	                System.out.println("\n" + A + "\n" + C + "\n" + B); 


 
	            } 


 
	        } 


 
	        else if(B >= A && B >= C) 


 
	        { 


 
	            if(C >= A) 


 
	            { 


 
	                System.out.println("\n" + B + "\n" + C + "\n" + A); 


 
	            } 


 
	            else 


 
	            { 


 
	                System.out.println("\n" + B + "\n" + A + "\n" + C); 


 
	            } 


 
	        } 


 
	        else if(C >= A && C >= B) 


 
	        { 


 
	            if(A >= B) 


 
	            { 


 
	                System.out.println("\n" + C + "\n" + A + "\n" + B); 


 
	            } 


 
	            else 


 
	            { 


 
	                System.out.println("\n" + C + "\n" + B + "\n" + A); 


 
	            } 


 
	        }         


 
	    } 


 
 


 
	

 
 


 
} 