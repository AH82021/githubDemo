package collectionApi.products;

import java.util.List;

public interface ProductService {
    Product addProduct(Product product);
    List<Product> getProducts();

    void removeProduct(Product product);

    void updateProductById(int id,Product product);



}
