package view;

import javax.swing.JOptionPane;

import controller.TabelaDepartamentoController;
import model.Departamento;

public class Principal {

	public static void main(String[] args) {
		TabelaDepartamentoController tabela = new TabelaDepartamentoController(4);
		String input = "", nome, desc;
		int andar;
		
		do {
			try {
				input = JOptionPane.showInputDialog("MENU: \n1 - Adicionar departamento \n2 - Remover departamento \n3 - Buscar departamento \n4 - Lista de departamentos por andar \n5 - Sair", "");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Encerrando.");
					System.exit(0);
				} else {
					switch (input) {
						case("1"):
							do {
								andar = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do andar: "));
								if (andar < 0 || andar > 3) {
									JOptionPane.showMessageDialog(null, "Andar inválido, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
								}
							} while (andar < 0 || andar > 3);
							nome = JOptionPane.showInputDialog("Digite o nome do departamento: ");
							desc  = JOptionPane.showInputDialog("Digite a descrição do departamento: ");
							tabela.adiciona(new Departamento(andar, nome, desc));
							break;
						case("2"):
							do {
								andar = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do andar: "));
								if (andar < 0 || andar > 3) {
									JOptionPane.showMessageDialog(null, "Andar inválido, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
								}
							} while (andar < 0 || andar > 3);
							nome = JOptionPane.showInputDialog("Digite o nome do departamento: ");
							tabela.remove(new Departamento(andar, nome, null));
							break;
						case("3"):
							do {
								andar = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do andar: "));
								if (andar < 0 || andar > 3) {
									JOptionPane.showMessageDialog(null, "Andar inválido, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
								}
							} while (andar < 0 || andar > 3);
							nome = JOptionPane.showInputDialog("Digite o nome do departamento: ");
							Departamento dep = tabela.busca(new Departamento(andar, nome, null));
							if (dep != null) {
								JOptionPane.showMessageDialog(null, dep);
							} else {
								JOptionPane.showMessageDialog(null, "Departamento não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
							}
							break;
						case("4"):
							do {
								andar = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do andar: "));
								if (andar < 0 || andar > 3) {
									JOptionPane.showMessageDialog(null, "Andar inválido, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
								}
							} while (andar < 0 || andar > 3);
						tabela.lista(andar);
					}
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Houve um erro durante a execução", "Erro", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
		} while (!input.equals("5"));
		JOptionPane.showMessageDialog(null, "Encerrando.");

	}

}
