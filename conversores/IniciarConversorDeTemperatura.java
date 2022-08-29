package conversores;
import javax.swing.JOptionPane;

public class IniciarConversorDeTemperatura {
	public void iniciar(String escolheTemperatura, String tipoDeTemperatura[]) {
		ConverteTemperatura ct = new ConverteTemperatura();
		String input = null;
		double valor;
		
		do {
			if(escolheTemperatura == tipoDeTemperatura[0]) {
				input = JOptionPane.showInputDialog(null, "Digite a temperatura em Celsius(C°)");
				if(input.matches("^[0-9]+$")) {
					valor = Double.parseDouble(input);
					ct.CelciusParaFahr(valor);
				}  else {
					JOptionPane.showMessageDialog(null, "Digite apenas números com ponto(.)");
				}
			} else if (escolheTemperatura == tipoDeTemperatura[1]) {
				input = JOptionPane.showInputDialog(null, "Digite a temperatura em Celsius(C°)");
				if(input.matches("^[0-9]+$")) {
					valor = Double.parseDouble(input);
					ct.CelciusParaKelvin(valor);
				}  else {
					JOptionPane.showMessageDialog(null, "Digite apenas números com ponto(.)");
				}
			} else if (escolheTemperatura == tipoDeTemperatura[2]) {
				input = JOptionPane.showInputDialog(null, "Digite a temperatura em Fahrenheit(F°)");
				if(input.matches("^[0-9]+$")) {
					valor = Double.parseDouble(input);
					ct.FahrParaCelcius(valor);
				}  else {
					JOptionPane.showMessageDialog(null, "Digite apenas números com ponto(.)");
				}
			} else if (escolheTemperatura == tipoDeTemperatura[3]) {
				input = JOptionPane.showInputDialog(null, "Digite a temperatura em Kelvin(K°)");
				if(input.matches("^[0-9]+$")) {
					valor = Double.parseDouble(input);
					ct.FahrParaKelvin(valor);
				}  else {
					JOptionPane.showMessageDialog(null, "Digite apenas números com ponto(.)");
				}
			} else if (escolheTemperatura == tipoDeTemperatura[4]) {
				input = JOptionPane.showInputDialog(null, "Digite a temperatura em Fahrenheit(F°)");
				if(input.matches("^[0-9]+$")) {
					valor = Double.parseDouble(input);
					ct.KelvinParaCelcius(valor);
				}  else {
					JOptionPane.showMessageDialog(null, "Digite apenas números com ponto(.)");
				}
			} else if (escolheTemperatura == tipoDeTemperatura[5]) {
				input = JOptionPane.showInputDialog(null, "Digite a temperatura em Kelvin(K°)");
				if(input.matches("^[0-9]+$")) {
					valor = Double.parseDouble(input);
					ct.KelvinParaFahr(valor);
				}  else {
					JOptionPane.showMessageDialog(null, "Digite apenas números com ponto(.)");
				}
			}
		} while(!input.matches("(?:\\.|,|[0-9])*"));
	}
}
