package conversores;
import javax.swing.JOptionPane;

public class ConverteMoedas {
	public void ReaisParaDolares (double valor) {
		double dolar = valor / 5.06;
		dolar = (double) Math.round(dolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " reais(R$) equivale a: " + dolar + " doláres(US$)");
	}
	
	public void ReaisParaEuros (double valor) {
		double euros = valor / 5.05;
		euros = (double) Math.round(euros * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " reais(R$) equivale a: " + euros + " euros(€)");
	}
	
	public void ReaisParaLibras (double valor) {
		double libras = valor * 0.17;
		libras = (double) Math.round(libras * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " reais(R$) equivale a: " + libras + " libras esterinas(£)");
	}
	
	public void ReaisParaPesoA(double valor) {
		double pesoA = valor * 27.27;
		pesoA = (double) Math.round(pesoA * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " reais(R$) equivale a: " + pesoA + " pesos argentino($)");
	}
	
	public void ReaisParaPesoC(double valor) {
		double pesoC = valor * 178.35;
		pesoC = (double) Math.round(pesoC * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " reais(R$) equivale a: " + pesoC + " peso chileno($)");
	}
	
	//Moedas em reais(R$)
	public void DolaresParaReais (double valor) {
		double dolar = valor * 5.06;
		dolar = (double) Math.round(dolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " dólares(US$) equivale a: " + dolar + " reais(R$)");
	}
	
	public void EurosParaReais (double valor) {
		double euros = valor * 5.05;
		euros = (double) Math.round(euros * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " euros(€) equivale a: " + euros + " reais(R$)");
	}
	
	public void LibrasParaReais (double valor) {
		double libras = valor * 5.95;
		libras = (double) Math.round(libras * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " libras esterinas(£) equivale a: " + libras + " reais(R$)");
	}
	
	public void PesoAParaReais (double valor) {
		double pesoA = valor / 27.27;
		pesoA = (double) Math.round(pesoA * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " peso argentino($) equivale a: " + pesoA + " reais(R$)");
	}
	
	public void PesoCParaReais (double valor) {
		double pesoC = valor / 178.35;
		pesoC = (double) Math.round(pesoC * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " peso chileno($) equivale a: " + pesoC + " reais(R$)");
	}
}
