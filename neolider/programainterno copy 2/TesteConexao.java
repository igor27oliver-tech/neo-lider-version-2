package neolider.programainterno;
import java.sql.*;

public class TesteConexao {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/setor_qualidade",
                    "root",
                    "Machado98@"
            );

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM estoque");
            ResultSet rs = stmt.executeQuery();

            System.out.println("\n=== DADOS DO BANCO ===");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + 
                                   " | Material: " + rs.getString("material") + 
                                   " | Setor: " + rs.getString("setor") + 
                                   " | Responsável: " + rs.getString("responsavel"));
            }
            System.out.println("=== FIM ===\n");

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
