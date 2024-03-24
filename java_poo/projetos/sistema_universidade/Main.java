package java_poo.projetos.sistema_universidade;

public class Main {
    public static void main(String[] args) {
        // Criando universidade:
        Universidade universidade = new Universidade("UNIVALE", "Av. Minas Gerais, 651 - Ivaiporã, PR, 86870-000");

        // Criando cursos:
        Curso ads = new Curso("Análise e Desenvolvimento de Sistemas");
        Curso psico = new Curso("Psicologia");
        
        // Criando turmas:
        Turma adsA = new Turma("Análise A", 1, "Noturno");
        Turma adsB = new Turma("Análise B", 2, "Noturno");
        Turma psicoA = new Turma("Psicologia A", 1, "Noturno");
        Turma psicoB = new Turma("Psicologia B", 3, "Noturno");

        // Adicionando turmas aos cursos:
        ads.adicionarTurma(adsA);
        ads.adicionarTurma(adsB);

        psico.adicionarTurma(psicoA);
        psico.adicionarTurma(psicoB);

        // Criando disciplinas:
        Disciplina adsPoo = new Disciplina("Programação Orientada Objeto");
        Disciplina adsBanco = new Disciplina("Banco de Dados");
        Disciplina psicoAnatomia = new Disciplina("Anatomia Humana");
        Disciplina psicoPC = new Disciplina("Psicologia e Ciência");

        // Adicionando disciplinas aos cursos:
        ads.adicionarDisciplina(adsPoo);
        ads.adicionarDisciplina(adsBanco);

        psico.adicionarDisciplina(psicoAnatomia);
        psico.adicionarDisciplina(psicoPC);

        adsPoo.adicionarTurma(adsA);
        adsBanco.adicionarTurma(adsB);

        psicoAnatomia.adicionarTurma(psicoA);
        psicoPC.adicionarTurma(psicoB);

        // Criando pessoas:
        Pessoa pessoa1 = new Pessoa("Eduardo", 19, "111.111.111-11", "eduardo1@gmail.com", "(43) 9 1111-1111", "Qualquer lugar", universidade);
        Pessoa pessoa2 = new Pessoa("Gustavo", 18, "222.222.222-22", "gustavo1@gmail.com", "(43) 9 2222-2222", "Qualquer lugar", universidade);
        Pessoa pessoa3 = new Pessoa("Lucas", 24, "333.333.333-33", "lucas1@gmail.com", "(43) 9 3333-3333", "Qualquer lugar", universidade);
        Pessoa pessoa4 = new Pessoa("Carlos", 18, "444.444.444-44", "carlos1@gmail.com", "(43) 9 4444-4444", "Qualquer lugar", universidade);
        Pessoa pessoa5 = new Pessoa("Matheus", 25, "555.555.555-55", "matheus1@gmail.com", "(43) 9 5555-5555", "Qualquer lugar", universidade);
        Pessoa pessoa6 = new Pessoa("Giulio", 25, "666.666.666-66", "giulio1@gmail.com", "(43) 9 6666-6666", "Qualquer lugar", universidade);
        Pessoa pessoa7 = new Pessoa("Pedro", 30, "777.777.777-77", "pedro1@gmail.com", "(43) 9 7777-7777", "Qualquer lugar", universidade);
        Pessoa pessoa8 = new Pessoa("João", 32, "888.888.888-88", "joao1@gmail.com", "(43) 9 8888-8888", "Qualquer lugar", universidade);

        // Criando alunos:
        Aluno aluno1 = new Aluno(pessoa1.exibirNome(), pessoa1.exibirIdade(), pessoa1.exibirCpf(), pessoa1.exibirEmail(), pessoa1.exibirTelefone(), pessoa1.exibirEndereco(), universidade, "1111", ads, adsA);
        Aluno aluno2 = new Aluno(pessoa2.exibirNome(), pessoa2.exibirIdade(), pessoa2.exibirCpf(), pessoa2.exibirEmail(), pessoa2.exibirTelefone(), pessoa2.exibirEndereco(), universidade, "2222", ads, adsB);
        Aluno aluno3 = new Aluno(pessoa3.exibirNome(), pessoa3.exibirIdade(), pessoa3.exibirCpf(), pessoa3.exibirEmail(), pessoa3.exibirTelefone(), pessoa3.exibirEndereco(), universidade, "3333", ads, psicoA);
        Aluno aluno4 = new Aluno(pessoa4.exibirNome(), pessoa4.exibirIdade(), pessoa4.exibirCpf(), pessoa4.exibirEmail(), pessoa4.exibirTelefone(), pessoa4.exibirEndereco(), universidade, "4444", ads, psicoB);

        // Adicionando alunos aos cursos:
        ads.adicionarAluno(aluno1);
        ads.adicionarAluno(aluno2);

        psico.adicionarAluno(aluno3);
        psico.adicionarAluno(aluno4);

        // Adicionando alunos nas turmas:
        adsA.adicionarAluno(aluno1);
        adsB.adicionarAluno(aluno2);

        psicoA.adicionarAluno(aluno3);
        psicoB.adicionarAluno(aluno4);

        // Adicionando disciplinas nas turmas:
        adsA.adicionarDisciplina(adsPoo);
        adsA.adicionarDisciplina(adsBanco);
        adsB.adicionarDisciplina(adsPoo);
        adsB.adicionarDisciplina(adsBanco);

        psicoA.adicionarDisciplina(psicoAnatomia);
        psicoA.adicionarDisciplina(psicoPC);
        psicoB.adicionarDisciplina(psicoAnatomia);
        psicoB.adicionarDisciplina(psicoPC);

        // Adicionando turma aos alunos:
        aluno1.adicionarTurma(adsA);
        aluno2.adicionarTurma(adsB);

        aluno3.adicionarTurma(psicoA);
        aluno4.adicionarTurma(psicoB);

        // Adicionando disciplinas aos alunos:
        aluno1.adicionarDisciplina(adsPoo);
        aluno2.adicionarDisciplina(adsBanco);

        aluno3.adicionarDisciplina(psicoAnatomia);
        aluno4.adicionarDisciplina(psicoPC);

        // Adicionando alunos nas disciplinas:
        adsPoo.adicionarAluno(aluno1);
        adsBanco.adicionarAluno(aluno2);

        psicoAnatomia.adicionarAluno(aluno3);
        psicoPC.adicionarAluno(aluno4);

        // Criando professores:
        Professor professor1 = new Professor(pessoa5.exibirNome(), pessoa5.exibirIdade(), pessoa5.exibirCpf(), pessoa5.exibirEmail(), pessoa5.exibirTelefone(), pessoa5.exibirEndereco(), universidade, ads, "R$10.000");
        Professor professor2 = new Professor(pessoa6.exibirNome(), pessoa6.exibirIdade(), pessoa6.exibirCpf(), pessoa6.exibirEmail(), pessoa6.exibirTelefone(), pessoa6.exibirEndereco(), universidade, ads, "R$10.000");
        Professor professor3 = new Professor(pessoa7.exibirNome(), pessoa7.exibirIdade(), pessoa7.exibirCpf(), pessoa7.exibirEmail(), pessoa7.exibirTelefone(), pessoa7.exibirEndereco(), universidade, psico, "R$10.000");
        Professor professor4 = new Professor(pessoa8.exibirNome(), pessoa8.exibirIdade(), pessoa8.exibirCpf(), pessoa8.exibirEmail(), pessoa8.exibirTelefone(), pessoa8.exibirEndereco(), universidade, psico, "R$10.000");
        
        // Adicionando professores aos cursos:
        ads.adicionarProfessor(professor1);
        ads.adicionarProfessor(professor2);

        psico.adicionarProfessor(professor3);
        psico.adicionarProfessor(professor4);

        // Adicionando curso aos professores:
        professor1.vincularCurso(ads);
        professor2.vincularCurso(ads);

        professor3.vincularCurso(psico);
        professor4.vincularCurso(psico);

        // Adicionando disciplinas aos professores:
        professor1.vincularDisciplina(adsPoo);
        professor2.vincularDisciplina(adsBanco);

        professor3.vincularDisciplina(psicoAnatomia);
        professor4.vincularDisciplina(psicoPC);

        // Adicionando professor nas disciplinas:
        adsPoo.adicionarProfessor(professor1);
        adsBanco.adicionarProfessor(professor2);

        psicoAnatomia.adicionarProfessor(professor3);
        psicoPC.adicionarProfessor(professor4);

        // Adicionando cursos na universidade:
        universidade.adicionarCurso(ads);
        universidade.adicionarCurso(psico);

        // Cadastrando pessoas na universidade:
        universidade.registrarPessoa(pessoa1);
        universidade.registrarPessoa(pessoa2);
        universidade.registrarPessoa(pessoa3);
        universidade.registrarPessoa(pessoa4);
        universidade.registrarPessoa(pessoa5);
        universidade.registrarPessoa(pessoa6);
        universidade.registrarPessoa(pessoa7);
        universidade.registrarPessoa(pessoa8);

        // Contratando pessoas na universidade:
        universidade.contratarProfessor(professor1);
        universidade.contratarProfessor(professor2);
        universidade.contratarProfessor(professor3);
        universidade.contratarProfessor(professor4);

        // Matriculando alunos na unviersidade:
        universidade.matricularAluno(aluno1);
        universidade.matricularAluno(aluno2);
        universidade.matricularAluno(aluno3);
        universidade.matricularAluno(aluno4);

        universidade.interfaceSecretaria();
    }
}
