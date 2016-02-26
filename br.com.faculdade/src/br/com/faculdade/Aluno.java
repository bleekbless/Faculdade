package br.com.faculdade;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int matricula;
	
	@NotNull(message="Nome não pode ficar em branco.")
	private String nome;
	
	@NotNull(message="CPF não pode ficar em branco.")
	private String cpf;
	
	@NotNull(message="Email não pode ficar em branco.")
	private String email;
	
	@ManyToMany
	@JoinTable(name="Aluno_Turma", joinColumns={@JoinColumn(name="matricula")},
									inverseJoinColumns={@JoinColumn(name="idTurma")})
	private List<Turma> turmas;
	
	@OneToMany(mappedBy="aluno")
	private List<Boleto> boletos;
	
	public List<Boleto> getBoletos() {
		return boletos;
	}

	public void setBoletos(List<Boleto> boletos) {
		this.boletos = boletos;
	}

	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
