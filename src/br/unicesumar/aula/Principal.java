package br.unicesumar.aula;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        System.out.println("Informe o nome: ");
        // Implementando a coleta de dados em um método
        // Atalho: Ctrl + Alt + M
        // Extrair método - transforma código selecionado em método
        pessoa.setNome(coletaDeDadosDoUsuario());
        do {
            try {
                // Validar a idade informada
                // Se está entre 1 e 120
                // Se é número
                System.out.println("Informe a idade");
                // Resolver a exceção
                // Usa o mesmo método para coletar idade
                pessoa.setIdade(coletaDeDadosDoUsuario());
                // Imprimindo os dados da pessoa
                // Após validar a idade
                // Sobrecarga no método toString
                System.out.println(pessoa);
                break;
            } catch (IdadeException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Você deve informar um número inteiro.");
            }
        } while (true);
    }

    private static String coletaDeDadosDoUsuario() {
        Scanner scanner = new Scanner(System.in);
        String dado = scanner.nextLine();
        return dado;
    }
}
