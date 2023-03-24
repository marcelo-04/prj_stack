package prj_stack;

public class TesteConexao {

	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (IllegalStateException e) {
			System.out.println("Erro de conexão!!!");
		}
		
		// O código acima substitui todo o código abaixo
		
//		Conexao conexao = null;
//		
//		try {
//			conexao = new Conexao();
//			conexao.leDados();			
//		} catch (IllegalStateException e) {
//			System.out.println("Erro de conexão!!!");
//		} finally {
//			System.out.println("finally...");
//			if (conexao != null) {
//				conexao.close();
//			}
//		}
	}
}
