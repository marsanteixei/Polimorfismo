package entidades;

public class Funcionario {
	private String nome;
	private Integer horas;
	private Double valorpHora;

	public Funcionario() {

	}

	public Funcionario(String nome, Integer horas, Double valorpHora) {
		this.nome = nome;
		this.horas = horas;
		this.valorpHora = valorpHora;
	}

	public String getNome() {
		return nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public Double getValorpHora() {
		return valorpHora;
	}

	public Double pagamento() {
		return valorpHora * horas;
	}

}
