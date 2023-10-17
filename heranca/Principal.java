package heranca;

public class Principal {
	public static void main(String[] args) {

		Produto produto = new Produto(1, "detergente", 1.99);
		System.out.println("\n---PRODUTO---");
		System.out.println(produto.getId());
		System.out.println(produto.getNome());
		System.out.println(produto.getPreco());

		Sorvete sorvete = new Sorvete(2, "caramelo", 2.99, -2);
		System.out.println("\n---SORVETE---");
		System.out.println(sorvete.getId());
		System.out.println(sorvete.getNome());
		System.out.println(sorvete.getPreco());
		System.out.println(sorvete.getTempAdeq());

		Camisa camisa = new Camisa(3, "Nike",95.99,"preta","algodão","M");
		System.out.println("\n---CAMISA---");
		System.out.println(camisa.getId());
		System.out.println(camisa.getNome());
		System.out.println(camisa.getPreco());
		System.out.println(camisa.getCor());
		System.out.println(camisa.getTecido());
		System.out.println(camisa.getTamanho());
	}
}
