package conversores;
import javax.swing.JOptionPane;

public class IniciarConversorDeMoedas {
	public void iniciar(String escolheMoedas, String tipoDeMoeda[]) {
		ConverteMoedas cm = new ConverteMoedas();
		String input = null;
		double valor;

		do {
			if(escolheMoedas == tipoDeMoeda[0]) {
				input = JOptionPane.showInputDialog("Digite o valor em Reais(R$)");
				if(input.matches("^[0-9]+$")) {
					valor = Double.parseDouble(input);
					cm.ReaisParaDolares(valor);
				} else {
					JOptionPane.showMessageDialog(null, "Digite apenas números com ponto(.)");
				}
			} else if (escolheMoedas == tipoDeMoeda[1]) {
				input = JOptionPane.showInputDialog("Digite o valor em Reais(R$)");
				if(input.matches("^[0-9]+$")) {
					valor = Double.parseDouble(input);
					cm.ReaisParaEuros(valor);
				} else {
					JOptionPane.showMessageDialog(null, "Digite apenas números com ponto(.)");
				}
			} else if (escolheMoedas == tipoDeMoeda[2]) {
				input = JOptionPane.showInputDialog("Digite o valor em Reais(R$)");
				if(input.matches("^[0-9]+$")) {
					valor = Double.parseDouble(input);
					cm.ReaisParaLibras(valor);
				} else {
					JOptionPane.showMessageDialog(null, "Digite apenas números com ponto(.)");
				}
			} else if (escolheMoedas == tipoDeMoeda[3]) {
				input = JOptionPane.showInputDialog("Digite o valor em Reais(R$)");
				if(input.matches("(?:\\.|[0-9])*")) {
					valor = Double.parseDouble(input);
					cm.ReaisParaPesoA(valor);
				} else {
					JOptionPane.showMessageDialog(null, "Digite apenas números com ponto(.)");
				}
			} else if (escolheMoedas == tipoDeMoeda[4]) {
				input = JOptionPane.showInputDialog("Digite o valor em Reais(R$)");
				if(input.matches("(?:\\.|[0-9])*")) {
					valor = Double.parseDouble(input);
					cm.ReaisParaPesoC(valor);
				} else {
					JOptionPane.showMessageDialog(null, "Digite apenas números com ponto(.)");
				}
			} else if (escolheMoedas == tipoDeMoeda[5]) {
				input = JOptionPane.showInputDialog("Digite o valor em Dólares(US$)");
				if(input.matches("(?:\\.|[0-9])*")) {
					valor = Double.parseDouble(input);
					cm.DolaresParaReais(valor);
				} else {
					JOptionPane.showMessageDialog(null, "Digite apenas números com ponto(.)");
				}
			} else if (escolheMoedas == tipoDeMoeda[6]) {
				input = JOptionPane.showInputDialog("Digite o valor em Euros(€)");
				if(input.matches("(?:\\.|[0-9])*")) {
					valor = Double.parseDouble(input);
					cm.EurosParaReais(valor);
				} else {
					JOptionPane.showMessageDialog(null, "Digite apenas números com ponto(.)");
				}
			} else if (escolheMoedas == tipoDeMoeda[7]) {
				input = JOptionPane.showInputDialog("Digite o valor em Libras Esterlinas(£)");
				if(input.matches("(?:\\.|[0-9])*")) {
					valor = Double.parseDouble(input);
					cm.LibrasParaReais(valor);
				} else {
					JOptionPane.showMessageDialog(null, "Digite apenas números com ponto(.)");
				}
			} else if (escolheMoedas == tipoDeMoeda[8]) {
				input = JOptionPane.showInputDialog("Digite o valor em Peso Argentino($)");
				if(input.matches("(?:\\.|[0-9])*")) {
					valor = Double.parseDouble(input);
					cm.PesoAParaReais(valor);
				} else {
					JOptionPane.showMessageDialog(null, "Digite apenas números com ponto(.)");
				}
			} else if (escolheMoedas == tipoDeMoeda[9]) {
				input = JOptionPane.showInputDialog("Digite o valor em Peso Chileno($)");
				if(input.matches("(?:\\.|[0-9])*")) {
					valor = Double.parseDouble(input);
					cm.PesoCParaReais(valor);
				} else {
					JOptionPane.showMessageDialog(null, "Digite apenas números com ponto(.)");
				}
			}
		} while(!input.matches("(?:\\.|,|[0-9])*"));
	}
}