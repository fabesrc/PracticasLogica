package pl;

import javax.swing.JOptionPane;

public class Eje03 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
		
		if (num % 2 == 0) {
			JOptionPane.showMessageDialog(null, "El num "+num+ " es Par");
		}else {
			JOptionPane.showMessageDialog(null, "El num "+num+ " es Impar");
		}
		
	}

}
