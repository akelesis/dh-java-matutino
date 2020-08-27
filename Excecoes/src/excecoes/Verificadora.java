package excecoes;

import java.io.IOException;

public class Verificadora {
	public void verificaProduto(Produto prod) {
		if(prod.nome == null || prod.nome == "") {
			throw new EmptyStringException("nome");
		}
	}
	
	public void ExcecaoRunTime() {
		throw new RuntimeException();
	}
	
	public void notRuntime() throws IOException{
		throw new IOException();
	}
}
