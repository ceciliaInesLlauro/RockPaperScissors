package polymorphism;

class Paper implements Play {
    public int versus(Play opponent) {
        return opponent.versusPaper();
    }

    @Override
    public int versusRock() {
        return 1;
    }

    @Override
    public int versusScissors() {
        return -1;
    }

    @Override
    public String toString() {
        return "Paper";
    }
}