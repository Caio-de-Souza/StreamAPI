package com.lima.souza.caio.streams.filter;

public class Media {

	private double total;
	private int quantidade;
	
	public Media adicionar(double valor) {
		this.total += valor;
		this.quantidade++;
		return this;
	}
	
	public double getValor() {
		return this.total / this.quantidade;
	}
	
	public static Media combinar(Media m1, Media m2){
		Media m3 = new Media();
		m3.total = m1.total + m2.total;
		m3.quantidade = m1.quantidade + m2.quantidade;
		return m3;
	}
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
