package model;

public class Departamento {

	private int andar;
	private String nomeDep;
	private String descDep;
	
	public Departamento() {
		super();
	}

	public Departamento(int andar, String nomeDep, String descDep) {
		this.andar = andar;
		this.nomeDep = nomeDep;
		this.descDep = descDep;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public String getNomeDep() {
		return nomeDep;
	}

	public void setNomeDep(String nomeDep) {
		this.nomeDep = nomeDep;
	}

	public String getDescDep() {
		return descDep;
	}

	public void setDescDep(String descDep) {
		this.descDep = descDep;
	}
	
	@Override
	public String toString() {
		return (nomeDep + " - " + descDep);
	}

}
