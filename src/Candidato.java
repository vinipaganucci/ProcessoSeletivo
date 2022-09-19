
public class Candidato {

	private String nome;
	private double salarioProposto;
	
	public Candidato(String nome, double salarioProposto) {
		this.nome = nome;
		this.salarioProposto = salarioProposto;	
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioProposto() {
		return salarioProposto;
	}
	public void setSalarioProposto(double salarioProposto) {
		this.salarioProposto = salarioProposto;
	}
}