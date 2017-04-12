package alunotop;


public class Aluno {
	private String nome;
	private int matricula;
	private String dt_nasc;
	private String pai;
	private String mae;
	
	public void imprimmir(){
		System.out.print("O(A) Aluno(a) " + nome + " de Matricula " + matricula + ", Nascido(a) em " + dt_nasc + ". Filho(a) de "
				+ pai + " e " + mae + " FOI MATRICULADO(A) COM SUCESSO!!!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getDt_nasc() {
		return dt_nasc;
	}

	public void setDt_nasc(String dt_nasc) {
		this.dt_nasc = dt_nasc;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

}
