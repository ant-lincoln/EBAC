public class Main {
    public static void main(String[] args) {
        PessoaFisica pf1 = new PessoaFisica();
        pf1.setNome("Antonio");
        pf1.setCPF("001.200.300-11");
        pf1.setEstadoCivil("Casado");
        pf1.setEndereco("Rua x, casa y. Bairro K, Cidade Z.");
        pf1.setNumeroContato(123456L);
        pf1.imprimeDados();

        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.setNome("MegaVendas LTDA");
        pj1.setCNPJ("01.001.200/0001-03");
        pj1.setTipoEmpresa("LTDA");
        pj1.setEndereco("Av A, nº B. Bairro C, Cidade D.");
        pj1.setNumeroContato(654321L);
        pj1.imprimeDados();
    }
}