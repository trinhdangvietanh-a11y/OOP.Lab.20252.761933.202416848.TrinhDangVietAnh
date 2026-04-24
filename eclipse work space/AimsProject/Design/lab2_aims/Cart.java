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
}
