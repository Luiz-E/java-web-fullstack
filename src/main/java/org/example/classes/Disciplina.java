package org.example.classes;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.DoubleStream;

public class Disciplina {
    private double[] notas = new double [4];
    private String disciplina;

    public double getMediaNotas() {
//        return DoubleStream.of(notas).average().orElse(0);
        double sum = 0;
        for (double nota : notas) {
            sum += nota;
        }
        return sum / notas.length;
    }

    public double[] getNota() {
        return notas;
    }

    public void setNota(double[] nota) {
        this.notas = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Arrays.equals(notas, that.notas) && Objects.equals(disciplina, that.disciplina);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(disciplina);
        result = 31 * result + Arrays.hashCode(notas);
        return result;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nota=" + notas +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}