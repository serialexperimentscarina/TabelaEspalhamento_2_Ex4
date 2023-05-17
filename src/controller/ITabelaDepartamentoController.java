package controller;

import model.Departamento;

public interface ITabelaDepartamentoController {
	
	// Tabela de espalhamento para resolver o problema de inserir, consultar e remover para uma loja de departamentos
	public void adiciona(Departamento dep) throws Exception;
	public void remove(Departamento dep) throws Exception;
	public Departamento busca(Departamento dep) throws Exception;
	// Também é importante saber quais os departamentos por andar
	public void lista(int andar) throws Exception;

}