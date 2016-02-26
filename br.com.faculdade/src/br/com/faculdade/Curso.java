package br.com.faculdade;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Curso {
	
	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Short idAluno;
	
	@NotNull(message="Nome não pode ficar vazio.")
	private String nome;
	
	@OneToMany(mappedBy="curso")
	private List<Turma> turmas;

	public Short getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Short idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
