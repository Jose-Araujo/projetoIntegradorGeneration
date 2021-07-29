package com.projetoIntegradorGeneration.projetoIntegradorGeneration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_informacoes_familia")
public class InformacoesFamiliaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	private double rendaFamiliar;
	
	@NotBlank
	private int quantidadeMembrosFamilia;
	
	@NotBlank
	private boolean cadastroProgramasSociais;
	
	@NotBlank
	private boolean pessoasComDeficiencia;
	
	@NotNull
	private String descricaoSituacao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getRendaFamiliar() {
		return rendaFamiliar;
	}

	public void setRendaFamiliar(double rendaFamiliar) {
		this.rendaFamiliar = rendaFamiliar;
	}

	public int getQuantidadeMembrosFamilia() {
		return quantidadeMembrosFamilia;
	}

	public void setQuantidadeMembrosFamilia(int quantidadeMembrosFamilia) {
		this.quantidadeMembrosFamilia = quantidadeMembrosFamilia;
	}

	public boolean isCadastroProgramasSociais() {
		return cadastroProgramasSociais;
	}

	public void setCadastroProgramasSociais(boolean cadastroProgramasSociais) {
		this.cadastroProgramasSociais = cadastroProgramasSociais;
	}

	public boolean isPessoasComDeficiencia() {
		return pessoasComDeficiencia;
	}

	public void setPessoasComDeficiencia(boolean pessoasComDeficiencia) {
		this.pessoasComDeficiencia = pessoasComDeficiencia;
	}

	public String getDescricao() {
		return descricaoSituacao;
	}

	public void setDescricao(String descricao) {
		this.descricaoSituacao = descricao;
	}
	
}