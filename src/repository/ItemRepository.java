package repository;

import model.Item;

import java.util.ArrayList;

public class ItemRepository {
    private ArrayList<Item> itemList = new ArrayList<>();
    public ItemRepository(){
        // ===== AÇO =====
        //ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(new Item("Chapa Aço 2mm", "Chapa aço carbono 2mm", 1, "ACO", 150));
        itemList.add(new Item("Chapa Aço 3mm", "Chapa aço carbono 3mm", 2, "ACO", 120));
        itemList.add(new Item("Barra Aço 1/2", "Barra redonda aço carbono", 3, "ACO", 90));
        itemList.add(new Item("Tubo Galvanizado 2pol", "Tubo aço galvanizado", 4, "ACO", 60));
        itemList.add(new Item("Perfil U 4m", "Perfil estrutural aço", 5, "ACO", 45));
        itemList.add(new Item("Cantoneira 1pol", "Cantoneira aço estrutural", 6, "ACO", 70));

        // ===== PLÁSTICO =====
        itemList.add(new Item("Resina PEBD", "Polietileno baixa densidade", 7, "PLASTICO", 500));
        itemList.add(new Item("Resina PEAD", "Polietileno alta densidade", 8, "PLASTICO", 380));
        itemList.add(new Item("Resina PP", "Polipropileno industrial", 9, "PLASTICO", 420));
        itemList.add(new Item("Masterbatch Preto", "Pigmento concentrado preto", 10, "PLASTICO", 200));
        itemList.add(new Item("Filme Tubular 30cm", "Filme plástico industrial", 11, "PLASTICO", 150));
        itemList.add(new Item("Filme Folha 40cm", "Filme folha tratada", 12, "PLASTICO", 130));

        // ===== FERRAMENTAS =====
        itemList.add(new Item("Parafuso 10mm", "Parafuso sextavado aço", 13, "FERRAMENTA", 1500));
        itemList.add(new Item("Porca 10mm", "Porca zincada", 14, "FERRAMENTA", 1800));
        itemList.add(new Item("Arruela 10mm", "Arruela aço carbono", 15, "FERRAMENTA", 2000));
        itemList.add(new Item("Chave Inglesa", "Ferramenta ajuste manual", 16, "FERRAMENTA", 30));
        itemList.add(new Item("Alicate Universal", "Ferramenta manual", 17, "FERRAMENTA", 45));
        itemList.add(new Item("Martelo 1kg", "Martelo aço forjado", 18, "FERRAMENTA", 35));
        itemList.add(new Item("Furadeira Industrial", "Furadeira elétrica 220V", 19, "FERRAMENTA", 12));

        // ===== EPI =====
        itemList.add(new Item("Capacete Segurança", "Capacete classe B", 20, "EPI", 80));
        itemList.add(new Item("Luva Raspa", "Luva proteção solda", 21, "EPI", 300));
        itemList.add(new Item("Óculos Proteção", "Proteção contra partículas", 22, "EPI", 200));
        itemList.add(new Item("Protetor Auricular", "Proteção auditiva", 23, "EPI", 250));
        itemList.add(new Item("Botina Biqueira Aço", "Calçado segurança", 24, "EPI", 95));
        itemList.add(new Item("Máscara Respiratória", "Máscara filtrante PFF2", 25, "EPI", 400));

        // ===== MANUTENÇÃO =====
        itemList.add(new Item("Motor Elétrico 5CV", "Motor trifásico industrial", 26, "MANUTENCAO", 10));
        itemList.add(new Item("Motor Elétrico 10CV", "Motor trifásico pesado", 27, "MANUTENCAO", 6));
        itemList.add(new Item("Rolamento 6205", "Rolamento industrial", 28, "MANUTENCAO", 150));
        itemList.add(new Item("Correia A-45", "Correia transmissão industrial", 29, "MANUTENCAO", 75));
        itemList.add(new Item("Sensor Temperatura", "Sensor digital industrial", 30, "MANUTENCAO", 40));
        itemList.add(new Item("Inversor Frequência", "Controle motor elétrico", 31, "MANUTENCAO", 8));

        // ===== PRODUTO FINAL =====
        itemList.add(new Item("Produto Final A", "Peça finalizada modelo A", 32, "PRODUTO_FINAL", 220));
        itemList.add(new Item("Produto Final B", "Peça finalizada modelo B", 33, "PRODUTO_FINAL", 180));
        itemList.add(new Item("Produto Final C", "Peça finalizada modelo C", 34, "PRODUTO_FINAL", 140));

        // ===== PRODUTO EXTERNO / EMBALAGEM =====
        itemList.add(new Item("Embalagem Plástica", "Saco plástico industrial", 35, "PRODUTO_EXTERNO", 600));
        itemList.add(new Item("Caixa Papelão Reforçada", "Caixa transporte pesado", 36, "PRODUTO_EXTERNO", 450));
        itemList.add(new Item("Etiqueta Identificação", "Etiqueta código barras", 37, "PRODUTO_EXTERNO", 1200));
        itemList.add(new Item("Stretch Film", "Filme stretch paletização", 38, "PRODUTO_EXTERNO", 300));
    }

    public ArrayList<Item> getItems() {
        return itemList;
    }
    public  void setItems(ArrayList<Item> items) {
        this.itemList = items;
    }



}


