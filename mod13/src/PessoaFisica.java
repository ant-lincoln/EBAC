public class PessoaFisica extends Pessoa{
    private String CPF;
    private String estadoCivil;
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }



    public void imprimeDados() {
        System.out.println("***************");
        System.out.println("Nome: "+getNome()+"| Endereco: "+getEndereco()+"| Contato: "+getNumeroContato()+"| CPF: "+getCPF()+"| Estado civil: "+getEstadoCivil());
    }
}
