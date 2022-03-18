import javax.swing.JOptionPane;

public class ResultadoAluno {

	public static void main(String[] args) {
		
		double media = Double.parseDouble(JOptionPane
				.showInputDialog(null, "Média:"))
		
		
		if(media >=6.0) {
			JOptionPane.showMessageDialog(null,
					"aprovado!");
		} else if (media < 6.0) {
			JOptionPane.showMessageDialog(null,
					"Reprovado");
		}
		

	}

}
