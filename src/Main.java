import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria curso java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
    
        /*System.out.print(curso1);
        System.out.print(curso2);
        System.out.print(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWilliam = new Dev();
        devWilliam.setNome("William");
        devWilliam.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devWilliam.getConteudosInscritos());
        devWilliam.progredir();
        System.out.println("Conteudos Concluidos" + devWilliam.getConteudosConcluidos());
        System.out.println("XP" + devWilliam.calcularTotalXp());

        Dev devSalerno =new Dev();
        devSalerno.setNome("Salerno");
        devSalerno.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devSalerno.getConteudosInscritos());
        devSalerno.progredir();
        System.out.println("Conteudos Concluidos" + devSalerno.getConteudosConcluidos());
        System.out.println("XP" + devSalerno.calcularTotalXp());

    }
}
