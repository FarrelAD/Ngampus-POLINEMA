package latihan_praktikum;

public class MainShowroom {
    public static void main(String[] args) {
        Showroom[] dataCar = new Showroom[8];

        // Proses input
        dataCar[0] = new Showroom("BMW", "M2 Coupe", 2016, 6816, 728);
        dataCar[1] = new Showroom("FORD", "Fiesta ST", 2014, 3921, 575);
        dataCar[2] = new Showroom("Nissan", "370Z", 2009, 4360, 657);
        dataCar[3] = new Showroom("Subaru", "BRZ", 2014, 4058, 609);
        dataCar[4] = new Showroom("Subaru", "Impreza WRX STI", 2013, 6255, 703);
        dataCar[5] = new Showroom("Toyota", "AE86 Trueno", 1986, 3700, 553);
        dataCar[6] = new Showroom("Toyota", "86/GT86", 2014, 4180, 609);
        dataCar[7] = new Showroom("Volkswagen", "Golf GTI", 2014, 4180, 631);

        // Data top_acceleration
        int[] topAcceleraData = new int[dataCar.length];
        for (int i = 0; i < topAcceleraData.length; i++) {
            topAcceleraData[i] = dataCar[i].top_acceleration;
        }

        // Data top_power
        int[] allTopPower = new int[dataCar.length];
        for (int i = 0; i < allTopPower.length; i++) {
            allTopPower[i] = dataCar[i].top_power;
        }

        // Proses output
        System.out.println(
            "Top Acceleration tertinggi (DIVIDE AND CONQUER): " + cariTopAccelerationTertinggi(topAcceleraData, 0, topAcceleraData.length - 1) + "\n" +
            "Top Acceleration terendah (DIVIDE AND CONQUER): " + cariTopAccelerationTerendah(topAcceleraData, 0, topAcceleraData.length - 1) + "\n" +
            "Rata-rata top power (BRUTE FORCE) : " + hitungRataRataTopPower(allTopPower)
        );
    }

    static int cariTopAccelerationTertinggi(int topAccelera[], int l, int r) {
        if (l == r) {
            return topAccelera[l];
        } else {
            int mid = (l + r) / 2;
            int lTop = cariTopAccelerationTertinggi(topAccelera, l, mid);
            int rTop = cariTopAccelerationTertinggi(topAccelera, mid + 1, r);
            if (lTop > rTop) {
                return lTop;
            } else {
                return rTop;
            }
        }
    }

    static int cariTopAccelerationTerendah(int topAccelera[], int l, int r) {
        if (l == r) {
            return topAccelera[l];
        } else {
            int mid = (l + r) / 2;
            int lTop = cariTopAccelerationTerendah(topAccelera, l, mid);
            int rTop = cariTopAccelerationTerendah(topAccelera, mid + 1, r);
            if (lTop < rTop) {
                return lTop;
            } else {
                return  rTop;
            }
        }
    }

    static double hitungRataRataTopPower(int topPower[]) {
        int totalPower = 0;
        for (int i : topPower) {
            totalPower += i;
        }

        return totalPower / topPower.length;
    }
}
