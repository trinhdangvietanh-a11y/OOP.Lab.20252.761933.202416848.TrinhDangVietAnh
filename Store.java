package lab2_aims;

public class Store {
    public static final int MAX_ITEMS = 100;

    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS];
    private int qty = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (qty < MAX_ITEMS) {
            itemsInStore[qty] = disc;
            qty++;
            System.out.println("The DVD has been added");
        } else {
            System.out.println("Store is full!");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        boolean found = false;

        for (int i = 0; i < qty; i++) {
            if (itemsInStore[i] == disc) {
                for (int j = i; j < qty - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qty - 1] = null;
                qty--;
                found = true;
                System.out.println("The DVD has been removed");
                break;
            }
        }

        if (!found) {
            System.out.println("DVD not found!");
        }
    }

    public void printStore() {
        System.out.println("***************STORE***************");
        for (int i = 0; i < qty; i++) {
            System.out.println(itemsInStore[i]);
        }
        System.out.println("***********************************");
    }
}