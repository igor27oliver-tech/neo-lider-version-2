
import java.util.Scanner;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Login {
    User user = new User(); // Cria um objeto User para armazenar os dados do usuário
    User [] users = { // Array de usuários pré-definidos bem simples futuramente será um banco de dados
        new User ("adriano@gmail.com","Adriano", "1234", "admin",001),new User ("bruno@gmail.com","Bruno", "2345", "qualidade",002),new User("carla@gmail.com","Carla", "3456", "estoque",003),new User ("daniel@gmail.com","Daniel", "4567", "requisicoes",004) // o primeiro valor é o email o segundo é o nome, o terceiro a senha, o quarto o setor e o quinto o id
        };
    public void validar () {
        String email_user = JOptionPane.showInputDialog ("Digite seu email:");
        String senha = JOptionPane.showInputDialog ("digite sua senha:");
        boolean autenticado = false;
        int userId = 0;
        for (User u : users) {
            if (u.email.equals (email_user) && u.senha.equals (senha)){
                autenticado = true;
                userId = u.id; // armazena o id do usuario, daqui sera encaminhado qual açoes e acesso o usuario tera
                break;
            }
        }
        
        if (autenticado) {
            JOptionPane.showMessageDialog (null,"Login efetuado com sucesso! Seu ID de usuario é: " + userId);
        } else {
            JOptionPane.showMessageDialog (null,"Login ou senha incorretos. Tente novamente.");
        }
        
        switch (userId) {
            case 1:
                // Ações para o usuário do setor admin
                JOptionPane.showMessageDialog (null,"encaminhado para setor admin");
                Setores setores = new Setores();
                setores.acessar_adm();
                
                break;
            case 2:
                JOptionPane.showMessageDialog (null,"encaminhado para setor qualidade");
                Setores setores_qualidade = new Setores();
                setores_qualidade.acessar_qualidade();
                break;
            case 3:
                 JOptionPane.showMessageDialog (null,"encaminhado para setor estoque");
                break;
            case 4:
                    JOptionPane.showMessageDialog (null,"encaminhado para setor requisições");
                // Ações para o usuário do setor requisições
                break;
            default:
                // Ações para usuário não reconhecido
                break;
        }
    }
}
