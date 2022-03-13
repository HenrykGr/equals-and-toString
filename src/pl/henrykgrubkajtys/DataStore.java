package pl.henrykgrubkajtys;

class DataStore {
    private static final int MAX_COMPUTERS = 100;
    private Computer[] computers = new Computer[MAX_COMPUTERS];
    private int computerNumbers = 0;

    void addComputer(Computer computer) {
        if (computerNumbers < MAX_COMPUTERS) {
            computers[computerNumbers] = computer;
            computerNumbers++;
        } else
            System.out.println("Brak miejsca w magazynie");
    }

    public Computer[] getComputers() {
        Computer[] comps = new Computer[computerNumbers];
        for (int i = 0; i < computerNumbers; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }

    public int checkAvailability (Computer computer) {
        int identical = 0;
        for (int i = 0; i < computerNumbers; i++) {
            if (computer.equals(computers[i])) {
                identical++;
        }
        }
        return identical;
    }

}
