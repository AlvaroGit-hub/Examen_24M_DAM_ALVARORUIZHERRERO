package examen_24m_primo;

import java.util.Scanner;

public class Examen_24M_PRIMO {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num,count=0;
		
		System.out.println("Buenos días Ceinmark, soy Álvaro Ruiz");
		System.out.println("Introduce un número para averiguar si es primo o no: ");
		num=sc.nextInt();
		
		for(int i=1; i<=num;i++) {
			
			if(num%i==0) {
				System.out.println("se puede dividir por " + i);
				count++;
			}
			else {
				System.out.println("no se puede dividir por "+i);
			}
		}
		if(count==2) {
			System.out.println("el numero "+num+" es primo");
		}
		else {
			System.out.println("el numero "+num+" no es primo");
		}
		
		
	}

}
