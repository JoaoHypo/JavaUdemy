package entities;

public class Produto {

    private String name;
    private double price;
    private int quantity; //by default java starts its normal
                         // types with some pre-set default values

    public Produto(){ //constructor
    }
    //overload
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
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
//    public void setQuantity(int quantity){
//        this.quantity = quantity;
//    } Since we are dealing with a product stock,
//       we need to ensure that only the ''stock''
//       methods are able to manipulate this attribute,
//       in this case, addProducts and removeProducts

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
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
