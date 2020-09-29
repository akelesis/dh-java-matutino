package br.com.dh.lojaonline.model.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Telefone {
	@Id
	private Integer id_telefone;
	
	private String ddd;
	
	private String numero;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_cliente")
	@JsonIgnoreProperties("telefones")
	private Cliente cliente;

	public Integer getId_telefone() {
		return id_telefone;
	}

	public void setId_telefone(Integer id_telefone) {
		this.id_telefone = id_telefone;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
