import java.util.ServiceLoader;

import example.FuncionarioService;

/**
 * Onde tudo começa
 */
public class Aplicacao {
	static ServiceLoader<FuncionarioService> loader;

	public static void main(String[] args) {
		loader = ServiceLoader.load(FuncionarioService.class);
		FuncionarioService servico = loader.iterator().next();
		System.out.println("Nome do funcionario: " + servico.loadNome());
	}
}