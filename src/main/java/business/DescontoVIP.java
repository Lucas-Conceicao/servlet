package business;
public class DescontoVIP implements IDesconto{

    @Override
    public double calcular(double valor){
        return valor * 0.8;
    }
}