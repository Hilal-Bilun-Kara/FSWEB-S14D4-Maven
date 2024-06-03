package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Chocolate("Square",200,"Bitter");
        products[1] = new Coke("Circle",500,"Çikolatalı Coke",3,true);
        products[2] = new Bread("Bakery",100,"Tam Buğday","cinkorn","brown");

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product: products){
            if(product != null){
                product.showDetails();
            }
        }

    }
}