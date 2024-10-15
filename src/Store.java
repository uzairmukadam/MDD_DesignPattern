public class Store {
    public static void main(String[] args) {
        ProductCreator penCreator = new PenCreator();
        penCreator.sellProduct();

        ProductCreator pencilCreator = new PencilCreator();
        pencilCreator.sellProduct();
    }
}
