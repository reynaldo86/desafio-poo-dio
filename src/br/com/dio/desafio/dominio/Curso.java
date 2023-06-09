package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso() {
    }
    //Regra de negocio
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nCurso(" +
                "\nTitulo: '" + getTitulo() + '\'' +
                ",\nDescricao='" + getDescricao() + '\'' +
                ",\nCargaHoraria=" + cargaHoraria +
                ')';
    }
}
