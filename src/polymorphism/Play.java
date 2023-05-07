package polymorphism;

interface Play {
    int versus(Play opponent);

    default int versusRock() {
        return 0;
    }

    default int versusPaper() {
        return 0;
    }

    default int versusScissors() {
        return 0;
    }
}