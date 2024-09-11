package Aulas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Item iten1 = new Item("Passaporte de carne de boi", 12.99, 1);
        Item iten2 = new Item("Passaporte de frango", 11.99, 2);
        Item iten3 = new Item("Coca-Cola", 5.99, 3);
        Item iten4 = new Item("Guarana", 4.99, 4);

        Carrinho c = new Carrinho();
        c.adicionarItem(iten2);
        c.adicionarItem(iten1);
        c.adicionarItem(iten3);
        c.adicionarItem(iten3);

        c.removerItem(4);
        c.adicionarItem(iten4);

        c.calcularPreco();

    }
}