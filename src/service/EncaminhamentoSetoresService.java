package service;

import Controller.AdmController;
import model.Cargo;

public class EncaminhamentoSetoresService {

    private AdmController admController;

    public EncaminhamentoSetoresService(AdmController admController) {
        this.admController = admController;
    }

    public void redirect(Cargo cargo) {

        if (cargo == null) {
            System.out.println("Usuário ou senha inválidos");
            return;
        }

        switch (cargo) {
            case ESTOQ:
                menuEstoq();
                break;
            case PCP:
                menuPcp();
                break;
            case ADMIN:
                menuAdm();
                break;
            default:
                System.out.println("ERRO");
        }
    }

    private void menuEstoq() {
        System.out.println("Estoque de setores");
    }

    private void menuPcp() {
        System.out.println("PCP do estoque");
    }

    private void menuAdm() {
        admController.menu(); // aqui realmente encaminha
    }
}
