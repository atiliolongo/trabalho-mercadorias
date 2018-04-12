package modelo;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	private Float valor1;
	private Float valor2;
	private Float resultado;
	String nomeproduto;
	public String getNomeproduto() {
		return nomeproduto;
	}

	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}
	private List<String> resultados = new ArrayList<String>();

	public Float getValor1() {
		return valor1;
	}

	public void setValor1(Float valor1) {
		this.valor1 = valor1;
	}

	public Float getValor2() {
		return valor2;
	}

	public void setValor2(Float valor2) {
		this.valor2 = valor2;
	}

	public Float getResultado() {
		return resultado;
	}

	public void setResultado(Float resultado) {
		this.resultado = resultado;
	}

	public List<String> getResultados() {
		return resultados;
	}

	public void setResultados(List<String> resultados) {
		this.resultados = resultados;
	}
	
	public void somar(){
		resultado=valor1*valor2;
		resultados.add("\n Nome do Produto: "+nomeproduto+"\n Valor do Produto:"+valor1+"\n Quantidade do Produto: "+valor2+"\n Valor Total do Estoque: R$ "+resultado+"\n");
	}
	
	
}