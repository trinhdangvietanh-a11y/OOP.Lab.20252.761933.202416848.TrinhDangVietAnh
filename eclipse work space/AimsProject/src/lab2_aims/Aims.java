package lab2_aims;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Simba", 
                "Animation", "Roger Steve", 87, 20f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Fall", 
                "Science Fiction", "George II", 87, 20f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Alibaba", 
                "Animation", "Aladin", 87, 20.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());
        
        //11
        anOrder.removeDigitalVideoDisc(dvd2);
     
        System.out.println("Total Cost after removing Star Fall is: ");
        System.out.println(anOrder.totalCost());
        
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("HIHI", "Sci-Fi", "HAHA", 100, 20.0f);
        anOrder.removeDigitalVideoDisc(dvd4);

        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());
    }
}