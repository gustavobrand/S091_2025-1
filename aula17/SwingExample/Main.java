package aula17.SwingExample;

import javax.swing.JOptionPane;

// INICIO DO PROGRAMA

//DICA: aqui podemos usar muito CLEAN CODE.
public class Main {

	//    static PessoaServiceImpl serv;
	static final String LISTA = "1";
	static final String MAPA = "2";

	public static void main(String[] args) {

		String s = JOptionPane.showInputDialog(
				"Selecione a forma de armazenamento\n1.Lista\n2.Mapa");
		if (s.equals(LISTA)) {
			// serv = new PessoaServiceImpl(new BancoDadosLista());
		} else if (s.equals(MAPA)) {
			// serv = new PessoaServiceImpl(new BancoDadosMapa());
		} else {
			JOptionPane.showMessageDialog(null, "opcao invalida para salvamento");
			System.exit(1);
		}

		while (true) {
			String o = JOptionPane.showInputDialog(menuPrincipa());
			if (o.equals("1")) {
				try {
					cadastroPessoaF();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "erro ao salvar pessoa");
				}
			} else if (o.equals("2")) {
				try {
					cadastroPessoaJu();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "erro ao salvar pessoa");
				}
			} else if (o.equals("3")) {
				mostraSal();
			} else if (o.equals("4")) {
				try {
					re();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "erro ao remove pessoa");
				}
			} else if (o.equals("3")) {
				System.exit(1);
			}
		}
	}

	private static void re() throws Exception {
		String nome = JOptionPane.showInputDialog("Qual id da pessoa para remover");
		//	serv.remover(Integer.parseInt(nome));
	}

	private static void mostraSal() {
		//	JOptionPane.showMessageDialog(null, serv.calculaSalario());
	}

	private static void cadastroPessoaJu() throws Exception {
		String nome = JOptionPane.showInputDialog("Qual nome da empresa");
		String end = JOptionPane.showInputDialog("Qual endereco da empresa");
		String cnpj = JOptionPane.showInputDialog("Qual cnpj da empresa");

		//	PessoaJuridica pj = new PessoaJuridica(1);
		//	pj.setEnd(end);
		//	pj.setNo(nome);
		//	pj.setCnpj(cnpj);
		//	serv.salva(pj);
	}

	private static void cadastroPessoaF() throws Exception {
		String nome = JOptionPane.showInputDialog("Qual nome da pessoa");
		String end = JOptionPane.showInputDialog("Qual endereco da pessoa");
		String cpf = JOptionPane.showInputDialog("Qual cpf da pessoa");
		String salario = JOptionPane.showInputDialog("Qual salario da pessoa");
		//	PessoaFisica pf = new PessoaFisica(1);
		//	pf.setCpf(cpf);
		//	pf.setEnd(end);
		//	pf.setNo(nome);
		//	pf.setSalario(Float.parseFloat(salario));
		//	serv.salva(pf);

	}

	public static String menuPrincipa() {
		StringBuilder m = new StringBuilder();
		m.append("selecione uma opcao\n");
		m.append("1. cadastro pessoa fisica\n");
		m.append("2. cadastro pessoa juridica\n");
		m.append("3. mostra salario pessoa fisica\n");
		m.append("4. remover uma opcao\n");
		m.append("5. sair\n");
		return m.toString();
	}

}
