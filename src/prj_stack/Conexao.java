package prj_stack;

public class Conexao implements AutoCloseable {
	
	public Conexao() {
		System.out.println("Abrindo conexão!");
		throw new IllegalStateException();
	}
	
	public void leDados() {
		System.out.println("Recebendo dados!");
		throw new IllegalStateException();
	}
	
//	public void fecha() {
//		System.out.println("Fechando conexão!");
//	}

	@Override
	public void close() {
		System.out.println("Fechando conexão!");
		
	}

}
