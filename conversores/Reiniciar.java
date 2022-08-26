package conversores;
import javax.swing.JOptionPane;

public class Reiniciar {
	public void recomecar() {		
		int pergunta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");		
		if(pergunta == JOptionPane.YES_OPTION) {
			Iniciar i = new Iniciar();
			i.iniciar();
		} else if(pergunta == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		} else if(pergunta == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Programa concluído");
		}
	}
}