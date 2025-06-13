import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(8);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDiego = new Dev();
        devDiego.setNome("Diego");
        devDiego.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devDiego.getConteudosInscritos());
        devDiego.progredir();
        devDiego.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + devDiego.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devDiego.getConteudosConcluidos());
        System.out.println("XP: " + devDiego.calcularXp());

        System.out.println("--------------------------");
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularXp());


    }
}