package praktikum7;

public class Main {
    public static void main(String[] args) {
        Mac m2 = new Mac(
            "Apple", 
            "Intel", 
            200, 
            20, 
            "Lithium Polymer", 
            "Good");

        Windows w10 = new Windows(
            "MSI Predator", 
            "Apple Silicon", 
            300, 
            1000, 
            "Baterai ABC", 
            "Gamer friendly, anti-peluru");
            
        Pc gaming = new Pc(
            "PC11", 
            "AMD Hore", 
            2402, 
            32, 
            16);

        m2.tampilMac();
        System.out.println("");
        w10.tampilWindows();
        System.out.println("");
        gaming.tampilPc();
    }
}
