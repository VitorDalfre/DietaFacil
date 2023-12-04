package dietafacil.ui;

import dietafacil.modelo.Alimento;
import dietafacil.service.ConsultaAlimentoService;

import java.util.Scanner;

public class ConsultaAlimentoUI {

    private final ConsultaAlimentoService consultaAlimentoService;

    public ConsultaAlimentoUI() {
        consultaAlimentoService = new ConsultaAlimentoService();
    }

    public void consultar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do Alimento que deseja consultar: ");
        String descricao = sc.nextLine();

        Alimento alimentoConsultado = consultaAlimentoService.consultarPorDescricao(descricao);
        System.out.println(alimentoConsultado.toString());
    }
}
