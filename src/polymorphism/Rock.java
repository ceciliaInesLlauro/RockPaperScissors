package polymorphism;

class Rock implements Play {
    public int versus(Play opponent) {
        return opponent.versusRock();
    }

    @Override
    public int versusPaper() {
        return -1;
    }

    @Override
    public int versusScissors() {
        return 1;
    }

    @Override
    public String toString() {
        return "Rock";
    }
}