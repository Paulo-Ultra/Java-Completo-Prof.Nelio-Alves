package sobrecarga.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

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