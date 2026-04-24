package lab2_aims;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) 
        {   
        	itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
            if (qtyOrdered == MAX_NUMBERS_ORDERED)
            {
                System.out.println("The cart is full now");
            }
        }
        
        else  System.out.println("The cart is full");
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int found = -1;
        
        for (int i = 0; i < qtyOrdered; i++) 
        {
            if (itemsOrdered[i] == disc) 
            {
                found = i;
                itemsOrdered[i] = null;
                qtyOrdered--;
                break;
            }
        }

        if (found == -1) {
            System.out.println("The disc was not found in the cart.");
            return;
        }

        for (int i = found; i < qtyOrdered ; i++)
        {
            itemsOrdered[i] = itemsOrdered[i + 1];
        }

        itemsOrdered[qtyOrdered] = null;
    
        System.out.println("The disc has been removed.");
    }
    
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) 
        {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    	
    }
    
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");

        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
        }

        System.out.println("Total cost: " + totalCost());
        System.out.println("*************************************************");
    }
    
    public void searchById(int id) {
        boolean found = false;

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println(itemsOrdered[i]);
                found = true;
            }
        }
    }
    
    public void searchByTitle(String title) {
        boolean found = false;

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println(itemsOrdered[i]);
                found = true;
            }
        }

        if (!found) System.out.println("No matching DVD found!");
    }
}
