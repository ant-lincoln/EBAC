public class PessoaJuridica extends Pessoa{

    private String CNPJ;
    private String tipoEmpresa;

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public void imprimeDados() {
        System.out.println("***************");
        System.out.println("Nome: "+getNome()+"| Endereco: "+getEndereco()+"| Contato: "+getNumeroContato()+"| CNPJ: "+getCNPJ()+"| Tipo de Empresa: "+getTipoEmpresa());

    }
}
