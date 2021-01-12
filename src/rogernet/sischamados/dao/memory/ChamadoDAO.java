package rogernet.sischamados.dao.memory;

import java.util.ArrayList;

import rogernet.sischamados.vo.Chamado;

public class ChamadoDAO {

	public ArrayList <Chamado> chamados;
	
	public ChamadoDAO() {
		this.chamados = new ArrayList<Chamado>();
	}
	
	public void delete(int codigoChamado) {
		
	}
	
	public void insert(Chamado c) {
		this.chamados.add(c);
	}
	
	public ArrayList<Chamado> selectAll() {
		ArrayList <Chamado> tmp = new ArrayList<Chamado> ();
		
		for (Chamado chamado : this.chamados) {
			tmp.add(chamado);
		}
		return tmp;
	}
	
	public void criarChamado(Chamado c) {
		this.chamados.add(c);
	}
	
	public ArrayList<Chamado> getChamados(){
		return this.chamados;
	}
	
}
