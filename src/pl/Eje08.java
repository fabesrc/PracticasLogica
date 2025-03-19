package pl;

import javax.swing.JOptionPane;

public class Eje08 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero limitador: "));
		
		System.out.print("La serie fibonacci hasta el "+ num+ " digito es: 0");
		
		int a = 0;
		int b = 1;
		for (int i=0; i<=num; i++) {
			int c = a+b;
			a=b;
			b=c;
			System.out.print(", "+a);
		}
		

	}

}
