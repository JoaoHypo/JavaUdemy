package entities;

public class Produto {

    public String name;
    public double price;
    public int quanty;

    public double totalValueInStock(){
        return quanty*price;
    }
    public void addProducts(int x){
        quanty+=x;
    }
    public void removeProducts(int x){
        quanty-=x;
    }
    public void returnData(){
        System.out.println("------ DATA ------");
        System.out.printf("Produto: %s%n",name);
        System.out.printf("Preço da unidade: %.2f%n",price);
        System.out.printf("Quantidade em estoque: %d%n",quanty);
        System.out.printf("Valor do estoque: %.2f%n%n",totalValueInStock());
    }
}
