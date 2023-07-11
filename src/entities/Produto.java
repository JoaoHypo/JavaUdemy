package entities;

public class Produto {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return quantity*price;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public void returnData(){
        System.out.println("------ DATA ------");
        System.out.printf("Produto: %s%n",name);
        System.out.printf("Preço da unidade: R$ %.2f%n",price);
        System.out.printf("Quantidade em estoque: %d%n",quantity);
        System.out.printf("Valor do estoque: R$ %.2f%n%n",totalValueInStock());
    }
}
