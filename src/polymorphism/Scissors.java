package polymorphism;

class Scissors implements Play {
    public int versus(Play opponent) {
        return opponent.versusScissors();
    }

    @Override
    public int versusRock() {
        return -1;
    }

    @Override
    public int versusPaper() {
        return 1;
    }

    @Override
    public String toString() {
        return "Scissors";
    }
}