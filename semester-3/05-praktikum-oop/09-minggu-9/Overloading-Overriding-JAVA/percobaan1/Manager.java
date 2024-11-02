public class Manager extends Karyawan {
    private double tunjangan;
    private String bagian;
    private Staff staffs[];

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public void setStaffs(Staff[] st) {
        this.staffs = st;
    }

    public void viewStaff() {
        System.out.println("----------------------------");
        for (int i = 0; i < staffs.length; i++) {
            staffs[i].lihatInfo();
        }
        System.out.println("----------------------------");
    }

    public void lihatInfo() {
        System.out.printf(
        """
        Manager: %s
        NIP: %s,
        Nama: %s
        Golongan: %s
        Tunjangan: %.0f
        Gaji: %.0f
        Bagian: %s
        """,
        this.getBagian(),
        this.getNip(),
        this.getNama(),
        this.getGolongan(),
        this.getTunjangan(),
        this.getGaji(),
        this.getBagian()
        );
    }

    public double getGaji() {
        return super.getGaji() + this.tunjangan;
    }
}
