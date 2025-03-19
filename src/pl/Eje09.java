package pl;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Eje09 {

	public static void main(String[] args) {
	ArrayList <Integer> numeros = new ArrayList <>();
	JOptionPane.showMessageDialog(null, "Ingrese sus numeros para determinar los pares e  impares:");
	Boolean q=true;
	int count = 1;
	while(q) {
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su numero "+count+ " : "));
		int option = JOptionPane.showConfirmDialog(null, "¿Desea agregar otro numero? S/N ");
		switch (option) {
		case JOptionPane.YES_OPTION:
			break;
		case JOptionPane.NO_OPTION:
			q=false;
			break;
		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showMessageDialog(null, "Adios :)");
			q=false;
			break;
		}
		count++;
		numeros.add(num);
	}
	
	StringBuilder sb = new StringBuilder();
	for(int numero: numeros) {
		if (numero%2==0) {
			sb.append("El numero ").append(numero).append(" es Par\n");
		} else {
			sb.append("El numero ").append(numero).append(" es Impar\n");
		
		}
	}
	JOptionPane.showMessageDialog(null, sb);
	
		
	}
	

	}

