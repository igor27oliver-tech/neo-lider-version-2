package model;

public class Item {
    private String name;
    private String description;
    private int id;
    private String category;
    private int quantity;

    public Item(String name, String description, int id, String category,int quantity) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.category = category;
        this.quantity = quantity;
    }
   public Item (){
        name = "";
        description = "";
        id = 0;
        category = "";
        quantity = 0;
   }
    public String getName() {return name;}
    public String getDescription() {return description;}
    public int getId() {return id;}
    public String getCategory() {return category;}
    public int getQuantity() {return quantity;}
    public int setQuantity(int quantity) {this.quantity = quantity;
        return quantity;
    }



    @Override

    public String toString() {
        return "ID: " + id +
                " | Nome: " + name +
                " | Quantidade: " + quantity +
                " | Descriçao: " + description +
                " | Categoria: " + category;

    }
}