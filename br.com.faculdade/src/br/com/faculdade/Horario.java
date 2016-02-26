package br.com.faculdade;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Horario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idHorario;
	
	@NotNull(message="Horario não pode ficar em branco.")
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp horarioAula;
	
	@NotNull(message="O dia da semana não pode ficar em branco.")
	private String diaSemana;
	
	@ManyToMany(mappedBy="horarios")
	private List<Turma> turmas;
	
	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	public int getIdHorario() {
		return idHorario;
	}
	
	public void setIdHorario(int idHorario) {
		this.idHorario = idHorario;
	}
	
	public Timestamp getHorarioAula() {
		return horarioAula;
	}
	
	public void setHorarioAula(Timestamp horarioAula) {
		this.horarioAula = horarioAula;
	}
	
	public String getDiaSemana() {
		return diaSemana;
	}
	
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	
}
