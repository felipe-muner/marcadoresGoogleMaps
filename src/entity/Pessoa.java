package entity;

public class Pessoa {

	private Integer id;
	private String nome;
	private String endereco;
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	public Pessoa(Integer id, String nome, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", endereco=" + endereco
				+ "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
