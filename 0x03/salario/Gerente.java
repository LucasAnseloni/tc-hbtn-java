public class Gerente extends Empregado{

        public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    
    @Override
    public double calcularBonus(Departamento departamento){
        if(departamento.alcancouMeta() == true){
            return ((salarioFixo * 0.20) + (departamento.valorAtingidoMeta - departamento.valorMeta) * 0.01);
        }
        return 0.00;
    }

    double calcularSalarioTotal(Departamento departamento){
        if(departamento.alcancouMeta() == true){
            return  salarioFixo + ((salarioFixo * 0.20) + (departamento.valorAtingidoMeta - departamento.valorMeta) * 0.01);
        }
        return salarioFixo;
    }
}
