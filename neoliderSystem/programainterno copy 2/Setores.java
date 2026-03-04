
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

// classe serve para açoes de cada setor, cada um tera um nivel de acesso diferente
    // o admin tera acesso total ao sistema
    // o setor de qualidade tera acesso a relatórios e controle de qualidade
    // o setor de estoque tera acesso ao controle de estoque e inventario
    // o setor de requisições tera acesso a fazer requisições de materiais e suprimentos
    

public class Setores { 
 public void acessar_adm () {
    JOptionPane.showMessageDialog (null,"Bem vindo ao setor Admin, você tem acesso total ao sistema.");
    String actionInput = JOptionPane.showInputDialog ("Digite a ação que deseja realizar: 1-  gerenciar usuarios / 2 - ver relatorios qualidade / 3 - controlar estoque /4 -  fazer requisicoes");
    int action = Integer.parseInt(actionInput);
    switch (action) {
        case 1:
             JOptionPane.showMessageDialog (null,"gerenciar usuarios");
            // código para gerenciar usuários
            break;
        case 2 :
            JOptionPane.showMessageDialog(null,"ver relatorios qualidade");
            ConexaoSql conexao = new ConexaoSql();
            conexao.consultarDados();
            break;
        case 3:
            JOptionPane.showMessageDialog (null, "controlar estoque");
            // código para controlar estoque
            break;
        case 4:
             JOptionPane.showMessageDialog(null,"fazer requisicoes");
            // código para fazer requisições
            break;
        default:
            JOptionPane.showMessageDialog (null,"Ação inválida.");
            break;
    }}
public void acessar_qualidade () {
    JOptionPane.showMessageDialog (null,"Bem vindo ao setor Qualidade, você tem acesso aos relatórios de qualidade.");
     String action_select = JOptionPane.showInputDialog(null,"digite a açao que deseja 1 -  ver ralatorios, 2 editar relatorios:");
    switch (action_select) {
        case "1":
            ConexaoSql conexao = new ConexaoSql();
            conexao.consultarDados();
            
            break;
        case "2":
            JOptionPane.showMessageDialog (null,"editar relatorios");
            // código para editar relatórios
            break;
        default:
            throw new AssertionError();
    }

}
}

