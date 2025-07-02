package aula17.CamadasContaBancaria;

import javax.swing.JOptionPane;
import java.util.Optional;

/**
* Camada de Apresentação (View) para interagir com o usuário via JOptionPane.
* Orquestra as chamadas para a camada de negócio (Service).
*/
public class ContaBancariaView {

 private ContaBancariaService contaService;

 // Construtor que recebe a instância do serviço
 public ContaBancariaView(ContaBancariaService contaService) {
     this.contaService = contaService;
 }

 /**
  * Exibe o menu principal da aplicação e processa as escolhas do usuário.
  */
 public void exibirMenuPrincipal() {
     String[] options = {"Cadastrar Conta", "Depositar", "Sacar", "Consultar Saldo", "Sair"};
     int choice;

     do {
         choice = JOptionPane.showOptionDialog(
                 null,
                 "Escolha uma opção:",
                 "Sistema Bancário",
                 JOptionPane.DEFAULT_OPTION,
                 JOptionPane.PLAIN_MESSAGE,
                 null,
                 options,
                 options[0]
         );

         switch (choice) {
             case 0: // Cadastrar Conta
                 cadastrarConta();
                 break;
             case 1: // Depositar
                 depositar();
                 break;
             case 2: // Sacar
                 sacar();
                 break;
             case 3: // Consultar Saldo
                 consultarSaldo();
                 break;
             case 4: // Sair
                 JOptionPane.showMessageDialog(null, "Obrigado por usar o sistema bancário!");
                 break;
             default:
                 // Caso o usuário feche a janela sem escolher uma opção
                 choice = 4; // Define como sair
                 break;
         }
     } while (choice != 4); // Loop até o usuário escolher "Sair"
 }

 /**
  * Solicita os dados para cadastrar uma nova conta e chama o serviço.
  */
 private void cadastrarConta() {
     String nomeCorrentista = JOptionPane.showInputDialog(null, "Digite o nome do correntista:");
     if (nomeCorrentista == null || nomeCorrentista.trim().isEmpty()) {
         JOptionPane.showMessageDialog(null, "Nome do correntista não pode ser vazio.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
         return;
     }

     String saldoInicialStr = JOptionPane.showInputDialog(null, "Digite o saldo inicial:");
     if (saldoInicialStr == null || saldoInicialStr.trim().isEmpty()) {
         JOptionPane.showMessageDialog(null, "Saldo inicial não pode ser vazio.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
         return;
     }

     try {
         double saldoInicial = Double.parseDouble(saldoInicialStr);
         ContaBancaria conta = contaService.cadastrarConta(nomeCorrentista.trim(), saldoInicial);
         JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!\n" + conta.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
     } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null, "Saldo inicial inválido. Por favor, digite um número.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
     } catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null, "Erro ao cadastrar conta: " + e.getMessage(), "Erro de Negócio", JOptionPane.ERROR_MESSAGE);
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Erro generico ao cadastrar conta: " + e.getMessage(), "Erro de Negócio", JOptionPane.ERROR_MESSAGE);
     }
 }

 /**
  * Solicita os dados para realizar um depósito e chama o serviço.
  */
 private void depositar() {
     String nomeCorrentista = JOptionPane.showInputDialog(null, "Digite o nome do correntista:");
     if (nomeCorrentista == null || nomeCorrentista.trim().isEmpty()) {
         JOptionPane.showMessageDialog(null, "Nome do correntista não pode ser vazio.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
         return;
     }

     String valorDepositoStr = JOptionPane.showInputDialog(null, "Digite o valor a depositar:");
     if (valorDepositoStr == null || valorDepositoStr.trim().isEmpty()) {
         JOptionPane.showMessageDialog(null, "Valor do depósito não pode ser vazio.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
         return;
     }

     try {
         double valorDeposito = Double.parseDouble(valorDepositoStr);
         ContaBancaria contaAtualizada = contaService.depositar(nomeCorrentista.trim(), valorDeposito);
         JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!\n" + contaAtualizada.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
     } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null, "Valor do depósito inválido. Por favor, digite um número.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
     } catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null, "Erro ao depositar: " + e.getMessage(), "Erro de Negócio", JOptionPane.ERROR_MESSAGE);
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Erro generico ao despositar: " + e.getMessage(), "Erro de Negócio", JOptionPane.ERROR_MESSAGE);
     }
 }

 /**
  * Solicita os dados para realizar um saque e chama o serviço.
  */
 private void sacar() {
     String nomeCorrentista = JOptionPane.showInputDialog(null, "Digite o nome do correntista:");
     if (nomeCorrentista == null || nomeCorrentista.trim().isEmpty()) {
         JOptionPane.showMessageDialog(null, "Nome do correntista não pode ser vazio.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
         return;
     }

     String valorSaqueStr = JOptionPane.showInputDialog(null, "Digite o valor a sacar:");
     if (valorSaqueStr == null || valorSaqueStr.trim().isEmpty()) {
         JOptionPane.showMessageDialog(null, "Valor do saque não pode ser vazio.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
         return;
     }

     try {
         double valorSaque = Double.parseDouble(valorSaqueStr);
         ContaBancaria contaAtualizada = contaService.sacar(nomeCorrentista.trim(), valorSaque);
         JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!\n" + contaAtualizada.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
     } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null, "Valor do saque inválido. Por favor, digite um número.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
     } catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null, "Erro ao sacar: " + e.getMessage(), "Erro de Negócio", JOptionPane.ERROR_MESSAGE);
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Erro generico ao sacar: " + e.getMessage(), "Erro de Negócio", JOptionPane.ERROR_MESSAGE);
     }
 }

 /**
  * Solicita o nome do correntista e exibe o saldo da conta.
  */
 private void consultarSaldo() {
     String nomeCorrentista = JOptionPane.showInputDialog(null, "Digite o nome do correntista para consultar o saldo:");
     if (nomeCorrentista == null || nomeCorrentista.trim().isEmpty()) {
         JOptionPane.showMessageDialog(null, "Nome do correntista não pode ser vazio.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
         return;
     }

     Optional<ContaBancaria> contaOpt = contaService.buscarConta(nomeCorrentista.trim());
     if (contaOpt.isPresent()) {
         JOptionPane.showMessageDialog(null, "Detalhes da Conta:\n" + 
        		 contaOpt.get().toString(), "Consulta de Saldo", JOptionPane.INFORMATION_MESSAGE);
     } else {
         JOptionPane.showMessageDialog(null, "Conta não encontrada para o correntista: " + nomeCorrentista, "Erro", JOptionPane.ERROR_MESSAGE);
     }
 }
}
