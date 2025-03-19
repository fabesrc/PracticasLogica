package pl;

import javax.swing.JOptionPane;

public class Eje06 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el limite de la suma: "));
		
		int count= 0;
		for (int i=0; i<=num; i++) {
			count += i;
		}
		
		JOptionPane.showMessageDialog(null, count);
	}

}
