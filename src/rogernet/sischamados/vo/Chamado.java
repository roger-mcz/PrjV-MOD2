package rogernet.sischamados.vo;

import java.util.ArrayList;

//VO = Value Object padrão

public class Chamado {

	private int                 codigo;
	private String              descricao;
	private ArrayList<Contato>  contatos;
	
	public Chamado() {
		this.contatos = new ArrayList<Contato>();
	}

	public Chamado(int codigo, String descricao) {
		this.contatos = new ArrayList<Contato>();
		this.codigo = codigo;
		this.descricao = descricao;
	}	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public ArrayList<Contato> getContatos() {
		return contatos;
	}
	public void setContatos(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}
	
	public void cadastrarContato(int codigo, String descricao) {
		Contato c = new Contato(codigo,descricao);
		
		this.contatos.add(c);
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chamado other = (Chamado) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Chamado [codigo=" + codigo + ", descricao=" + descricao + "]";
	}
	
	
	
}
