package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	
	public Pedido p;
    public Funcionario f;
	private List <Pedido> listaPedidos;
	
	public Loja() {
		listaPedidos = new ArrayList<>();
	}

	public void inserirPedido(Pedido pedido) {
		this.listaPedidos.add(pedido);
		
	}
	
	public void buscarPedido(int posicao) {
		System.out.println("Este é o pedido de ID: " + this.listaPedidos.get(posicao).getPedidoId() + " (use o comando ''lj01.imprimeLista()'' para encontrar mais informações sobre este pedido.)\n");
	}

	public void removerPedido(int posicao) {
		this.listaPedidos.remove(posicao);
		
		System.out.println("O pedido foi removido com sucesso!");
	}
	
	public void imprimeLista() {
		
		System.out.println("\nAs informações dos pedidos incluídos nesta loja são: \n" );
		
		for (Pedido item : this.getListaPedidos()) {
			System.out.println("=====================================");
			System.out.println("Id: " + item.getPedidoId() + "\n" + "Data de Emissão: " + item.getDataEmissao()
					+ " \nvalorTotalCalculado: " + "R$"
					+ item.getValorTotalCalculado()  + "\nAdicionado pelo funcionario: " + this.f.getNome());
			System.out.println("=====================================\n");
		}
	}
	
	public List<Pedido> getListaPedidos() {
		
		return listaPedidos;
	}
	
	public void menu() {
		
	}
	
	public static void main(String[] args) {
		Funcionario f01 = new Funcionario();
        
        f01.setNome("Jorge");
        f01.setMatricula(129783);   
        
        Funcionario f02 = new Funcionario();
        f02.setNome("Renata");
        f02.setMatricula(12309);
        
        
        
        Loja lj01 = new Loja();
        
        lj01.f = f02;
                 
        Pedido p01 = new Pedido();
        p01.setPedidoId(01);
        p01.setValorTotalCalculado(201.32);
        
        
        Pedido p02 = new Pedido();
        p02.setPedidoId(02);
        p02.setValorTotalCalculado(150.50);
        
        Pedido p03 = new Pedido();
        p03.setPedidoId(03);
        p03.setValorTotalCalculado(50.0);
        
        
        lj01.inserirPedido(p01);
        lj01.inserirPedido(p02);
        lj01.inserirPedido(p03);
        
        lj01.imprimeLista();
        
        lj01.removerPedido(2);
        
        lj01.imprimeLista(); 
        
        
        lj01.buscarPedido(1);
		}
	}
