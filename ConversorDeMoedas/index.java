package ConversorDeMoedas;
import javax.swing.JOptionPane;

public class index {
	public static void main(String[] args) { 
		ConverteMoedas converter = new ConverteMoedas();

		String[] tipoDeConversor = {"Conversor de Moedas", "Conversor de Temperatura"};
		String pergunta = (String)JOptionPane.showInputDialog(null, "Escolha um tipo de conversor", 
				null, JOptionPane.QUESTION_MESSAGE, null, tipoDeConversor, tipoDeConversor[0]);
		if(pergunta == tipoDeConversor[0]) {
			String[] tipoDeMoeda = {"Reais em Dólar", "Reais em Euro", "Dólar em Reais", "Euro em Reais"};
			String escolheMoedas = (String)JOptionPane.showInputDialog(null, "Escolha um tipo de conversor", 
					null, JOptionPane.QUESTION_MESSAGE, null, tipoDeMoeda, tipoDeMoeda[0]);
			String input = null;
			double valor;

			do {
				if(escolheMoedas == tipoDeMoeda[0]) {
					input = JOptionPane.showInputDialog("Digite o valor em Reais(R$)");
					if(input.matches("^[0-9]+$")) {
						valor = Double.parseDouble(input);
						converter.ReaisParaDolares(valor);
					}
				} else if (escolheMoedas == tipoDeMoeda[1]) {
					input = JOptionPane.showInputDialog("Digite o valor em Reais(R$)");
					if(input.matches("^[0-9]+$")) {
						valor = Double.parseDouble(input);
						converter.ReaisParaDolares(valor);
					}
				} else if (escolheMoedas == tipoDeMoeda[2]) {
					input = JOptionPane.showInputDialog("Digite o valor em Dólares(US$)");
					if(input.matches("^[0-9]+$")) {
						valor = Double.parseDouble(input);
						converter.ReaisParaDolares(valor);
					}
				}
				else if (escolheMoedas == tipoDeMoeda[3]) {
					input = JOptionPane.showInputDialog("Digite o valor em Euros(US$)");
					if(input.matches("(?:\\.|[0-9])*")) {
						valor = Double.parseDouble(input);
						converter.ReaisParaDolares(valor);
					} else {
						JOptionPane.showMessageDialog(null, "Digite apenas números com ponto(.)");
					}
				}
			} while(!input.matches("(?:\\.|,|[0-9])*"));
		} 
	}
}