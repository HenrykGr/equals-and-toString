package pl.henrykgrubkajtys;

class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        dataStore.addComputer(new Computer("Dell", 786544));
        dataStore.addComputer(new Computer("Dell", 786544));
        dataStore.addComputer(new Computer("Lenovo", 88666));
        dataStore.addComputer(new Computer("Acer", 3445));
        dataStore.addComputer(new Computer("Apple", 4577));

        Computer compToFind = new Computer("Dell", 786544);
        int computersFound = dataStore.checkAvailability(compToFind);
        System.out.println("Liczba komputerów " + compToFind + ": " + computersFound);

        System.out.println("Wszystkie dostępne komputery: ");
        for (Computer c : dataStore.getComputers()) {
            System.out.println(c);
        }
    }
}
