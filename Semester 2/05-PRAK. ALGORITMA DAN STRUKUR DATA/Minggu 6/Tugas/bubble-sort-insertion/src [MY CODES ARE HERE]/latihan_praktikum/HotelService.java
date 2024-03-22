package latihan_praktikum;

import java.text.NumberFormat;
import java.util.Locale;

public class HotelService {
    Hotel allHotels[] = new Hotel[13];

    static NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

    void tambah(Hotel h) {
        for (int i = 0; i < allHotels.length; i++) {
            if (allHotels[i] == null) {
                allHotels[i] = h;
                break;
            }
        }

        boolean isFull = true;
        for (Hotel hotel : allHotels) {
            if (hotel == null) {
                isFull = false;
                break;
            }
        }

        if (isFull) {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampilAll() {
        for (Hotel hotel : allHotels) {
            if (hotel != null) {
                System.out.println(
                    "- Hotel : " + hotel.nama + 
                    "\n- Kota : " + hotel.kota + 
                    "\n- Harga : " + currencyFormat.format(hotel.harga) + 
                    "\n- Bintang : " + hotel.bintang +
                    "\n==============================================="
                );
            }
        }
    }

    void bubbleSort() {
        // Bubble sort untuk mengurutkan harga dari termurah ke tertinggi
        for (int i = 0; i < allHotels.length - 1; i++) {
            for (int j = 1; j < allHotels.length - i; j++) {
                if (allHotels[j] != null && allHotels[j - 1] != null) {
                    if (allHotels[j].harga < allHotels[j - 1].harga) {
                        Hotel temp = allHotels[j];
                        allHotels[j] = allHotels[j - 1];
                        allHotels[j - 1] = temp;
                    }
                }
            }
        }
    }

    void selectionSort() {
        // Selection sort untk mengurutkan rating bintang tertinggi ke terendah
        for (int i = 1; i < allHotels.length; i++) {
            if (allHotels[i] != null) {
                Hotel temp = allHotels[i];
                int j = i;
                while (j > 0 && allHotels[j - 1].bintang < temp.bintang) {
                    allHotels[j] = allHotels[j - 1];
                    j--;
                }
                allHotels[j] = temp;
            }
        }
    }
}
