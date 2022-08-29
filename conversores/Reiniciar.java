package conversores;
import javax.swing.JOptionPane;

public class Reiniciar {
	public boolean recomecar() {		
		int pergunta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");		
		if(pergunta == JOptionPane.YES_OPTION) {
			EscolheConversor e = new EscolheConversor();
			e.escolheConversor();
		} else if(pergunta == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		} else if(pergunta == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Programa concluído");
		}
		return false;
	}
}