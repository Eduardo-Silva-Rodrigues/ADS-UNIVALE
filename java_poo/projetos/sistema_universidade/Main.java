package java_poo.projetos.sistema_universidade;

public class Main {
    public static void main(String[] args) {
        Universidade universidade = new Universidade("Univale", "Av. Minas Gerais, 651 - Ivaiporã, PR, 86870-000");

        Curso ads = new Curso("Análise e Desenvolvimento de Sistemas");
        Curso psico = new Curso("Psicologia");

        Disciplina adsPoo = new Disciplina("Programação Orientada Objeto");
        Disciplina adsBanco = new Disciplina("Banco de Dados");
        Disciplina psicoAnatomia = new Disciplina("Anatomia Humana");
        Disciplina psicoPC = new Disciplina("Psicologia e Ciência");

        Turma adsA = new Turma("Análise A", 1, "Noturno");
        Turma adsB = new Turma("Análise B", 2, "Noturno");
        Turma psicoA = new Turma("Psicologia A", 1, "Noturno");
        Turma psicoB = new Turma("Psicologia B", 3, "Noturno");

        Pessoa pessoa1 = new Pessoa("Eduardo", 19, "111.111.111-11", "eduardo1@gmail.com", "(43) 9 1111-1111", "Qualquer lugar", universidade);
        Pessoa pessoa2 = new Pessoa("Gustavo", 18, "222.222.222-22", "gustavo1@gmail.com", "(43) 9 2222-2222", "Qualquer lugar", universidade);
        Pessoa pessoa3 = new Pessoa("Lucas", 24, "333.333.333-33", "lucas1@gmail.com", "(43) 9 3333-3333", "Qualquer lugar", universidade);
        Pessoa pessoa4 = new Pessoa("Carlos", 18, "444.444.444-44", "carlos1@gmail.com", "(43) 9 4444-4444", "Qualquer lugar", universidade);
        Pessoa pessoa5 = new Pessoa("Matheus", 25, "555.555.555-55", "matheus1@gmail.com", "(43) 9 5555-5555", "Qualquer lugar", universidade);
        Pessoa pessoa6 = new Pessoa("Giulio", 25, "666.666.666-66", "giulio1@gmail.com", "(43) 9 6666-6666", "Qualquer lugar", universidade);
        Pessoa pessoa7 = new Pessoa("Pedro", 30, "777.777.777-77", "pedro1@gmail.com", "(43) 9 7777-7777", "Qualquer lugar", universidade);
        Pessoa pessoa8 = new Pessoa("João", 32, "888.888.888-88", "joao1@gmail.com", "(43) 9 8888-8888", "Qualquer lugar", universidade);

        Aluno aluno1 = new Aluno(pessoa1.exibirNome(), pessoa1.exibirIdade(), pessoa1.exibirCpf(), pessoa1.exibirEmail(), pessoa1.exibirTelefone(), pessoa1.exibirEndereco(), universidade, "1111", ads, adsA);
        Aluno aluno2 = new Aluno(pessoa2.exibirNome(), pessoa2.exibirIdade(), pessoa2.exibirCpf(), pessoa2.exibirEmail(), pessoa2.exibirTelefone(), pessoa2.exibirEndereco(), universidade, "2222", ads, adsB);
        Aluno aluno3 = new Aluno(pessoa3.exibirNome(), pessoa3.exibirIdade(), pessoa3.exibirCpf(), pessoa3.exibirEmail(), pessoa3.exibirTelefone(), pessoa3.exibirEndereco(), universidade, "3333", ads, psicoA);
        Aluno aluno4 = new Aluno(pessoa4.exibirNome(), pessoa4.exibirIdade(), pessoa4.exibirCpf(), pessoa4.exibirEmail(), pessoa4.exibirTelefone(), pessoa4.exibirEndereco(), universidade, "4444", ads, psicoB);
    }
}
