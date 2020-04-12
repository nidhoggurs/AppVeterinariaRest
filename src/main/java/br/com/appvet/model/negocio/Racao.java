package br.com.appvet.model.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TRacao")
@PrimaryKeyJoinColumn(name = "idProduto")
public class Racao extends Produto {

	private String fabricante;
	private String descricao;
	private String raca;
	
	public Racao() {
	}
	
	public Racao(String fabricante, String descricao, String raca) {
		this();
		this.fabricante = fabricante;
		this.descricao = descricao;
		this.raca = raca;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s - %s", 
				this.getFabricante(),
				this.getDescricao(),
				this.getRaca()
			);
	}

	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
}