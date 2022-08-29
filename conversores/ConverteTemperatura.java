package conversores;
import javax.swing.JOptionPane;

public class ConverteTemperatura {
	public void CelciusParaFahr (double valor) {
		double celsius = (valor * 1.8) + 32;
		celsius = (double) Math.round(celsius);
		JOptionPane.showMessageDialog(null, valor + " Celcius(C°) equivale a: " + celsius + " Fahrenheit(F°)");
	}
	
	public void CelciusParaKelvin (double valor) {
		double celsius = valor + 273.15;
		celsius = (double) Math.round(celsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " Celcius(C°) equivale a: " + celsius + " Kelvin(K°)");
	}
	
	public void FahrParaCelcius (double valor) {
		double fahr = (valor / 1.8) + 32;
		fahr = (double) Math.round(fahr * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " Fahrenheit(F°) equivale a: " + fahr + " Celsius(C°)");
	}
	
	public void KelvinParaCelcius (double valor) {
		double kelvin = valor - 273.15;
		kelvin = (double) Math.round(kelvin);
		JOptionPane.showMessageDialog(null, valor + " Fahrenheit(F°) equivale a: " + kelvin + " Celsius(C°)");
	}
	
	public void FahrParaKelvin (double valor) {
		double fahr = (valor - 32) * 1.8 + 273.15;
		fahr = (double) Math.round(fahr * 100d) / 100d;
		JOptionPane.showMessageDialog(null, valor + " Fahrenheit(F°) equivale a: " + fahr + " Kelvin(K°)");
	}
	
	public void KelvinParaFahr(double valor) {
		double kelvin = (valor - 273.15) * 1.8 + 32;
		kelvin = (double) Math.round(kelvin);
		JOptionPane.showMessageDialog(null, valor + " Kelvin(K°) equivale a: " + kelvin + " Fahrenheit(F°)");
	}
}
