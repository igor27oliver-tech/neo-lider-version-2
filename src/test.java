import database.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class test {

    public static void main(String[] args) throws SQLException {



        Connection conn = ConnectionFactory.getConnection();

        if(conn != null){
            System.out.println("Conectado com sucesso!");
        }

    }
}