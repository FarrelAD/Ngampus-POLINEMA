import java.util.Scanner;
/**
 * TugasIndividu1
 */
public class TugasIndividu1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String meleeWeapon = "Melee Weapon";
        String rangedWeapon = "Ranged Weapon";
        
        System.out.println("Berapa jarak karakter kamu terhadap musuh : ");
        int jarak = sc.nextInt();

        if (jarak <= 5) {
            System.out.println("Gunakan " + meleeWeapon);  
        } else {
            System.out.println("Gunakan " + rangedWeapon);
        }

    }
}