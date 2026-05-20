package beans;

import business.DescontoComum;
import business.DescontoPremium;

public class CompraBean{
    private double valorOriginal;
    private String tipoCliente;
    private String formaPagamento;
    private double descontoAplicado;
    private double valorFinal;

    public CompraBean(double valorOriginal, String tipoCliente,  String formaPagamento) {
        this.valorOriginal = valorOriginal;
        this.tipoCliente = tipoCliente;
        this.formaPagamento = formaPagamento;
    }

    public double getValorOriginal() {return valorOriginal;}
    public String getTipoCliente() {return tipoCliente;}
    public String getFormaPagamento() {return formaPagamento;}
    public double getDescontoAplicado() {return descontoAplicado;}
    public double getValorFinal() {return valorFinal;}

    public void setValorOriginal(double valorOriginal) {this.valorOriginal = valorOriginal;}
    public void setTipoCliente(String tipoCliente) {this.tipoCliente = tipoCliente;}
    public void setFormaPagamento(String formaPagamento) {this.formaPagamento = formaPagamento;}

    public void setDescontoAplicado_E_ValorFinal() {
        switch (tipoCliente) {
            case "COMUM": this.descontoAplicado = 5; this.valorFinal = new DescontoComum(valorOriginal); break;
            case "PREMIUM": this.descontoAplicado = 10; break;
            case "VIP": this.descontoAplicado = 20; break;
        }
    }

}