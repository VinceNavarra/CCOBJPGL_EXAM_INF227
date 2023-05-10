interface Tourist {

    int budget = 0;

    void visit();

    void visit(CagayanValley cagayanValley);

    void visit(Boracay boracay);

    void visit(Cebu cebu);

    void visit(Isabela isabela);

    void visit(Romblon romblon);

    void visit(Palawan palawan);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    }

    void checkBudget();
}