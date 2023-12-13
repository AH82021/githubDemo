package collectionApi.products;

import java.util.ArrayList;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private final List<Product> products;

    public ProductServiceImpl() {
        this.products = new ArrayList<>();
    }

    @Override
    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public void removeProduct(Product product) {
  if(products.remove(product)){
      System.out.println("product removed successfully ");
  }else System.out.println("product not found ");
    }

    @Override
    public void updateProductById(int id, Product product) {

        for (Product p : products) {
            if(p.getProductId() == id){
                p.setProductName(product.getProductName());
                p.setProductPrice(product.getProductPrice());
                System.out.println("product updated successfully ");
            }
        }
    }
}
