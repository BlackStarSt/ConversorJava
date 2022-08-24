package ConversorDeMoedas;

import javax.swing.JOptionPane;

public class ConverteMoedas {
	public void ReaisParaDolares (double valor) {
		double dolar = valor / 5.12;
		dolar = (double) Math.round(dolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " reais(R$) equivale a: " + dolar + " doláres(US$)");
	}
	
	public void ReaisParaEuros (double valor) {
		double euros = valor / 5.09;
		euros = (double) Math.round(euros * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " reais(R$) equivale a: " + euros + " euros(€)");
	}
	
	public void DolaresParaReais (double valor) {
		double dolar = valor * 5.12;
		dolar = (double) Math.round(dolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " dólares(US$) equivale a: " + dolar + " reais(R$)");
	}
	
	public void EurosParaReais (double valor) {
		double euros = valor * 5.09;
		euros = (double) Math.round(euros * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " euros(€) equivale a: " + euros + " reais(R$)");
	}
}
