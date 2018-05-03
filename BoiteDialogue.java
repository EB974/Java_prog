import javax.swing.JOptionPane;

public class BoiteDialogue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombre1 = Integer.parseInt(JOptionPane.showInputDialog("Entrez un premier nombre :"));
		int nombre2 = Integer.parseInt(JOptionPane.showInputDialog("Entrez un second nombre :"));
		
		String message = String.format("La somme de %s et %s = %s", nombre1,nombre2,nombre1+nombre2);
		JOptionPane.showMessageDialog(null, message);
	}

}
