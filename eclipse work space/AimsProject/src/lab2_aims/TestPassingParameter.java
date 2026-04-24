package lab2_aims;

public class TestPassingParameter {

    public static void main(String[] args) {
    	DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle", "Animation", "Unknown", 120, 10.5f);

    	DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella", "Animation", "Disney", 90, 8.0f);
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(DigitalVideoDisc d1, DigitalVideoDisc d2) {
        String temp = d1.getTitle();
        d1.setTitle(d2.getTitle());
        d2.setTitle(temp);
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        
    }
}
