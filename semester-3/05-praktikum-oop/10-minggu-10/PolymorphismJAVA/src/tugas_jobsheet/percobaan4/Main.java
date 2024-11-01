package tugas_jobsheet.percobaan4;

import tugas_jobsheet.percobaan1.*;

public class Main {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        ow.pay(eBill);
        System.out.println("------------------------------");

        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        ow.pay(pEmp);
        System.out.println("------------------------------");

        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ow.showMyEmployee(iEmp);
        System.out.println("------------------------------");
        ow.showMyEmployee(iEmp);
    }
}
