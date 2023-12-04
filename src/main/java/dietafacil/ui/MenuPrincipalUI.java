package dietafacil.ui;

import dietafacil.service.ConsultaAlimentoService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipalUI {

    private final CadastroAlimentoUI cadastroAlimentoUI;
    private final ConsultaAlimentoUI consultaAlimentoUI;

    public MenuPrincipalUI() {
        cadastroAlimentoUI = new CadastroAlimentoUI();
        consultaAlimentoUI = new ConsultaAlimentoUI();
    }

    public void opcoes() {
        Scanner sc = new Scanner(System.in);
        int opcaoEscolhida;
        System.out.println(opcoesDoMenu());

        try {
            opcaoEscolhida = sc.nextInt();
            direcionaOpcaoMenu(opcaoEscolhida);
        } catch (NullPointerException | InputMismatchException e) {
            System.out.println("Opção Inválida! \n");
            opcoes();
        }
    }

    private String opcoesDoMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("Escolha uma opção: ").append("\n")
                .append("1 - Cadastrar alimento").append("\n")
                .append("2 - Procurar alimento").append("\n")
                .append("3 - Calcular calorias da Refeicao");

        return menu.toString();
    }

    private void direcionaOpcaoMenu(int opcao) {
        switch (opcao) {
            case 1:
                cadastroAlimentoUI.cadastrar();
                opcoes();
                break;
            case 2:
                consultaAlimentoUI.consultar();
                opcoes();
                break;
            case 3:
                //Calcula Dieta
                break;
            default:
                System.out.println("Opção Inválida! \n");
                opcoes();
                break;
        }
    }
}