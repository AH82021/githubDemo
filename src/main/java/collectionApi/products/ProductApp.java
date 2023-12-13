package collectionApi.products;

import java.util.List;

public class ProductApp {
    public static void main(String[] args) {

        ProductServiceImpl productService = new ProductServiceImpl();

        Product book = new Product(1,"Java",49.89);
        Product pc = new Product(23,"Windows",400.89);
        Product mac= new Product(26,"Mac",3449.89);
        //add product
        productService.addProduct(book);
        productService.addProduct(pc);

        //print product list
        displayProducts(productService.getProducts());
        System.out.println("++++++++++++++++++++++++++++++++++++++");

        //update product
        productService.updateProductById(23,mac);

        displayProducts(productService.getProducts());
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        //remove product
        productService.removeProduct(book);
        displayProducts(productService.getProducts());



    }

    static void displayProducts(List<Product> productList){
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
