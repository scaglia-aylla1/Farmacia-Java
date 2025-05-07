package farmacia;

import java.io.IOException;
import java.util.Scanner;

import farmacia.util.Cores;

 
public class Menu {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
		int opcao;
		while(true) {
 
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Produto                        ");
			System.out.println("            2 - Listar todas os Produtos             ");
			System.out.println("            3 - Buscar Produto por ID                ");
			System.out.println("            4 - Atualizar Dados do Produto           ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			opcao = leia.nextInt();
			if (opcao == 6) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nFarmácia Bem Estar!");
				sobre();
				leia.close();
				System.exit(0);
			}
			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE + "Criar Produto\n\n");
                    		break;
				case 2:
					System.out.println(Cores.TEXT_WHITE + "Listar todos os Produtos\n\n");
                    		break;
				case 3:
					System.out.println(Cores.TEXT_WHITE + "Buscar Produto por Id\n\n");
                    		break;
				case 4:
					System.out.println(Cores.TEXT_WHITE + "Atualizar dados do Produto\n\n");
                    		break;
				case 5:
					System.out.println(Cores.TEXT_WHITE + "Apagar o Produto\n\n");
                   	 	break;
 
              
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
                    		break;
			}
		}	
    }
 
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Aylla Scaglia");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/scaglia-aylla1");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.err.println("Ocorreu um erro ao tentar ler o teclado");

		}
   }
 
}