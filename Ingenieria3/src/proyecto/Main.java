package proyecto;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    {
	        Scanner LEER = new Scanner(System.in);
	        int A,B,C,D;

	        System.out.print("INGRESE EL NUMERO 01 : ");
	        A = LEER.nextInt();
	        System.out.print("INGRESE EL NUMERO 02 : ");
	        B = LEER.nextInt();
	        System.out.print("INGRESE EL NUMERO 03 : ");
	        C = LEER.nextInt();
	        System.out.print("INGRESE EL NUMERO 04 : ");
	        D= LEER.nextInt();

	        System.out.println("\nLOS NUMEROS DE MAYOR A MENOR SON: ");
	        
	        if(A >= B && A >= C && A >= D)
	        {
	            if(B >= C && B >= D)
	            	if (C>= D)
	            {
	                System.out.println("\n" + A + "\n" + B + "\n" + C+ "\n" + D);
	            }
	            else
	            {
	                System.out.println("\n" + A + "\n" + B + "\n" + D+ "\n" + C);
	            }
	        }
	        else if(B >= A && B >= C  && B >= D){
	        	 if(A >= C && A >= D)
		            	if (C>= D)
	            {
	                System.out.println("\n" + B + "\n" + A + "\n" + C+ "\n" + D);
	            }
	            else
	            {
	                System.out.println("\n" + B + "\n" + A +"\n" + D+ "\n" + C);
	            }
	        }
	        else if(C >= A && C >= B  && C >= D)
	        {
	        	 if(A >= B && A>= D)
		            	if (B>= D) {
	                System.out.println("\n" + C + "\n" + A + "\n" + B+"\n" + D);
	            }
	            else
	            {
	                System.out.println("\n" + C + "\n" + A + "\n" + D+ "\n" + B);
	            }
	        }   
	        else if(D >= A && D >= B  && D >= C)
	        {
	        	 if(A >= B && A>= C)
		            	if (B>= C) {
	                System.out.println("\n" + D+ "\n" + A + "\n" + B+"\n" + C);
	            }
	            else
	            {
	                System.out.println("\n" + D + "\n" + A + "\n" + C+ "\n" + B);
	            }
	        }
	    }

	}

}  