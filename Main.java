import java.util.Calendar;

public class Main {

	public static void main(String[]args) {
		
		Produto p1 = new Produto();
		p1.setCode(1111);
		p1.setDescricao("haddad");
		p1.setQtd(3);
		p1.setValor(2);

		Produto p2 = new Produto();
		p2.setCode(666);
		p2.setDescricao("bozonaro");
		p2.setQtd(666);
		p2.setValor(666);
		
		Vendedor v = new Vendedor();
		v.setCode(333);
		v.setNome("victor");
		
		Cliente c = new Cliente();
		c.setCode(444);
		c.setEmail("hhuuhuh@gmail.com");
		c.setNome("curvelitho");
		
		Pedido p = new Pedido();
		p.setCode(1);
		//p.listaProdutos.add(p1);
		p.listaProdutos.add(p2);
		
		Calendar data1 = Calendar.getInstance();
		data1.set(Calendar.DAY_OF_MONTH, 12);
		data1.set(Calendar.MONTH, 3);
		data1.set(Calendar.YEAR, 2000);
		p.setDataInicio(data1);
		Calendar data2 = Calendar.getInstance();
		data2.set(Calendar.DAY_OF_MONTH, 4);
		data2.set(Calendar.MONTH, 3);
		data2.set(Calendar.YEAR, 2001);
		p.setDataFim(data2);
		p.setDataInicio(data1);
		
		
		System.out.println(p.verificaProdutoUnico(p2));
		System.out.println(p.addProduto(p2));
		System.out.println(p1.totalItem());
		System.out.println(p.totalPedido());
		System.out.println(p.valorMedia());
		System.out.println(p.quantidadeMaior(4));
		System.out.println(p.dias());
		System.out.println(p.buscaProdutoDescricao("bozo"));
	}	
}
