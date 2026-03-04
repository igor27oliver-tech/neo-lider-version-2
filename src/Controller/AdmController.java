package Controller;

import model.Cargo;
import service.ItemService;
import service.UserService;

import javax.swing.*;

public class AdmController {

    private final ItemService itemService;
    private final UserService userService;

    public AdmController(ItemService itemService, UserService userService) {
        this.itemService = itemService;
        this.userService = userService;
    }

    public void menu() {

        String area = JOptionPane.showInputDialog(
                null,
                "=== MENU ADMINISTRADOR ===\n\n" +
                        "1 - Gerenciar Usuários\n" +
                        "2 - Gerenciar Estoque",
                "Menu ADM",
                JOptionPane.PLAIN_MESSAGE
        );

        if (area == null) return;

        switch (area) {
            case "1" -> menuUsuarios();
            case "2" -> menuEstoque();
            default -> JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
    }

    // ========================= USUÁRIOS =========================

    private void menuUsuarios() {

        String opcao = JOptionPane.showInputDialog(
                null,
                "=== GERENCIAR USUÁRIOS ===\n\n" +
                        "1 - Adicionar usuário\n" +
                        "2 - Excluir usuário\n" +
                        "3 - Listar usuários\n" +
                        "4 - Buscar por ID\n" +
                        "5 - Listar por Cargo",
                "Usuários",
                JOptionPane.PLAIN_MESSAGE
        );

        if (opcao == null) return;

        switch (opcao) {

            case "1" -> adicionarUsuario();

            case "2" -> excluirUsuario();

            case "3" ->
                    JOptionPane.showMessageDialog(null, userService.listaUser());

            case "4" -> buscarUsuarioPorId();

            case "5" -> listarPorCargo();

            default ->
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
    }

    private void adicionarUsuario() {

        String nome = JOptionPane.showInputDialog("Nome:");
        String senha = JOptionPane.showInputDialog("Senha:");

        Cargo cargo = (Cargo) JOptionPane.showInputDialog(
                null,
                "Escolha o cargo:",
                "Cargo",
                JOptionPane.QUESTION_MESSAGE,
                null,
                Cargo.values(),
                Cargo.values()[0]
        );

        int id = lerInteiro("ID:");

        if (cargo == null) return;

        userService.addUser(nome, senha, cargo, id);
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
    }

    private void excluirUsuario() {

        int id = lerInteiro("ID do usuário:");
        userService.excluirUser(id);
    }

    private void buscarUsuarioPorId() {

        int id = lerInteiro("Digite o ID:");
        String resultado = userService.buscarId(id);
        JOptionPane.showMessageDialog(null, resultado);
    }

    private void listarPorCargo() {

        Cargo cargo = (Cargo) JOptionPane.showInputDialog(
                null,
                "Escolha o cargo:",
                "Cargo",
                JOptionPane.QUESTION_MESSAGE,
                null,
                Cargo.values(),
                Cargo.values()[0]
        );

        if (cargo != null) {
            JOptionPane.showMessageDialog(null, userService.listaSetor(cargo));
        }
    }

    // ========================= ESTOQUE =========================

    private void menuEstoque() {

        String opcao = JOptionPane.showInputDialog(
                null,
                "=== GERENCIAR ESTOQUE ===\n\n" +
                        "1 - Adicionar item\n" +
                        "2 - Excluir item\n" +
                        "3 - Listar estoque",
                "Estoque",
                JOptionPane.PLAIN_MESSAGE
        );

        if (opcao == null) return;

        switch (opcao) {

            case "1" -> adicionarItem();

            case "2" -> excluirItem();

            case "3" ->
                    JOptionPane.showMessageDialog(null, itemService.listarEstoque());

            default ->
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
    }

    private void adicionarItem() {

        String nome = JOptionPane.showInputDialog("Nome do item:");
        String descricao = JOptionPane.showInputDialog("Descrição:");
        int id = lerInteiro("ID:");
        int quantidade = lerInteiro("Quantidade:");

        itemService.addItem(nome, descricao, id, quantidade);
        JOptionPane.showMessageDialog(null, "Item adicionado com sucesso!");
    }

    private void excluirItem() {

        String nome = JOptionPane.showInputDialog("Nome do item:");
        itemService.excluirItem(nome);
    }

    // ========================= MÉTODO AUXILIAR =========================

    private int lerInteiro(String mensagem) {

        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensagem);
                if (input == null) return 0;
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números!");
            }
        }
    }
}