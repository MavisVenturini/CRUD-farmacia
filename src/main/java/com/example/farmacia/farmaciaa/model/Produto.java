package com.example.farmacia.farmaciaa.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="Produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min=5,max=100,message="O campo deve ter no minimo 5 letr as e no maximo 100")
	private String titulo;
	
	@NotNull
	@Size(min=10,max=500)
	private String texto;
	
	@UpdateTimestamp
	private Date date;
	
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	private String laboratorio;

	private String nacionalidade;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setTitulo(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
}
