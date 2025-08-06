package app; /* Define o pacote da classe */

import java.util.Scanner;
/* 2. Importar classe para leitura de dados, lendo as entradas*/

/* 3. Declarando a classe principal da aplicação*/
public class MenuApp {
	/* 4. Metodo principal, ponto de partida da aplicação*/
	public static void main(String[] args) {
/* 5. Cria objeto para capturar dados digitados*/
		Scanner scanner = new Scanner(System.in);
/* 6. instacia o servico para gerenciar usuarios*/
		UsuarioService usuarioService = new UsuarioService();
/* 7. Declarando variavel que armazena a escolha do menu*/
		int opcao;
/* 8. Incio do laco de repeticao do menu*/
		do {
			System.out.println("==== MENU     ====");
			System.out.println("1. Cadastrar usuario");
			System.out.println("2. Listar usuarios");
			System.out.println("3. Sair");
			System.out.print("Escolha uma opcao");
/* 9. le a opcao de escolha */
			opcao = scanner.nextInt();
/* 10. Limpa o buffer do teclado*/
			scanner.nextLine();
/* 11. Inicia estrutura de decisao baseada na opcao*/
			switch (opcao) {
/* 12. Se usuario escolher opcao 1 */
			case 1:
				 System.out.print("Digite o nome do usuario: ");
				 String nome = scanner.nextLine();
				 usuarioService.cadastrarUsuario(nome);
				 break;
			case 2:
				usuarioService.listarUsuarios();
				break;
			case 3:
				System.out.println("Encerrando o programa...");
				break;
				default:
					System.out.println("Opcao invalida! Tente novamente.");
					
			}
/*13. Repete enquanto a opcao for diferente de 3 */
			System.out.println(); //
		} while (opcao !=3);
		
		scanner.close();
	}
	/* 14. Encerra os scanner*/
}
