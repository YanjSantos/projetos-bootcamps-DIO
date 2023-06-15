import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Formação Java Developer");
        curso1.setDescricao("Curso de formação em Java, do básico ao avançado.");
        curso1.setCargaHoraria(75);

        Curso curso2 = new Curso();
        curso2.setTitulo("Formação Scrum Master");
        curso2.setDescricao("Curso preparatório para a certificação Scrum Master.");
        curso2.setCargaHoraria(30);

        Curso curso3 = new Curso();
        curso3.setTitulo("Formação Kotlin");
        curso3.setDescricao("Curso de formação em Kotlin, do básico ao avançado.");
        curso3.setCargaHoraria(40);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Principais desafios do programador Java.");
        mentoria1.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp com as principais ferramentas Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAnderson = new Dev();
        devAnderson.setNome("Anderson Santos");
        devAnderson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Anderson: " + devAnderson.getConteudosInscritos());
        devAnderson.progredir();
        devAnderson.progredir();
        System.out.println(" - ");
        System.out.println("Conteúdos inscritos Anderson: " + devAnderson.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Anderson: " + devAnderson.getConteudosConcluidos());
        System.out.println("Xp " + devAnderson.calcularTotalXp() );

        System.out.println("----------");

        Dev devFlavia = new Dev();
        devFlavia.setNome("Flavia Rezende");
        devFlavia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Flávia: " + devFlavia.getConteudosInscritos());
        devFlavia.progredir();
        devFlavia.progredir();
        devFlavia.progredir();
        System.out.println(" - ");
        System.out.println("Conteúdos inscritos Flávia: " + devFlavia.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Flávia: " + devFlavia.getConteudosConcluidos());
        System.out.println("Xp " + devFlavia.calcularTotalXp() );


    }
}