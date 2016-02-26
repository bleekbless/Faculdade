package br.com.faculdade;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Turma {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Short idTurma;
	
	@NotNull(message="O nome não pode ficar em branco.")
	private String nome;
	
	@ManyToMany(mappedBy="turmas")
	private List<Aluno> alunos;
	
	@ManyToOne
	@JoinColumn(name="idCurso")
	private Curso curso;
	
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@ManyToMany
	@JoinTable(name="Turma_Horario", joinColumns={@JoinColumn(name="idTurma")},
									inverseJoinColumns={@JoinColumn(name="idHorario")})
	private List<Horario> horarios;

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Horario> getHorarios() {
		return horarios;
	}

	public void setHorarios(List<Horario> horarios) {
		this.horarios = horarios;
	}

	public Short getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(Short idTurma) {
		this.idTurma = idTurma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
