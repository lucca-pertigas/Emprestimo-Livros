package entidades;

public class ContaUsuario {
	private int idUsuario;
	private String nome;
	private int numeroLivrosEmprestados;
	
	public ContaUsuario(int idUsuario, String nome, int numeroLivrosEmprestados) {
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.numeroLivrosEmprestados = numeroLivrosEmprestados;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroLivrosEmprestados() {
		return numeroLivrosEmprestados;
	}

	public void setNumeroLivrosEmprestados(int numeroLivrosEmprestados) {
		this.numeroLivrosEmprestados = numeroLivrosEmprestados;
	}

	public String toString() {
		return "ContaUsuario [idUsuario=" + idUsuario + ", nome=" + nome + ", numeroLivrosEmprestados="
				+ numeroLivrosEmprestados + "]";
	}
	
	public int emprestarLivro(int qntLivros) {
		return numeroLivrosEmprestados += qntLivros;
	}
	
	public int devolverLivro(int qntLivros) {
		return numeroLivrosEmprestados -= qntLivros;
	}
	
	public String exibirLivrosEmprestados() {
		return "ContaUsuario [idUsuario=" + idUsuario + ", nome=" + nome + ", numeroLivrosEmprestados="
				+ numeroLivrosEmprestados + "]";
	}
	
}
