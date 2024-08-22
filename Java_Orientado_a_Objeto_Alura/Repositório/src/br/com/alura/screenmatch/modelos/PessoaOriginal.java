package br.com.alura.screenmatch.modelos;

public class PessoaOriginal {

   private String nome;

    public PessoaOriginal(Pessoa minhaPessoa) {
    }

    @Override
    public String toString() {
        return "PessoaOriginal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cidade='" + cidade + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    private int idade;
   private String cidade;

}
