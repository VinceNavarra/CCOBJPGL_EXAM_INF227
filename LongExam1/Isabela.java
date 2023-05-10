public class Isabela implements Locations {

    int airFare = 189;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
