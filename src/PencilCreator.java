class PencilCreator extends ProductCreator {
    @Override
    public Product createProduct() {
        return new Pencil();
    }
}
