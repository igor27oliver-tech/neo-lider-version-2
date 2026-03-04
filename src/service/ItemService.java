package service;

import model.Item;
import repository.ItemRepository;

public class ItemService {
    private ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }



    public String listarEstoque() {
        StringBuilder estoque = new StringBuilder();
        for (Item item : itemRepository.getItems()) {
            estoque.append(item.toString())
                    .append("\n");
        }
        return estoque.toString();
    }
    public String filterId (int id){
        StringBuilder estoque = new StringBuilder();
        for (Item item : itemRepository.getItems()) {
            if (item.getId() == id){
                estoque.append(item.toString());
                return  estoque.toString();
            }
        } return null;
    }

    public String filterName(String name) {
        StringBuilder estoque = new StringBuilder();
        for (Item item : itemRepository.getItems()) {
            if (item.getName().toLowerCase().contains(name.toLowerCase())) {
                estoque.append(item.toString());
            }
        }
        return estoque.toString();

    }
    public void addItem(String name, String description, int id, String category,int quantity) {
        itemRepository.getItems().add(new Item(name, description, id, category, quantity));
    }


    public void excluirItem(String name) {
        itemRepository.getItems().removeIf(item -> item.getName().toLowerCase().equals(name.toLowerCase()));
    }

    public void addItem(String nome, String descricao, int id, int qtd) {
    }
}
