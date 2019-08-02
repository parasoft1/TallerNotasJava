package entidades.empleados;

public class NotaEstudiante {

    private double notaSeguimiento;
    private double notaParcial;
    private double examenFinal;

    public double getNotaSeguimiento() {
        return notaSeguimiento;
    }

    public void setNotaSeguimiento(double notaSeguimiento) {
        this.notaSeguimiento = notaSeguimiento;
    }

    public double getNotaParcial() {
        return notaParcial;
    }

    public void setNotaParcial(double notaParcial) {
        this.notaParcial = notaParcial;
    }

    public double getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(double examenFinal) {
        this.examenFinal = examenFinal;
    }


    public double calcularSalario(){
        return ((0.4*this.getExamenFinal())+(0.3*this.getNotaParcial())+(0.3*this.getNotaSeguimiento()));
    }
}
