package repository;

import database.ConnectionFactory;
import model.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ItemRepository {

    public List<Item> getItems() {
        List<Item> items = new ArrayList<>();

        try {
            Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM estoq");

            while (rs.next()) {
                Item item = new Item(
                        rs.getString("nome"),
                        rs.getString("descricao"),
                        rs.getInt("id"),
                        rs.getString("categoria"),
                        rs.getInt("quantidade")
                );

                items.add(item);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return items;
    }

    public void addItem(Item item) {
        try {
            Connection conn = ConnectionFactory.getConnection();
            System.out.println("Salvando item:");
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getId());
            System.out.println(item.getCategory());
            System.out.println(item.getQuantity());



            String sql = "INSERT INTO estoq (nome, descricao, id, categoria, quantidade) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, item.getName());
            stmt.setString(2, item.getDescription());
            stmt.setInt(3, item.getId());
            stmt.setString(4, item.getCategory());
            stmt.setInt(5, item.getQuantity());

            stmt.executeUpdate();
            int linhas = stmt.executeUpdate();
            System.out.println("Linhas inseridas: " + linhas);
            System.out.println("SALVOU NO BANCO");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteItem(String nome) {
        try {

            Connection conn = ConnectionFactory.getConnection();

            String sql = "DELETE FROM estoq WHERE nome = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1,nome);

            stmt.executeUpdate();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}