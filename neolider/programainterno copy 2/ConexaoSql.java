import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

class ConexaoSql {

    public static void consultarDados() { // Método para consultar dados do banco de dados
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Carrega o driver JDBC

            Connection conn = DriverManager.getConnection( // Estabelece a conexão com o banco de dados
                    "jdbc:mysql://localhost:3306/neolider_db",
                    "root",
                    "Machado98@"
            );

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM relatoriosQualidade");// Prepara a consulta SQL

            ResultSet rs = stmt.executeQuery();

            // Criar modelo da tabela
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Setor");
            modelo.addColumn("Responsável");
            modelo.addColumn("Operador");
            modelo.addColumn("Produto Especionado");
            modelo.addColumn("Qualidade");

            // Preencher as linhas
            while (rs.next()) {
                Object[] linha = {
                    rs.getString("setor"),
                    rs.getString("responsavel"),
                    rs.getString("operador"),
                    rs.getString("produto_especionado"),
                    rs.getInt("qualidade_produto")
                };
                modelo.addRow(linha);
            }

            JTable tabela = new JTable(modelo);
            JScrollPane scrollPane = new JScrollPane(tabela);

            JFrame frame = new JFrame("Consulta de Estoque");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(800, 400);
            frame.add(scrollPane);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(),
                    "Erro ao Consultar", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}