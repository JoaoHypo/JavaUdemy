package entities;

public class Produto {

    public String name;
    public double price;
    public int quantity; //by default java starts its normal
                         // types with some pre-set default values

    public Produto(){ //constructor
    }

    public Produto(String name,double price,int quantity){ //constructor
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //overload
    public Produto(String name,double price){ //constructor
        this.name = name;
        this.price = price;
    }

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
    //@Override
    public String toString(){

        return "------ TOO STRING DATA ------\nProduto: "
            + name
            + "\nPreço da unidade: R$ $ "
            + String.format("%.2f", price)
            + "\nQuantidade em estoque: "
            + quantity
            + "\nValor do estoque: R$ $"
            + String.format("%.2f", totalValueInStock());
    }

}
