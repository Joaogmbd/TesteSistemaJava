package exercicio3;

import java.util.Date;

public class Pedido {
 
    private int pedidoId;
    private Date dataEmissao;
    private double valorTotalCalculado;

	public Pedido() {
		dataEmissao = new Date();
		
	}
    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Date getDataEmissao() {
        return this.dataEmissao;
    }

    public double getValorTotalCalculado() {
        return valorTotalCalculado;
    }

    public void setValorTotalCalculado(double valorTotalCalculado) {
        this.valorTotalCalculado = valorTotalCalculado;
    }
    
    
    
}