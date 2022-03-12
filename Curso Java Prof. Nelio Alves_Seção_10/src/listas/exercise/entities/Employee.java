package listas.exercise.entities;

public class Employee {
    private Integer id;
    private String name;
    private Double salario;

    public Employee(Integer id, String name, Double salario) {
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void aumentoSalario(double percentage) {
        salario += salario * percentage / 100.0;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", " + name + ", R$" + String.format("%.2f", salario);
    }
}

