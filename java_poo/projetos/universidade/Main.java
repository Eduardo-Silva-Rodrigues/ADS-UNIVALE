package java_poo.projetos.universidade;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // Criando objetos Pessoa
        Pessoa pessoa1 = new Pessoa("Matheus", "matheus1@gmail.com", "(43) 9 000-000",
        "000.000.000-00", "Rua Cristiano Olsen, 000 - Araçatuba, SP, Araçatuba");
        Pessoa pessoa2 = new Pessoa("Giulio", "giulio1@gmail.com", "(43) 9 111-111",
        "111.111.111-11", "Av. Governador José Malcher, 111 - Belém, PA, Nazaré");
        Pessoa pessoa3 = new Pessoa("Michael", "michael1@gmail.com", "(43) 9 222-222",
        "222.222.222-22", "Rua Carlos Augusto Cornelsen, 222 - Curitiba, PR, Bom Retiro");
        Pessoa pessoa4 = new Pessoa("Eduardo", "eduardo1@gmail.com", "(43) 9 333-333",
        "333.333.333-33", "Av. Desembargador Moreira, 333 - Fortaleza, CE, Aldeota");
        Pessoa pessoa5 = new Pessoa("Gustavo", "gustavo1@gmail.com", "(43) 9 444-444",
        "444.444.444-44", "Rua Frederico Moura, 444 - Franca, SP, Cidade Nova");
        Pessoa pessoa6 = new Pessoa("Lucas", "lucas1@gmail.com", "(43) 9 555-555",
        "555.555.555-55", "Rua Maria Luísa do Val Penteado, 555 - São Paulo, SP, Cidade São Mateus");
        Pessoa pessoa7 = new Pessoa("Carlos", "carlos1@gmail.com", "(43) 9 666-666",
        "666.666.666-66", "Avenida Afonso Pena, 666 - Boa Viagem, MG, Boa Viagem");

        // Criando lista de pessoas
        ArrayList<Pessoa> listaPessoasUniversidade = new ArrayList<Pessoa>();
        listaPessoasUniversidade.add(0, pessoa7);

        // Criando objeto Universidade
        Universidade universidade = new Universidade("UNIVALE",
        "Av. Minas Gerais, 651 - Ivaiporã, PR, 86870-000");

        // Criando objetos Curso, Disciplina e listas
        Curso ads = new Curso("Análise e Desenvolvimento de Sistemas", "763,00");

        Disciplina adsPoo = new Disciplina("Programação Orientada a Objetos", 80);
        Disciplina adsBanco = new Disciplina("Banco de Dados", 80);
        Disciplina adsAnalise = new Disciplina("Análise e Projeto de Sistemas", 80);

        ArrayList<Disciplina> listaDisciplinasAds = new ArrayList<Disciplina>(); // Lista de disciplinas do objeto "ads"
        listaDisciplinasAds.add(0, adsPoo);
        listaDisciplinasAds.add(1, adsBanco);
        listaDisciplinasAds.add(2, adsAnalise);

        ads.setDisciplinas(listaDisciplinasAds);
        
        Curso vet = new Curso("Medicina Veterinária", "1.124,00");
        
        Disciplina vetAnatomia = new Disciplina("Anatomia", 80);
        Disciplina vetDeontologia = new Disciplina("Deontologia", 80);
        Disciplina vetEmbriologia = new Disciplina("Bases Biológicas de Embriologia", 80);
        
        ArrayList<Disciplina> listaDisciplinasVet = new ArrayList<Disciplina>(); // Lista de disciplinas do objeto "vet"
        listaDisciplinasVet.add(0, vetAnatomia);
        listaDisciplinasVet.add(1, vetDeontologia);
        listaDisciplinasVet.add(2, vetEmbriologia);
        
        vet.setDisciplinas(listaDisciplinasVet);

        Curso agro = new Curso("Agronomia", "838,00");
        
        Disciplina agroClimatologia = new Disciplina("Agroclimatologia", 67);
        Disciplina agroEstatistica = new Disciplina("Estatistica", 80);
        Disciplina agroEntomologia = new Disciplina("Entomologia Geral", 67);
        
        ArrayList<Disciplina> listaDisciplinasAgro = new ArrayList<Disciplina>(); // Lista de disciplinas do objeto "agro"
        listaDisciplinasAgro.add(0, agroClimatologia);
        listaDisciplinasAgro.add(1, agroEstatistica);
        listaDisciplinasAgro.add(2, agroEntomologia);

        agro.setDisciplinas(listaDisciplinasAgro);
        
        ArrayList<Curso> listaCursos = new ArrayList<Curso>(); // Lista de cursos do objeto "universidade"
        listaCursos.add(0, ads);
        listaCursos.add(1, vet);
        listaCursos.add(2, agro);
        
        // Criando objetos Professor e lista
        Professor professor1 = new Professor(pessoa1.getNome(), pessoa1.getEmail(), pessoa1.getTelefone(),
        pessoa1.getCpf(), pessoa1.getEndereco(), ads, adsPoo, "1.111,11");
        Professor professor2 = new Professor(pessoa2.getNome(), pessoa2.getEmail(), pessoa2.getTelefone(),
        pessoa2.getCpf(), pessoa2.getEndereco(), ads, adsPoo, "2.222,22");
        Professor professor3 = new Professor(pessoa3.getNome(), pessoa3.getEmail(), pessoa3.getTelefone(),
        pessoa3.getCpf(), pessoa3.getEndereco(), ads, adsPoo, "3.333,33");

        ArrayList<Professor> listaProfessoresAds = new ArrayList<Professor>(); // Lista de professores do objeto "ads"
        listaProfessoresAds.add(0, professor1);
        listaProfessoresAds.add(1, professor2);
        listaProfessoresAds.add(2, professor3);

        ads.setProfessores(listaProfessoresAds);

        // Criando objetos Aluno e lista
        Aluno aluno1 = new Aluno(pessoa4.getNome(), pessoa4.getEmail(), pessoa4.getTelefone(), pessoa4.getCpf(),
        pessoa4.getEndereco(), ads, listaDisciplinasAds, "Turma A", 1);
        Aluno aluno2 = new Aluno(pessoa5.getNome(), pessoa5.getEmail(), pessoa5.getTelefone(), pessoa5.getCpf(),
        pessoa5.getEndereco(), ads, listaDisciplinasAds, "Turma A", 1);
        Aluno aluno3 = new Aluno(pessoa6.getNome(), pessoa6.getEmail(), pessoa6.getTelefone(), pessoa6.getCpf(),
        pessoa6.getEndereco(), ads, listaDisciplinasAds, "Turma A", 1);

        ArrayList<String> listaTurmasAds = new ArrayList<String>(); // Lista de turmas do objeto "ads"
        listaTurmasAds.add(0, "Turma A");
        listaTurmasAds.add(1, "Turma B");
        listaTurmasAds.add(2, "Turma C");

        ads.setTurmas(listaTurmasAds);

        ArrayList<Aluno> listaAlunosAds = new ArrayList<Aluno>(); // Lista de alunos do objeto "ads"
        listaAlunosAds.add(0, aluno1);
        listaAlunosAds.add(1, aluno2);
        listaAlunosAds.add(2, aluno3);

        ads.setAlunos(listaAlunosAds);

        // Atribuindo as listas como propriedades para o objeto Universidade
        universidade.setProfessores(listaProfessoresAds);
        universidade.setAlunos(listaAlunosAds);
        universidade.setCursos(listaCursos);
        universidade.setPessoas(listaPessoasUniversidade);

        universidade.interfaceUniversidade();
    }
}

