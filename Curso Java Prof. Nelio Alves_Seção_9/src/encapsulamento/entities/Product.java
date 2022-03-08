package encapsulamento.entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    //Construtor padrão, uma sobrecarga a mais com esse construtor padrão para poder usar todos os parâmetros.
    public Product() {
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        //quantity = 0; ou this.quantity = quantity;  ------------------- Aqui como o parâmetro é default aqui é opcional o this ou a atribuição.
    }

    //Por convenção se usa os getters e setters depois dos construtores
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Não se cria o set de quantity, porque como regra de negócio já há um método que altera esse atributo, e também para proteger o objeto produto de alterações de quantidades inconsistentes
    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
