public class Main {
    public static void main(String[] args) {
        PessoaBuilder pessoaBuilder = new PessoaConcretBuilder();
        Pessoa pessoaComCasaPropria = pessoaBuilder.definirNome("Rivanildo")
                .definirCpf("130.123.322-33")
                .definirRg("5473456")
                .definirEmail("rivinhalindo123@gmail.com")
                .definirTelefone(40028922)
                .definirIdade(20)
                .definirEndereco("Rua do tiroreio Uirauna-PB")
                .definir();

        System.out.println(pessoaComCasaPropria);

        Pessoa pessoaMoradorDeRua = pessoaBuilder.definirNome("Maciano")
                .definirCpf("130.133.442-33")
                .definirRg("4235623")
                .definirEmail("macinaoo@gmail.com")
                .definirTelefone(45263453)
                .definirIdade(23)
                .definirEndereco("Sem endereco fixo")
                .definir();

        System.out.println(pessoaMoradorDeRua);
    }
}
