class PenCreator extends ProductCreator {
    @Override
    public Product createProduct() {
        return new Pen();
    }
}
