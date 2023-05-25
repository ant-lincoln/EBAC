public abstract class Pessoa {
    private String nome;
    private String endereco;
    private Long numeroContato;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Long getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(Long numeroContato) {
        this.numeroContato = numeroContato;
    }


}
