package app;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
	
	private List<String> usuarios;
    	
    public void usuarioService() {
    usuarios = new ArrayList<>();
    }

	public void cadastrarUsuario(String nome) {
	   if (nome == null || nome.trim().isEmpty()) {
		   System.out.println("Nome invalido! Nao foi possivel cadastrar. ");
		   return;
	   }
	   usuarios.add(nome);
	   System.out.println("Usuario '" + nome + "' cadastrado com sucesso!");
	}
	public void listarUsuarios() {
		if (usuarios.isEmpty()) {
			System.out.println("Nenhum usuario cadastrado.");
		} else {
			System.out.println("Lista de usuarios:");
			for (int i = 0; i < usuarios.size(); i++) {
				System.out.println((i + 1) + ". " + usuarios.get(i));
			}
		}
	}
}
