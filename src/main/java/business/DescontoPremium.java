package business;

//Helena da Silva Ramos e Lucas Conceição Ricardo
public class DescontoPremium implements IDesconto{

    @Override
    public double calcular(double valor){
        return valor * 0.90;
    }
}