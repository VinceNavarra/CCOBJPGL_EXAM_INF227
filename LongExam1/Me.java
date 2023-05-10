public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(CagayanValley cagayanvalley) {
        if (budget < cagayanvalley.airFare) {
            System.out.println("bawi ka next layf pang cagayanvalley");

        } else {
            System.out.println("eyy may pang cagayanvalley kana");
            budget = budget - cagayanvalley.airFare;
        }
        checkBudget();

    }

    public void visit(Boracay boracay) {
        if (budget < boracay.airFare) {
            System.out.println("di mo afford mag Boracay!");

        } else {
            System.out.println("Bangis Boracay");
            budget = budget - boracay.airFare;
        }
        checkBudget();
    }

    public void visit(Cebu cebu) {
        if (budget < cebu.airFare) {
            System.out.println("Cant Afford");

        } else {
            System.out.println("hello cebu! I'm here!");
            budget = budget - cebu.airFare;
        }
        checkBudget();

    }

    public void visit(Isabela isabela) {

        if (budget < isabela.airFare) {
            System.out.println("Kulang ang pamasahe ko pa Isabela!");

        } else {
            System.out.println("Ganda ng falls dito sa Isabela!");
            budget = budget - isabela.airFare;
        }
        checkBudget();
    }

    public void visit(Romblon romblon) {

        if (budget < romblon.airFare) {
            System.out.println("Nagastos ko ang ipon ko for Romblon :((");

        } else {
            System.out.println("Ganda so much here sa Romblon");
            budget = budget - romblon.airFare;
        }
        checkBudget();

    }

    public void visit(Palawan palawan) {

        if (budget < palawan.airFare) {
            System.out.println("Cenxia kana di mo pa afford palawan!");

        } else {
            System.out.println("Palawan here i come!");
            budget = budget - palawan.airFare;
        }
        checkBudget();

    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);

    }
}
