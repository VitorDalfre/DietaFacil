package dietafacil.ui;

import dietafacil.modelo.Alimento;
import dietafacil.service.AdicionaNovoAlimentoService;

import java.util.Scanner;

public class CadastroAlimentoUI {

    private final AdicionaNovoAlimentoService adicionaNovoAlimentoService;

    public CadastroAlimentoUI() {
        adicionaNovoAlimentoService = new AdicionaNovoAlimentoService();
    }

    public void cadastrar(){
        Alimento alimento = informacoesAlimento();
        adicionaNovoAlimentoService.adicionar(alimento);
    }

    private Alimento informacoesAlimento(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do Alimento que deseja cadastrar: ");
        String descricao = sc.nextLine();

        System.out.println("\nDigite a quantidade de carboidratos em 100g: ");
        double carboidrato = sc.nextDouble();

        System.out.println("\nDigite a quantidade de proteinas em 100g: ");
        double proteina = sc.nextDouble();

        System.out.println("\nDigite a quantidade de gorduras em 100g: ");
        double gordura = sc.nextDouble();

        System.out.println("\nDigite a quantidade de calorias em 100g: ");
        double caloria = sc.nextDouble();

        return new Alimento(descricao,carboidrato,proteina,gordura,caloria);
    }
}
