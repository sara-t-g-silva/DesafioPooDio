package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {


    private int cargoHoraria;

    public Curso() {
    }


    public int getCargoHoraria() {
        return cargoHoraria;
    }

    public void setCargoHoraria(int cargoHoraria) {
        this.cargoHoraria = cargoHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * this.cargoHoraria; // regra de negócio
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargoHoraria=" + cargoHoraria +
                '}';
    }
}
