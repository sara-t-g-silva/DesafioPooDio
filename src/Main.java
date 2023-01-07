import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descricao curso Java");
        curso.setCargoHoraria(8);

        //System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descricao de mentoria Java");
        mentoria.setData(LocalDate.now());// atribui a data apartir do dia da criação do objeto

        //System.out.println(mentoria);

        // testando

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Develop");
        bootcamp.setDescricao("Descrição Jav Develop");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devSara = new Dev();
        devSara.setNome("Sara");
        devSara.inscreverBootcamp(bootcamp);
        System.out.println("conteudos Inscritos Sara: "+devSara.getConteudoInscrito());
        devSara.progredir();
        System.out.println("conteudos Inscritos Sara: "+devSara.getConteudoInscrito());
        System.out.println("conteudos Concluidos Sara: "+devSara.getConteudosConcluidos());
        System.out.println("XP: "+devSara.calcularXP());

        Dev devJose = new Dev();
        devJose.setNome("José");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("conteudos Inscritos José: "+devJose.getConteudoInscrito());
        devJose.progredir();
        System.out.println("conteudos Inscritos José: "+devJose.getConteudoInscrito());
        System.out.println("conteudos Concluidos José: "+devJose.getConteudosConcluidos());
        System.out.println("XP: "+devJose.calcularXP());










    }
}
