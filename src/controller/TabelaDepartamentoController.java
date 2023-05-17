package controller;

import javax.swing.JOptionPane;

import br.com.serialexperimentscarina.listaobject.ListaObject;
import model.Departamento;

public class TabelaDepartamentoController implements ITabelaDepartamentoController{
	
	ListaObject[] tabelaDeEspalhamento;

	public TabelaDepartamentoController(int andares) {
		tabelaDeEspalhamento = new ListaObject[andares];
		
		for (int i = 0; i < andares; i++) {
			tabelaDeEspalhamento[i] = new ListaObject();
		}
	}

	@Override
	public void adiciona(Departamento dep) throws Exception {
		int hash = hashCode(dep);
		ListaObject l = tabelaDeEspalhamento[hash];
		l.addFirst(dep);
		
	}

	@Override
	public void remove(Departamento dep) throws Exception {
		int hash = hashCode(dep);
		ListaObject l = tabelaDeEspalhamento[hash];
		int tamanho = l.size();
		
		for (int i = 0; i < tamanho; i++) {
			Departamento d = (Departamento) l.get(i);
			if(d.getAndar() == dep.getAndar() && d.getNomeDep().equals(dep.getNomeDep())) {
				l.remove(i);
				JOptionPane.showMessageDialog(null, "Departamento removido com sucesso");
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "Departamento não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
		
	}

	@Override
	public Departamento busca(Departamento dep) throws Exception {
		int hash = hashCode(dep);
		ListaObject l = tabelaDeEspalhamento[hash];
		int tamanho = l.size();
		
		for (int i = 0; i < tamanho; i++) {
			Departamento d = (Departamento) l.get(i);
			if(d.getAndar() == dep.getAndar() && d.getNomeDep().equals(dep.getNomeDep())) {
				return d;
			}
		}
		return null;
	}

	@Override
	public void lista(int andar) throws Exception {
		ListaObject l = tabelaDeEspalhamento[andar];
		int tamanho = l.size();
		
		for (int i = 0; i < tamanho; i++) {
			System.out.println(l.get(i));
		}
		
	}
	
	// Função hash
	private int hashCode(Departamento dep) {
		return (dep.getAndar());
	}

}
