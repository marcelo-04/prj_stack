package prj_stack;

public class TesteConexao {

	public static void main(String[] args) {
		
		Conexao conexao = null;
		
		try {
			conexao = new Conexao();
			conexao.leDados();			
		} catch (IllegalStateException e) {
			System.out.println("Erro de conexão!!!");
		} finally {
			conexao.fecha();
		}
	}
}
