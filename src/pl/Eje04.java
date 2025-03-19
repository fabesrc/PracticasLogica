package pl;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Eje04 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Boolean q= true;
		int cont = 1;
		
		while (q) {
			int num= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su número "+cont+" : "));
			int opcion = JOptionPane.showConfirmDialog(null, " desea continuar? S/N");
			switch (opcion){
			case JOptionPane.YES_OPTION:
				q = true;
				break;
			case JOptionPane.NO_OPTION:
				q = false;
				break;
			case JOptionPane.CANCEL_OPTION:
				JOptionPane.showMessageDialog(null, "Adios :)");
				q = false;
				break;	
			}	
			cont++;
			numeros.add(num);
		}
		int mayor = 0;
		for (int numero : numeros) {
			if (numero > mayor) {
				mayor = numero;
			}
		}
		JOptionPane.showMessageDialog(null, "El numero mayor es: "+mayor);
	}

}
