package repository;

import database.ConnectionFactory;
import model.Cargo;
import model.User;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public List<User> getUserList() {

        List<User> users = new ArrayList<>();

        try {

            Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            while (rs.next()) {

                User user = new User(
                        rs.getString("nome"),
                        rs.getString("senha"),
                        Cargo.valueOf(rs.getString("cargo")),
                        rs.getInt("id")
                );

                users.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;
    }

    public void addUser(User user) {

        try {

            Connection conn = ConnectionFactory.getConnection();

            String sql = "INSERT INTO users (nome, senha, cargo, id) VALUES (?, ?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getSenha());
            stmt.setString(3, user.getCargo().name());
            stmt.setInt(4, user.getId());

            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void deleteUser(int id) {

        try {

            Connection conn = ConnectionFactory.getConnection();

            String sql = "DELETE FROM users WHERE id = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}