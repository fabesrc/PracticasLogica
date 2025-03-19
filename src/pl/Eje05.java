package pl;

import javax.swing.JOptionPane;

public class Eje05 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el num que desea que se multiplique: "));
		
		StringBuilder sb = new StringBuilder ();
		
	
		for(int i=1; i<=10; i++) {
			int result = i*num;
			sb.append(num).append(" X ").append(i).append(" = ").append(result+"\n");
			
		}
		
		JOptionPane.showMessageDialog(null, sb);
	}

}
