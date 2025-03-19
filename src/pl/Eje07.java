package pl;

import javax.swing.JOptionPane;

public class Eje07 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
		
		int result=1;
		
		for(int i=1; i<=num; i++) {
			result *=i;
		}
		JOptionPane.showMessageDialog(null, result);

	}

}
