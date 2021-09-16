package br.unicesumar.aula;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws IdadeException {
        // Validar a idade informada
        if((idade<=0) || (idade>120)) {
            // Disparar a Exception para a Idade
            throw new IdadeException("Idade informada deve estar entre 0 e 120 anos!");
        }
        this.idade = idade;
    }

    //Sobrecarga do método setIdade para retornar String
    public void setIdade(String idade) throws IdadeException {
        this.setIdade(Integer.parseInt(idade));
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
