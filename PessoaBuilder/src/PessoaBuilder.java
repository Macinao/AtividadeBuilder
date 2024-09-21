public interface PessoaBuilder {
    PessoaBuilder definirNome(String nome);
    PessoaBuilder definirCpf(String cpf);
    PessoaBuilder definirRg(String rg);
    PessoaBuilder definirEmail(String email);
    PessoaBuilder definirTelefone(int telefone);
    PessoaBuilder definirIdade(int idade);
    PessoaBuilder definirEndereco(String endereco);
    Pessoa definir();
}
