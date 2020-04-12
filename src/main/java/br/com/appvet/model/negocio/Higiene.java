package br.com.appvet.model.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "THigiene")
@PrimaryKeyJoinColumn(name = "idProduto")
public class Higiene extends Produto {

	private String item;
	private String descricao;

	public Higiene() {
	}
	
	public Higiene(String item, String descricao) {
		this();
		this.item = item;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s",
				this.getItem(),
				this.getDescricao()
			);
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
}