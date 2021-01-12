package rogernet.sischamados.bo;

import java.util.ArrayList;

import rogernet.sischamados.dao.memory.ChamadoDAO;
import rogernet.sischamados.vo.Chamado;

public class ManterChamado {
	private ChamadoDAO dao;
	private ArrayList<Chamado> chamados;
	
	public ManterChamado() {
		this.chamados = new ArrayList<Chamado>();
	}
	
	public void criarChamado (Chamado c)) {
		if (c != null) {
			dao.insert(c);
		}
	}
	
	public ArrayList<Chamado> getChamado() {
		return dao.selectAll();
	}



	

	
	

}
