package br.com.appvet.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity
@Table(name = "TProduto")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "tipoProduto")
@JsonSubTypes({
    @JsonSubTypes.Type(value=Higiene.class, name = "Higiene"),
    @JsonSubTypes.Type(value=Racao.class, name = "Racao"),
    @JsonSubTypes.Type(value=Medicina.class, name = "Medicina")
})
public abstract class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	@ManyToOne
	@JoinColumn(name = "idVeterinaria")
	@JsonBackReference
	private Veterinaria veterinaria;
	
	public Produto() {
	}
	public Produto(Integer id, String descricao) {
		this();
		this.id = id;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return String.format("%d - %s", this.getId(), this.getDescricao());
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Veterinaria getVeterinaria() {
		return veterinaria;
	}
	public void setVeterinaria(Veterinaria veterinaria) {
		this.veterinaria = veterinaria;
	}
}