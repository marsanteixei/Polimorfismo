package entidades;

public class Terceirizado extends Funcionario {
	private Double adicionalDespesa;

	public Terceirizado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Terceirizado(String nome, Integer horas, Double valorpHora, Double adicionalDespesa) {
		super(nome, horas, valorpHora);
		this.adicionalDespesa = adicionalDespesa;
	}

	public Double getAdicionalDespesa() {
		return adicionalDespesa;
	}

	@Override
	public Double pagamento() {
		return super.pagamento() + (1.10 * adicionalDespesa);
	}

}
