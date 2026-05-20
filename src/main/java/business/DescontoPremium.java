package business;

public class DescontoPremium implements IDesconto{

    @Override
    public double calcular(double valor){
        return valor * 0.90;
    }
}