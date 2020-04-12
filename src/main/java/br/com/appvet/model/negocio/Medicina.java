package br.com.appvet.model.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TMedicina")
@PrimaryKeyJoinColumn(name = "idProduto")
public class Medicina extends Produto {

	private String tipoServico;
	private String descricao;

	public Medicina() {
	}
	
	public Medicina(String tipoServico, String descricao) {
		this();
		this.tipoServico = tipoServico;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s",
				this.getTipoServico(),
				this.getDescricao()
			);
	}
	
	public String getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}