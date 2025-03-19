package pl;

import javax.swing.JOptionPane;

public class Eje10 {

	public static void main(String[] args) {
		int num= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero: "));
		String numero= String.valueOf(num);
		StringBuilder sb = new StringBuilder();
		for (int i = numero.length()-1; i >= 0; i--) {
			sb.append(numero.charAt(i));
			
		}
		JOptionPane.showMessageDialog(null,"su numero invertido es : "+ sb);
		
		
	}

}
