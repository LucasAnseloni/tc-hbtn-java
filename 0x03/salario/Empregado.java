public class Empregado {
    double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double calcularBonus(Departamento departamento){
        if(departamento.alcancouMeta() == true){
            return salarioFixo * 0.10;
        }
        return 0.00;
    }

    double calcularSalarioTotal(Departamento departamento){
        if(departamento.alcancouMeta() == true){
            return salarioFixo * 1.10;
        }
        return salarioFixo;
    }
}
