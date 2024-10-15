abstract class ProductCreator {
    public abstract Product createProduct();

    public void sellProduct() {
        Product product = createProduct();
        product.sell();
    }
}
