package conversores;
import javax.swing.JOptionPane;

public class EscolheConversor {
	public void escolheConversor() {
		Reiniciar r = new Reiniciar();
		do {
			String[] tipoDeConversor = {"Conversor de Moedas", "Conversor de Temperatura"};
			String pergunta = (String)JOptionPane.showInputDialog(null, "Escolha um tipo de conversor", 
					null, JOptionPane.QUESTION_MESSAGE, null, tipoDeConversor, tipoDeConversor[0]);

			if(pergunta == tipoDeConversor[0]) {
				String[] tipoDeMoeda = {
						"Reais em Dólar", 
						"Reais em Euro", 
						"Reais em Libras Esterlinas", 
						"Reais em Peso Argentino", 
						"Reais em Peso Chileno", 
						"Dólar em Reais", 
						"Euro em Reais",
						"Libras Esterlinas em Reais",
						"Peso Argentino em Reais",
						"Peso Chileno em Reais"
					};
				String escolheMoedas = (String)JOptionPane.showInputDialog(null, "Escolha um tipo de conversor", 
						null, JOptionPane.QUESTION_MESSAGE, null, tipoDeMoeda, tipoDeMoeda[0]);

				IniciarConversorDeMoedas i = new IniciarConversorDeMoedas();
				i.iniciar(escolheMoedas, tipoDeMoeda);
			} else if (pergunta == tipoDeConversor[1]) {
				String[] tipoDeTemperatura = {
					"Celsius em Fahrenheit",
					"Celsius em Kelvin",
					"Fahrenheit em Celsius",
					"Fahrenheit para Kelvin",
					"Kelvin em Celsius",
					"Kelvin para Fahrenheit"
				};
				String escolheTemperatura = (String)JOptionPane.showInputDialog(null, "Escolha um tipo de conversor", 
						null, JOptionPane.QUESTION_MESSAGE, null, tipoDeTemperatura, tipoDeTemperatura[0]);

				IniciarConversorDeTemperatura t = new IniciarConversorDeTemperatura();
				t.iniciar(escolheTemperatura, tipoDeTemperatura);
			}
		} while(r.recomecar());
	}
}
