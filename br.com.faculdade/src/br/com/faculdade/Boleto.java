package br.com.faculdade;

import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.*;



@Entity
public class Boleto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigoBoleto;
	
	@NotNull(message="Valor não pode ficar vazio.")
	private Double valor;
	
	@NotNull(message="A data do vencimento não pode ficar vazia.")
	private Date dataVecimento;
	
	@Null
	private Double valorPago;
	
	@Null
	@Temporal(TemporalType.DATE)
	private Date dataPagamento;
	
	@ManyToOne
	@JoinColumn(name="idAluno")
	private Aluno aluno;
	
	public int getCodigoBoleto() {
		return codigoBoleto;
	}
	public void setCodigoBoleto(int codigoBoleto) {
		this.codigoBoleto = codigoBoleto;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Date getDataVecimento() {
		return dataVecimento;
	}
	public void setDataVecimento(Date dataVecimento) {
		this.dataVecimento = dataVecimento;
	}
	public Double getValorPago() {
		return valorPago;
	}
	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

}
