package CustomException;

public class ProductService {
    void findProduct(int productId){
        if(productId!=101){
            throw new ProductNotFoundException("Product Not found");
        }
        System.out.println("Product found");
    }
}
